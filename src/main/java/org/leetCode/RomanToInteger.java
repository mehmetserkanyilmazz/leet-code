package main.java.org.leetCode;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int sa = 0;
        String s1 = s;
        for (int i = 0; i < s1.length(); i++) {
            if (i < s1.length() - 1) {
                if (s1.charAt(i) == 'I' && s1.charAt(i + 1) == 'V') {
                    sa += 4;
                    i ++;
                    continue;
                }
                if (s1.charAt(i) == 'I' && s1.charAt(i + 1) == 'X') {
                    sa += 9;
                    i ++;
                    continue;
                }
                if (s1.charAt(i) == 'X' && s1.charAt(i + 1) == 'L') {
                    sa += 40;
                    i ++;
                    continue;
                }
                if (s1.charAt(i) == 'X' && s1.charAt(i + 1) == 'C') {
                    sa += 90;
                    i ++;
                    continue;
                }
                if (s1.charAt(i) == 'C' && s1.charAt(i + 1) == 'D') {
                    sa += 400;
                    i ++;
                    continue;
                }
                if (s1.charAt(i) == 'C' && s1.charAt(i + 1) == 'M') {
                    sa += 900;
                    i ++;
                    continue;
                }
            }
            if (s1.charAt(i) == 'I') {
                sa += 1;
                continue;
            }
            if (s1.charAt(i) == 'V') {
                sa += 5;
                continue;
            }
            if (s1.charAt(i) == 'X') {
                sa += 10;
                continue;
            }
            if (s1.charAt(i) == 'L') {
                sa += 50;
                continue;
            }
            if (s1.charAt(i) == 'C') {
                sa += 100;
                continue;
            }
            if (s1.charAt(i) == 'D') {
                sa += 500;
                continue;
            }
            if (s1.charAt(i) == 'M') {
                sa += 1000;
            }
        }

        return sa;
    }
}