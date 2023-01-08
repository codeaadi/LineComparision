package com.bridgelabz.day3.linecomparison;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class UC_2_EqualLineCheck {
    public static String lengthOfLine(){
        Scanner scan = new Scanner(System.in);
//        Line Number one
        System.out.println("Enter Point X1:");
        double x1 = scan.nextDouble();
        System.out.println("Enter Point X2:");
        double x2 = scan.nextDouble();
        System.out.println("Enter Point y1:");
        double y1 = scan.nextDouble();
        System.out.println("Enter Point y2:");
        double y2 = scan.nextDouble();
//        Line Number Two
        System.out.println("Enter Point X3: ");
        double x3 = scan.nextDouble();
        System.out.println("Enter Point x4:");
        double x4 = scan.nextDouble();
        System.out.println("Enter Point y3: ");
        double y3 = scan.nextDouble();
        System.out.println("Enter Point Y4:");
        double y4 = scan.nextDouble();
        double length1 =  sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        double length2 = sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        if(length1==length2){
            return"have same Length";
        }else{
            return " are not same";
        }}

    public static void main(String[] args) {
        String equalLines = lengthOfLine();
        System.out.println("Enter lines are :"+equalLines);
    }}

