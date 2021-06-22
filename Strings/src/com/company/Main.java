package com.company;

public class Main {

    public static void main(String[] args) {
	String myString = "This is a string";
	System.out.println("myString is equal to "+ myString );
	myString = myString + ", and this is more.";
	System.out.println("myString is equal to "+ myString );
	myString = myString + "\u00A9 2019";
	System.out.println("myString is equal to "+ myString );
	String numberString = "250.55";
	numberString = numberString + "49.45";
	System.out.println(numberString);
	String lastString= "10";
	int myInt = 50;
	lastString = lastString + myInt;
	System.out.println("LastString is equal to "+lastString);
	double doubleNumber = 120.47d;
	lastString = lastString + doubleNumber;
	System.out.println("LastString is equal to "+lastString);

	boolean isAlien = false;
	if (isAlien==false){
		System.out.println("It is not alien");
	}

	int topScore = 70;
	if (topScore == 100){
		System.out.println("You got the high score!");
	}

	if((topScore<90)||(topScore>50)){
		System.out.println("Both conditions true");
	}

	}
}
