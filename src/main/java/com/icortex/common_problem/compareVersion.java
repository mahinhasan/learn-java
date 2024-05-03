package com.icortex.common_problem;

public class compareVersion {

    public static int compareVersion(String version1, String version2) {
        String[] ch1 = version1.split("\\.");
        String[] ch2 = version2.split("\\.");

        for (int i = 0; i < ch1.length; i++) {
            ch1[i] = ch1[i].replaceFirst("^0*", "");
        }

        for (int i = 0; i < ch2.length; i++) {
            ch2[i] = ch2[i].replaceFirst("^0*", "");
        }

        int i = 0;
        while (i < ch1.length || i < ch2.length) {
            int num1 = i < ch1.length ? Integer.parseInt(ch1[i]) : 0;
            int num2 = i < ch2.length ? Integer.parseInt(ch2[i]) : 0;

            if (num1 < num2)
                return -1;
            else if (num1 > num2)
                return 1;

            i++;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("0.1", "1.1"));
    }
}
