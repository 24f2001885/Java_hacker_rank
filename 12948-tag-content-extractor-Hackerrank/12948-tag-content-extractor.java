/**
 * Problem: Tag Content Extractor
 * Platform: HackerRank (Java Track)
 * Difficulty: Medium
 * Author: Abhishek Pathak (24f2001885)
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            Pattern r = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");
            Matcher m = r.matcher(line);
            boolean findMatch = false;
            while (m.find()) {
                System.out.println(m.group(2));
                findMatch = true;
            }
            if (!findMatch) {
                System.out.println("None");
            }
			
			testCases--;
		}
	}
}
