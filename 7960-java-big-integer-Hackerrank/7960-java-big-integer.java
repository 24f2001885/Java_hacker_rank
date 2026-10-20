/**
 * Problem: Java BigInteger
 * Platform: HackerRank (Java Track)
 * Difficulty: Easy
 * Author: Abhishek Pathak (24f2001885)
 */

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        BigInteger a= sc.nextBigInteger();
        BigInteger b= sc.nextBigInteger();
        BigInteger sum=a.add(b);
        BigInteger product=a.multiply(b);
        System.out.println(sum);
        System.out.println(product);
        sc.close();
        
        
        
    }
}
