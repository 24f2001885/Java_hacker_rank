/**
 * Problem: Java Stack
 * Platform: HackerRank (Java Track)
 * Difficulty: Medium
 * Author: Abhishek Pathak (24f2001885)
 */

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<Character> stack = new Stack<>();
            boolean balanced = true;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) { balanced = false; break; }
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') || 
                        (ch == '}' && top != '{') || 
                        (ch == ']' && top != '[')) {
                        balanced = false;
                        break;
                    }
                }
            }
            System.out.println(balanced && stack.isEmpty());
		}
		
	}
}
