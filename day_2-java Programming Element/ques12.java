package com.tech;

import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double baseIn = baseCm / 2.54;
        double heightIn = heightCm / 2.54;
        double areaIn2 = 0.5 * baseIn * heightIn;

        System.out.println("The Area of the triangle in sq in is " + areaIn2 +
                           " and sq cm is " + areaCm2);
    }
}