package com.company;

public class SecondsAndMinutesChallenge {
    public static void main(String args[]){

        getDurationString(121,30);
    }
    public static void getDurationString(int min,int sec){
        if(min>=0 && sec >=0 && sec <=59){

            int calculatedHour=0;
            if(min>59) {
                calculatedHour= min / 60;
                min = min%60;
            }

            System.out.println(calculatedHour+"h " + min+"m " + sec + "s");
        }else {
            System.out.println("Invalid value");
        }
    }
}
