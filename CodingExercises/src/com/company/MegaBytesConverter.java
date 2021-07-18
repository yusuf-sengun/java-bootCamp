package com.company;

public class MegaBytesConverter {

    public static void main(String args[]){

        printMegaBytesAndKiloBytes(2500);
    }
    private static void printMegaBytesAndKiloBytes (int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid value becaus parameter is less than 0");
        }
        int MegaByte;
        int Kbyte;
        Kbyte = (kiloBytes%1024);
        MegaByte = kiloBytes - Kbyte;
        MegaByte = MegaByte / 1024;
        System.out.println(kiloBytes+" KB = "+MegaByte+" MB "+Kbyte+" KB");

    }
}
