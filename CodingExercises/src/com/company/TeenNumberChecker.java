package com.company;

import java.util.SortedMap;

public class TeenNumberChecker {
    public static void main(String args[]){

        System.out.println(hasTeen(9,99,67));
    }
    private static boolean hasTeen(int num1,int num2,int num3){
        if((num1<20 && num1>12)||(num2<20 && num2>12)||(num3<20 && num3>12)){
            return true;
        }
        return false;
    }
}