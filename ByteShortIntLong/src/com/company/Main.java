package com.company;

public class Main {

    public static void main(String[] args) {
	int myValue= 1000;

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;

	System.out.println("Integer minimum value = "+ myMinIntValue);
	System.out.println("Integer maximum value = "+ myMaxIntValue);
	System.out.println("Busted MAX value = "+ (myMaxIntValue+1));
	System.out.println("Busted MIN value = "+ (myMinIntValue-1));

	byte myMinByteValue = Byte.MIN_VALUE;
	byte myMaxByteValue = Byte.MAX_VALUE;
	System.out.println("Byte Minimum Value = "+ myMinByteValue);
	System.out.println("Byte Maximum Value = "+ myMaxByteValue);

	short myMinShortValue = Short.MIN_VALUE;
	short myMaxShortValue = Short.MAX_VALUE;
	System.out.println("Short Minimum Value = "+ myMinShortValue);
	System.out.println("Short Maximum Value = "+ myMaxShortValue);

	long myLongValue = 100L;  // You need to specify Long variables with L key char.

	long myMinLongValue = Long.MIN_VALUE;
	long myMaxLongValue = Long.MAX_VALUE;
	System.out.println("Long Minimum Value = "+ myMinLongValue);
	System.out.println("Long Maximum Value = "+ myMaxLongValue);

	int myTotal= (myMaxIntValue/2);

	byte myNewByteValue = (byte) (myMinByteValue/2);

	short myNewShotValue = (short) (myMinShortValue/2);

    }
}
