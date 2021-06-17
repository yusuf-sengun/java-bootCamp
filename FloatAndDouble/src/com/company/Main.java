package com.company;

public class Main {

    public static void main(String[] args) {
	
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+ myMinFloatValue);
        System.out.println("Float maximum value = "+ myMaxFloatValue);



        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = "+ myMinDoubleValue);
        System.out.println("double maximum value = "+ myMaxDoubleValue);

        int myIntValue= 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("myFloatValue = "+myFloatValue);
        System.out.println("myDoubleValue = "+myDoubleValue);

        double poundConstant =0.45359237;
        double pound = 5;
        double kilogram = pound*poundConstant;
        System.out.println(pound+ " pound equals " + kilogram + "kg");
    }
}
