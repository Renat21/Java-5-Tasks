package com.company.Third;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        String[] arrayString = myScanner.nextLine().split(" ");
        Pattern patt = Pattern.compile ("[аэеиыуёюяоАЭЕИЫУЁЮЯО]");
        Integer[] countElem = new Integer[arrayString.length];
        for (int i = 0; i < arrayString.length; i++){
            int intSum = 0;
            Matcher match = patt.matcher(arrayString[i]);
            while (match.find())
                intSum += 1;
            countElem[i] = intSum;
        }
        String helpString;
        Integer helpInt;
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = i; j < arrayString.length; j++) {
                if (countElem[i] < countElem[j]){
                    helpInt = countElem[i];
                    countElem[i] = countElem[j];
                    countElem[j] = helpInt;

                    helpString = arrayString[i];
                    arrayString[i] = arrayString[j];
                    arrayString[j] = helpString;
                }
            }
        }

        for (String elements: arrayString){
            System.out.print(elements.substring(0, 1).toUpperCase() + elements.substring(1) + " ");
        }
    }
}
