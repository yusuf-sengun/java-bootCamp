package com.company;

public class SpeedConverter {

    private static double mileConstant = 1.609;

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));
    }

    private static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }else{
            return (long) (kilometersPerHour/mileConstant);
        }

    }
}
