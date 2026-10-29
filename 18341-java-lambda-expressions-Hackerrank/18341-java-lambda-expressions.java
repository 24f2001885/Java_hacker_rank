/**
 * Problem: Java Lambda Expressions
 * Platform: HackerRank (Java Track)
 * Difficulty: Medium
 * Author: Abhishek Pathak (24f2001885)
 */

// Write your code here
   public PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }
    public PerformOperation isPrime() {
        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(5);
    }
    public PerformOperation isPalindrome() {
        return (int a) -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
    }
}
