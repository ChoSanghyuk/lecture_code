package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds){
        if( (minutes <0) || !(0<=seconds && seconds <= 59)){
            return "Invalid Value";
        }
        return Math.floorDiv(minutes,60)+"h " + minutes%60 +"m "+seconds +"s";
    }

    public static String getDurationString(int seconds){
        if( seconds < 0 ){
            return "Invalid Value";
        }
        return getDurationString(Math.floorDiv(seconds,60),seconds%60 );
    }
}
