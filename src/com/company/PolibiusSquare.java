package com.company;


/**
 * Created by Paul on 3/24/2016.
 */
public class PolibiusSquare {

    static char[][] alpha = {{'A', 'B', 'C', 'D', 'E'},
                             {'F', 'G', 'H', 'I', 'J'},
                             {'K', 'L', 'M', 'N', 'O'},
                             {'P', 'Q', 'R', 'S', 'T'},
                             {'U', 'V', 'W', 'Y', 'Z'}};

    static String str = "MY NAME IS PASHA";

    public static void input() {

        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                System.out.print(alpha[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(str);
    }

    public static String searchCoordinates (char ch) {

        String result = null;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (ch == alpha[i][j]) {
                    //System.out.println("Coordinates of " + ch + " are: " + "[" + (i + 1) + ", " + (j + 1) + "]");
                    result = String.valueOf(i) + String.valueOf(j) + " ";
                    //System.out.print("[" + (i + 1) + (j + 1) + "]");
                }
            }
        }
        return result;
    }

    public static void searchChar(int row, int column) {
        for (int i = 0; i < 5; i++ ) {
            for (int j = 0; j < 5; j++) {
                if(i == row && j == column) {
                    System.out.println(alpha[i][j]);
                }
            }
        }
    }

    public void encrypt() {

        char ch1;

        for (int i = 0; i < str.length(); i++) {
            ch1 = str.charAt(i);

            if(Character.isLetter(ch1)) {
                System.out.print(searchCoordinates(ch1));
            }

            if(Character.isDigit(ch1)) {
                System.out.print(ch1);
            }

            if(Character.isSpaceChar(ch1)) {
                System.out.print(ch1);
            }
        }
    }

    public void decrypt() {
        int x, y;

        for(int i = 0; i < alpha.length; i++) {
            for(int j = 0; j < alpha.length; j++) {

            }
        }

    }
}
