package com.icortex.common_problem.sliding_window;

public class LSWRC {
    public static int lengthOfLongestSubstring(String s) {
        int mx = 0;

        for(int i = 0,j = 0; j < s.length();j++) {
            char ch = s.charAt(j);
            int index = s.indexOf(ch, i);
            System.out.println("Index "+index);
            if (index >= 0 && index < j) {
                i = index + 1;
                System.out.println("I "+i);
            }
            mx = Math.max(mx, j - i + 1);
            System.out.println("Mx "+mx);
        }
        return mx;

    }

    public static void main(String[] args) {
       lengthOfLongestSubstring("bbbbb");
    }
}
