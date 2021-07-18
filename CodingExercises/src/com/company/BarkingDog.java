package com.company;

public class BarkingDog {
    public static void main(String args[]){
        System.out.println(shouldWakeUp(true,-1));
    }
    private static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(hourOfDay>0 && hourOfDay < 23 ) {
            if (isBarking) {
                if (hourOfDay <= 8 || hourOfDay >= 22) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
