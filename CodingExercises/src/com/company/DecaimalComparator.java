package com.company;

public class DecaimalComparator {
    public static void main(String args[]){
        System.out.println(areEqualByThreeDecimalPLaces(-3.123,3.123));
    }
    private static boolean areEqualByThreeDecimalPLaces(double param1, double param2){
        String  dividedParam1 = String.valueOf(param1 * 1000).split("\\.")[0];
        String dividedParam2 = String.valueOf(param2 * 1000).split("\\.")[0];
        System.out.println(dividedParam1);
        System.out.println(dividedParam2);

        if(dividedParam1.equals(dividedParam2)){
            return true;
        }
        return false;

    }
}
