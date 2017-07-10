package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    double userNum = 0.0;
	    double Total = 0.0;
        System.out.print("Enter a number: ");
	    Scanner scnr = new Scanner(System.in);
	    userNum = scnr.nextDouble();
	    Total = userNum + 1;
	    System.out.print(Total);


    }
}
