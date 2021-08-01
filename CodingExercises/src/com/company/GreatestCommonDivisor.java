package com.company;

public class GreatestCommonDivisor {
    public static void main (String args[]){
        System.out.println(getGreatestCommonDivisor(81,7));
    }
    public static int getGreatestCommonDivisor(int num1,int num2){
        if(num1<10 || num2 <10){
            return -1;
        }else{
            int smallerNumber;
            int greatestDivisor=-1;
            if(num1<=num2){
                smallerNumber=num1;
            }else{
                smallerNumber=num2;
            }
            for(int i=1;i<=smallerNumber;i++){
                if((num1%i==0) && (num2%i==0) ){
                    greatestDivisor=i;
                }
            }
            return greatestDivisor;
        }
    }
}
