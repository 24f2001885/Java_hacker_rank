/**
 * Problem: Java Anagrams
 * Platform: HackerRank (Java Track)
 * Difficulty: Easy
 * Author: Abhishek Pathak (24f2001885)
 */

static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
        return false;
    }
    
    char[] charArrayA = a.toLowerCase().toCharArray();
    char[] charArrayB = b.toLowerCase().toCharArray();
    
    java.util.Arrays.sort(charArrayA);
    java.util.Arrays.sort(charArrayB);
    
    return java.util.Arrays.equals(charArrayA, charArrayB);
}
        
        
        // Complete the function
