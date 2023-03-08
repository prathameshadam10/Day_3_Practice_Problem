package com.bridgelabz;

import java.util.Scanner;

public class LineComparisionProblem {
    static double x1, x2, y1, y2;
    static double length1;
    public static double Lengthofline1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1 :");
        x1 = sc.nextInt();
        System.out.println("Enter the value of y1 :");
        y1 = sc.nextInt();
        System.out.println("Enter the value of x2 :");
        x2 = sc.nextInt();
        System.out.println("Enter the value of y2 :");
        y2 = sc.nextInt();
        length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The length of a line using cartesian system = " + length1);
        return 0;
    }



    static double x3, x4, y3, y4;
    static double length2;
    public static void Lengthofline2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x3 :");
        x3 = sc.nextInt();
        System.out.println("Enter the value of y3 :");
        y3 = sc.nextInt();
        System.out.println("Enter the value of x4 :");
        x4 = sc.nextInt();
        System.out.println("Enter the value of y4 :");
        y4 = sc.nextInt();
        length2 = Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
        System.out.println("The length of a line ="+length2);
    }




    public void equalityCheckofLines(){

        double A = LineComparisionProblem.length1;
        double B = LineComparisionProblem.length2;

        String LineA = String.valueOf(A);
        String LineB = String.valueOf(B);

        if(LineA.equals(LineB)){
            System.out.println("Length of both lines are equal");
        }else{
            System.out.println("lengths are not equal");
        }
    }



    public void compareofLines(){
        String LineA=String.valueOf(length1);
        String LineB=String.valueOf(length2);
//        double A = LineComparisonDAY8.lengthofLine1;
//        double B = LineComparisonDAY8.LengthofLine2;
        int compare=LineA.compareTo(LineB);
        System.out.println(compare);
        if(compare==0) {
            System.out.println("lines are equal");
        }else if(compare>0) {
            System.out.println("lineA is greater then lineB");
        }else {
            System.out.println("lineA is less than lineB");
        }
    }



    public static void main(String[] args){
        /*Start with Displaying Welcome to Line Comparison Computation Program on main  Branch */
        System.out.println("Welcome to line computation problem");

        Lengthofline1();
        Lengthofline2();
        LineComparisionProblem obj = new LineComparisionProblem();
        obj.equalityCheckofLines();
        obj.compareofLines();
    }
}
