package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.print("Enter some text: ");
	Scanner userText = new Scanner(System.in);
	String userInput = userText.nextLine();
	System.out.print(userInput);

    }
}
