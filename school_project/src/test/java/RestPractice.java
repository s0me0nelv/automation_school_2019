import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestPractice {

    private static RequestSpecification spec;

    @BeforeAll
    public static void init() {
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setProxy("gate.swissre.com", 9443)
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
    }

    @Test
    public void simpleTest() {

        User[] users = given()
                .spec(spec)
                .when()
                .get("users")
                .then()
                .statusCode(200)
                .extract().as(User[].class);

        Post[] posts = given()
                .spec(spec)
                .when()
                .get("posts")
                .then()
                .statusCode(200)
                .extract().as(Post[].class);
        String post = "";
        int postId = 0;
        int userId = 0;

        for (int i = 0; i < posts.length - 1; i++) {
            if (posts[i].getBody().contains("odio fugit voluptatum ducimus earum autem est incidunt")) {
                post = posts[i].getBody();
                postId = posts[i].getUserId();
            }
        }

        for (int i = 0; i < users.length - 1; i++) {
            if (users[i].getName().equals("Chelsey Dietrich")) {
                userId = users[i].getId();
            }
        }
        assertEquals(postId, userId);
    }
}
