/**
 * Problem: Java Varargs - Simple Addition
 * Platform: HackerRank (Java Track)
 * Difficulty: Easy
 * Author: Abhishek Pathak (24f2001885)
 */

class Add {
    public void add(int... numbers) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            sb.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb.append("+");
            }
        }
        sb.append("=").append(sum);
        System.out.println(sb.toString());
    }
}
