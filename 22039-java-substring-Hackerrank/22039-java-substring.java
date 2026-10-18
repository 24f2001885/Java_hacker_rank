/**
 * Problem: Java Substring
 * Platform: HackerRank (Java Track)
 * Difficulty: Easy
 * Author: Abhishek Pathak (24f2001885)
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
