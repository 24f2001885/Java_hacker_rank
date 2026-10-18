/**
 * Problem: Java Regex
 * Platform: HackerRank (Java Track)
 * Difficulty: Medium
 * Author: Abhishek Pathak (24f2001885)
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class MyRegex {
    /*
     * Validates an IPv4 IP address:
     * - zeroTo255 allows numbers from 0-255:
     *   - 0-99: [01]?[0-9][0-9]?
     *   - 100-249: 2[0-4][0-9]
     *   - 250-255: 25[0-5]
     */
    private static final String zeroTo255 = "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])";
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}
