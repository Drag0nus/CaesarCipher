package com.company;


import java.util.Random;
import java.util.Scanner;

/**
 * Created by Paul on 4/5/2016.
 */
public class VernamCipher {

    public byte[] encrypt(String text, String keyWord) {
        byte[] arr = text.getBytes();
        byte[] keyarr = keyWord.getBytes();
        byte[] result = new byte[arr.length];

        for(int i = 0; i < arr.length; i++) {
            result[i] = (byte) (arr[i] ^ keyarr[i % keyarr.length]);
        }
        return result;
    }
    public String decrypt(byte[] text, String keyWord) {
        byte[] result  = new byte[text.length];
        byte[] keyarr = keyWord.getBytes();
        for(int i = 0; i < text.length;i++) {
            result[i] = (byte) (text[i] ^ keyarr[i% keyarr.length]);
        }
        return new String(result);
    }

    public void vernam () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = scanner.nextLine();

        char[] achText = text.toCharArray();
        char[] achKey = new char[achText.length];
        char[] achResult = new char[achText.length];

        Random random = new Random();

        for (int i = 0; i < achText.length; i++) {
            achKey[i] = (char) random.nextInt(Character.MAX_VALUE);
            achResult[i] = (char) (achText[i] ^ achKey[i]);
        }

        System.out.println("Text: " + String.valueOf(achText));
        System.out.println("Key: " + String.valueOf(achKey));
        System.out.println("Result: " + String.valueOf(achResult));

        char[] achDecrypt = new char[achText.length];

        for (int i = 0; i < achText.length; i++) {
            achDecrypt[i] = (char) (achResult[i] ^ achKey[i]);
        }
        System.out.println("Decrypt: " + String.valueOf(achDecrypt));
    }
}
