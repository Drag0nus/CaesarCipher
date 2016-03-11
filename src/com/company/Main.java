package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String myText = MyFileReader.fileReader("C:\\Test\\TestFile.txt");

        System.out.println(myText);

        String encrypted = CaesarCipher.encryptCaesar(myText);
        System.out.println(encrypted);

        String decrypted = CaesarCipher.decryptCaesar(encrypted);
        System.out.println(decrypted);
    }
}
