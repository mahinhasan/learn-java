package com.icortex.string;

public class RemoveCharacter {
    public static void main(String[] args) {
        String originalString = "Hello World";
        char charToRemove = 'o';
        StringBuilder sb = new StringBuilder(originalString);
        for (int i = 0; i < sb.length(); ) {
            if (sb.charAt(i) == charToRemove) {
                sb.deleteCharAt(i);
            } else {
                i++;
            }
        }
        String modifiedString = sb.toString();
        System.out.println(modifiedString);

    }
}
