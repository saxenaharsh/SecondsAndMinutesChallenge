package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(65L, 45L));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59) ){
            return "returnedValues";
        }
        long hours = minutes / 60;
        long remainingMins = minutes % 60;

        return hours + "h " + remainingMins + "m " + seconds + "s";


    }

    private static String getDurationString(long seconds){
        if(seconds < 0){
            return "Invalid Value";

        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);



    }
}
