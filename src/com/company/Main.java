package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {



        String text = "I have nothing but my honour.";

        String key = "uwotmate";

        System.out.println("XOR:------------------------------");

        VernamCipher vernamCipher = new VernamCipher();

        byte[] encrypted = vernamCipher.encrypt(text, key);

        System.out.println(Arrays.toString(encrypted));

        String decryprted = vernamCipher.decrypt(encrypted, key);

        System.out.println(decryprted);

        System.out.println(Character.BYTES);

        vernamCipher.vernam();




    }
}
