package com.company.Forth;
import java.util.*;
import java.util.Scanner;

public class Main {
    static Integer starMatrix[][];

    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Введите число - ");
        String number = myScanner.next();
        int maxNum = -1;
        starMatrix = new Integer[7][9 * number.length()];
        for (int i = 0; i < starMatrix.length; i++)
            Arrays.fill(starMatrix[i], -1);

        int[] numTags = new int[10];
        Arrays.fill(numTags, 1);

        for (int i = 0 ; i < number.length(); i++)
            if (number.charAt(i) - '0' > maxNum)
                maxNum = number.charAt(i) - '0';
        numTags[maxNum] = maxNum;
        for (int i = 0 ; i < number.length(); i++)
        {
            switch (number.charAt(i)){
                case ('0'):
                    numberZero(i * 9, numTags[0]);
                    break;
                case ('1'):
                    numberOne(i * 9, numTags[1]);
                    break;
                case ('2'):
                    numberTwo(i * 9, numTags[2]);
                    break;
                case ('3'):
                    numberThree(i * 9, numTags[3]);
                    break;
                case ('4'):
                    numberFour(i * 9, numTags[4]);
                    break;
                case ('5'):
                    numberFive(i * 9, numTags[5]);
                    break;
                case ('6'):
                    numberSix(i * 9, numTags[6]);
                    break;
                case ('7'):
                    numberSeven(i * 9, numTags[7]);
                    break;
                case ('8'):
                    numberEight(i * 9, numTags[8]);
                    break;
                case ('9'):
                    numberNine(i * 9, numTags[9]);
                    break;
            }
        }

        for (int i = 0; i < starMatrix.length; i++){
            for (int j = 0; j < starMatrix[i].length; j++){
                if (starMatrix[i][j] == 1)
                    System.out.print("*");
                else if (starMatrix[i][j] == -1)
                    System.out.print(" ");
                else
                    System.out.print((char)(starMatrix[i][j] + '0'));
            }
            System.out.println();
        }
    }

    public static void numberZero(int next, int tag){
        for (int i = 0; i < 3; i++) {
            starMatrix[0][next + 3 + i] = tag;
            starMatrix[6][next + 3 + i] = tag;
            starMatrix[i + 2][next + 1] = tag;
            starMatrix[i + 2][next + 7] = tag;
        }
        starMatrix[1][next + 2] = tag;
        starMatrix[1][next + 6] = tag;
        starMatrix[5][next + 2] = tag;
        starMatrix[5][next + 6] = tag;
    }

    public static void numberOne(int next, int tag){
        for (int i = 0; i < 7; i++)
            starMatrix[i][next + 4] = tag;
        starMatrix[1][next + 3] = tag;
        starMatrix[6][next + 3] = tag;
        starMatrix[6][next + 5] = tag;
    }

    public static void numberTwo(int next, int tag){
        for (int i = 0; i < 3; i++)
            starMatrix[0][next + 3 + i] = tag;
        starMatrix[1][next + 2] = tag;
        starMatrix[2][next + 2] = tag;
        for (int i = 0; i < 5; i++) {
            starMatrix[1 + i][next + 6 - i] = tag;
            starMatrix[6][next + 2 + i] = tag;
        }
    }

    public static void numberThree(int next, int tag) {
        for (int i = 0; i < 3; i++){
            starMatrix[0][next + 3 + i] = tag;
            starMatrix[6][next + 3 + i] = tag;
        }
        for (int i = 0; i < 2; i++){
            starMatrix[1 + i][next + 6] = tag;
            starMatrix[4 + i][next + 6] = tag;

        }
        starMatrix[1][next + 2] = tag;
        starMatrix[5][next + 2] = tag;
        starMatrix[3][next + 5] = tag;
    }

    public static void numberFour(int next, int tag) {
        for (int i = 0; i < 7; i++){
            starMatrix[i][next + 4] = tag;
        }
        for (int i = 0; i < 4; i++){
            starMatrix[i][next + 4 - i] = tag;
        }
        for (int i = 0; i < 6; i++){
            starMatrix[4][next + 1 + i] = tag;
        }
    }

    public static void numberFive(int next, int tag) {
        for (int i = 0; i < 3; i++){
            starMatrix[0][next + 3 + i] = tag;
            starMatrix[6][next + 3 + i] = tag;
            starMatrix[3][next + 3 + i] = tag;
        }
        for (int i = 0; i < 2; i++){
            starMatrix[1 + i][next + 2] = tag;
            starMatrix[4 + i][next + 6] = tag;
        }
        starMatrix[1][next + 2] = tag;
        starMatrix[5][next + 2] = tag;
    }

    public static void numberSix(int next, int tag) {
        for (int i = 0; i < 3; i++){
            starMatrix[0][next + 3 + i] = tag;
            starMatrix[6][next + 3 + i] = tag;
            starMatrix[3][next + 3 + i] = tag;
        }
        for (int i = 0; i < 2; i++){
            starMatrix[1 + i][next + 2] = tag;
            starMatrix[4 + i][next + 6] = tag;
            starMatrix[4 + i][next + 2] = tag;
        }
        starMatrix[1][next + 2] = tag;
        starMatrix[3][next + 2] = tag;
    }

    public static void numberSeven(int next, int tag){
        for (int i = 0; i < 5; i++)
            starMatrix[0][next + 2 + i] = tag;
        for (int i = 0; i < 5; i++) {
            starMatrix[1 + i][next + 6 - i] = tag;
        }
        starMatrix[6][next + 2] = tag;
    }

    public static void numberEight(int next, int tag) {
        for (int i = 0; i < 3; i++){
            starMatrix[0][next + 3 + i] = tag;
            starMatrix[6][next + 3 + i] = tag;
            starMatrix[3][next + 3 + i] = tag;
        }
        for (int i = 0; i < 2; i++){
            starMatrix[1 + i][next + 6] = tag;
            starMatrix[4 + i][next + 6] = tag;
            starMatrix[1 + i][next + 2] = tag;
            starMatrix[4 + i][next + 2] = tag;
        }
    }

    public static void numberNine(int next, int tag) {
        for (int i = 0; i < 3; i++){
            starMatrix[0][next + 3 + i] = tag;
            starMatrix[6][next + 3 + i] = tag;
            starMatrix[3][next + 3 + i] = tag;
        }
        for (int i = 0; i < 2; i++){
            starMatrix[1 + i][next + 2] = tag;
        }
        for (int i = 0; i < 5; i++)
            starMatrix[1 + i][next + 6] = tag;

        starMatrix[5][next + 2] = tag;
    }
}