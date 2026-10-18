/**
 * Problem: Valid Username Regular Expression
 * Platform: HackerRank (Java Track)
 * Difficulty: Easy
 * Author: Abhishek Pathak (24f2001885)
 */

import java.util.Scanner;

class UsernameValidator {
    /*
     * Regular expression to validate valid usernames:
     * 1. Starts with an alphabetic character: [a-zA-Z]
     * 2. Followed by alphanumeric characters or underscores: [a-zA-Z0-9_]
     * 3. Total length between 8 and 30 characters: {7,29}
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
