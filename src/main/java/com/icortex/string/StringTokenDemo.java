package com.icortex.string;

import java.util.StringTokenizer;

public class StringTokenDemo {
    static String str = "title=java : The complete reference;"+
                        "author=Schildt;"+
                        "publisher=Oracle Press;";

    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer(str,"=;");
        while (stringTokenizer.hasMoreTokens()){
            String key = stringTokenizer.nextToken();
            String val = stringTokenizer.nextToken();
            System.out.println(key + "\t"+val);
        }
    }
}
