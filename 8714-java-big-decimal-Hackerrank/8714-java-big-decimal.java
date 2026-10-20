/**
 * Problem: Java BigDecimal
 * Platform: HackerRank (Java Track)
 * Difficulty: Medium
 * Author: Abhishek Pathak (24f2001885)
 */

import java.math.BigDecimal;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Sort descending by numeric value using BigDecimal
        Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                BigDecimal bdA = new BigDecimal(a);
                BigDecimal bdB = new BigDecimal(b);
                return bdB.compareTo(bdA);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
