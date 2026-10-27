/**
 * Problem: Java Exception Handling (Try-catch)
 * Platform: HackerRank (Java Track)
 * Difficulty: Easy
 * Author: Abhishek Pathak (24f2001885)
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    try{
       int x = sc.nextInt();
       int y = sc.nextInt();
       int result = x/y;
       System.out.println(result);
       }
       catch(ArithmeticException e){
            System.out.println(e);
       }
       catch(Exception e){
            System.out.println("java.util.InputMismatchException");
       }
    }
}
