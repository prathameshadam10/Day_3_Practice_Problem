package com.bridgelabz;

import java.util.Scanner;

public class LineComparisionProblem {

public static void main(String[] args) {
        System.out.println("Welcome to Line comparision Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x1 :");
        int x1 = sc.nextInt();
        System.out.println("Enter value of y1 :");
        int y1 = sc.nextInt();
        System.out.println("Enter value of x2 :");
        int x2 = sc.nextInt();
        System.out.println("Enter value of y2 :");
        int y2 = sc.nextInt();


        double oper1 = Math.pow((x2 - x1),2);
        double oper2 = Math.pow((y2 - y1),2);
        double oper3 = oper1+oper2;
        double length = Math.sqrt(oper3);
        System.out.println("Length of Line :" + length);

    }
}
