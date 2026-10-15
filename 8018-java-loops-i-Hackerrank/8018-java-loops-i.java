/**
 * Problem: Java Loops I
 * Platform: HackerRank (Java Track)
 * Difficulty: Easy
 * Author: Abhishek Pathak (24f2001885)
 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Print first 10 multiples
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        bufferedReader.close();
    }
}
