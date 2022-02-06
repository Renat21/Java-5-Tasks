package com.company.First;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        String intString = myScanner.next();
        int sum = 0;

        for (int i = 0; i < intString.length(); i++) {
            if (Character.isDigit(intString.charAt(i)))
                sum += intString.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
