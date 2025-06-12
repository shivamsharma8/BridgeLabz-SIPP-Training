package com.tech;
import java.util.Scanner;

public class ques10 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter height in cm: ");
	 double heightCm = input.nextDouble();
	 double heightInFeet = heightCm / 30.48; 
	 int feet = (int) heightInFeet;
	 double inches = (heightInFeet - feet) * 12;
	 System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
}
}
