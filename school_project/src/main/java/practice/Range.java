package practice;

import java.util.Scanner;

public class Range {

    public int doTwoRangesHaveSameValues(int a, int b, int c, int d) {

        int count = 0;

        for (int i = a; i <= b; i++) {
           if(i >= c && i <= d) {
               count++;
           }
        } return count;


    }
}
