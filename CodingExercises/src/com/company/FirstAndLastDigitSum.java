package com.company;

import java.sql.SQLOutput;

public class FirstAndLastDigitSum {
    public static void main(String args[]){
        System.out.println(sumFirstAndLastDigit(257));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        String numberAsString = String.valueOf(number);
        int firstDigit = Character.getNumericValue(numberAsString.charAt(0));
        int lastDigit = Character.getNumericValue(numberAsString.charAt(numberAsString.length()-1));
        return firstDigit+lastDigit;
    }
}
