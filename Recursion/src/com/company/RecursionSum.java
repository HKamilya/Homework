package com.company;

import java.util.Scanner;

public class RecursionSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
        sumOfNumbers(x);
    }


    static void sumOfNumbers(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            int numb = n % 10;
            int numb2 = n / 10;
            System.out.println(n);
            sumOfNumbers(n - 1);


        }
    }


    }

