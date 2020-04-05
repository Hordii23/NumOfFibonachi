package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        int num = src.nextInt();
        int numOfFibonachi;
        int i = 0;
        while (i <= num) {
            numOfFibonachi = num1 + num2;
            num1 = num2;
            num2 = numOfFibonachi;
            if (i == num) {
                System.out.println(numOfFibonachi);
            }
            i++;
        }
    }
}