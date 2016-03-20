package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        //"C:\\Test\\TestFile.txt"
//
//        System.out.println("Enter path to file: ");
//        String myText = MyFileReader.fileReader("C:\\Test\\TestFile.txt");
//
//        System.out.println(myText);
//
//        String encrypted = CaesarCipher.encryptCaesar("AAAAA aaaa BBBB bbbb", 1);
//        System.out.println(encrypted);
//
//        String decrypted = CaesarCipher.decryptCaesar(encrypted, 13);
//        System.out.println(decrypted);


        String encrypt = VigenereCipher.encryptVigenere("I have nothing but my honour! AAAA BBBB SKGDOJOGHET}#OI%P32];2ffffffff");

        System.out.println(encrypt);

        System.out.println(VigenereCipher.decryptVigenere(encrypt));
    }
}
