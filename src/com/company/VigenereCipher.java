package com.company;

/**
 * Created by Paul on 3/17/2016.
 */
public class VigenereCipher {

    public static final String KEY = "rusin";

    public static String encryptVigenere(String text) {
            char[] chars = text.toCharArray();

            for (int i = 0, j = 0; i < text.length(); i++) {

                char c = chars[i];
                if (c >= 32 && c <= 127) {
                    int x = c - 32 + KEY.charAt(j) % 96;

                    if (x < 0 || x > 96) {
                        x = Math.abs(Math.abs(x) - 96);
                    }
                    j = ++j % KEY.length();
                    chars[i] = (char) (x + 32);
                }
            }
        return new String(chars);
    }


    public static String decryptVigenere(String text) {
        char[] chars = text.toCharArray();

        for (int i = 0, j = 0; i < text.length(); i++) {

            char c = chars[i];
            if (c >= 32 && c <= 127) {
                int x = c - 32 - KEY.charAt(j) % 96;

                if (x < 0 || x > 96) {
                    x = Math.abs(Math.abs(x) - 96);
                }
                j = ++j % KEY.length();
                chars[i] = (char) (x + 32);
            }
        }
        return new String(chars);
    }
}
