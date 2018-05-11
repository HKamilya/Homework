package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введит число: ");
        int x = sc.nextInt();
        printFromNToOne(x);
        printFromOneToN(x);
    }
    //от 1 до 10
    static void printFromOneToN(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            printFromOneToN(n - 1);
            System.out.println(n);
        }
    }
    //от 10 до 1
    static void printFromNToOne(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            printFromNToOne(n - 1);
        }
    }
}

