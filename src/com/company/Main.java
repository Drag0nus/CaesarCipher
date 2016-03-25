package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter file path:");
//
//        String fileText = MyFileReader.fileReader(scanner.nextLine());
//
//        System.out.println("Choose encryption method:");

        PolibiusSquare polibiusSquare = new PolibiusSquare();

        PolibiusSquare.input();
        polibiusSquare.encrypt();

//        PolibiusSquare.searchChar(4, 4);
//
//        System.out.println(PolibiusSquare.searchCoordinates('Z'));
    }
}
