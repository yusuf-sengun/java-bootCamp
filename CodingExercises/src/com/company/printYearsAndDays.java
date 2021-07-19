package com.company;

public class printYearsAndDays {
    public static void main(String args[]){
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes>0){
            long calculatedYear = (long) (minutes / 525600);
            minutes %= 525600;
            long calculatedDay = (long) (minutes / 3600);

            System.out.println(calculatedYear+ "y and" +calculatedDay +"d");
        }else {
            System.out.println("Invalid Value");
        }

    }
}
