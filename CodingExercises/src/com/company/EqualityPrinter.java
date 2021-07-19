package com.company;

public class EqualityPrinter {
    public static void main(String argsi[]){

    }
    public static void printEquality(int param1,int param2,int param3){
        if(param1==param2 && param2==param3){
            System.out.println("All number are equal");
        }
        if(param1 != param2 && param1 != param3 && param2 != param3){
            System.out.println("All numbers are different");
        }

    }
}
