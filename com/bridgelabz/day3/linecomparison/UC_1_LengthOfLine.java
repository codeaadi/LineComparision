package com.bridgelabz.day3.linecomparison;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class UC_1_LengthOfLine {
    public static double lengthOfLine(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Point X1:");
        double x1 = scan.nextDouble();
        System.out.println("Enter Point X2:");
        double x2 = scan.nextDouble();
        System.out.println("Enter Point y1:");
        double y1 = scan.nextDouble();
        System.out.println("Enter Point y2:");
        double y2 = scan.nextDouble();
        double length =  sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        return length;
    }

    public static void main(String[] args) {
        double lengthLine = lengthOfLine();
        System.out.println("Length of the line is :" + lengthLine);
    }
}
