package com.company;

/**
 * Created by Paul on 3/11/2016.
 */
public class CaesarCipher {

    public static String encryptCaesar (String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char c = chars[i];
            if (c >= 32 && c <= 127) {

                int x = c - 32;
                x = (x + 13) % 96; //13
                if (x < 0) {
                    x += 96;
                }
                chars[i] = (char) (x + 32);  // + 32
            }
        }
        return new String(chars);
    }

    public static String decryptCaesar(String text) {

        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char c = chars[i];
            if (c >= 32 && c <= 127) {
                int x = c - 32;
                x = (x - 13) % 96;  //13
                if ( x < 0) {
                    x += 96;
                }
                chars[i] = (char) (x + 32);
            }
        }
        return new String(chars);
    }
}
