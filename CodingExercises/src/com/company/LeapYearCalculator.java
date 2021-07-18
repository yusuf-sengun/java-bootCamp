package com.company;

public class LeapYearCalculator {
    public static void main(String args[]){

    }
    private static boolean isLeapYear(int year){
        if(year>0 && year < 10000){
            return true;
        }else {
            return false;
        }
    }
}
