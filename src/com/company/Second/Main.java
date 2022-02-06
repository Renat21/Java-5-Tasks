package com.company.Second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        String question = myScanner.next();
        if (question.contains("."))
            System.out.println("This number is not Integer");
        else {
            try {
                int number = Integer.parseInt(question);
                System.out.print("Multipliers - ");
                int seq = 2;
                while (number != 1) {
                    if (number % seq == 0) {
                        System.out.print(seq + " ");
                        number /= seq;
                    } else if (seq == 2)
                        seq++;
                    else {
                        seq += 2;
                    }
                }
            }
            catch (NumberFormatException e){
                System.out.println("This number is not Integer");
            }
        }
    }
}
