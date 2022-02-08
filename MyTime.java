package edu.sjsu.assignment1;

import java.util.Scanner;

public class MyTime {
    public static int timetosec(int inhours){// This function is for convert hours and minutes to seconds
        int hours = inhours/100;
        int minutes = inhours - hours*100;
        int totalsec = hours*60*60 + minutes*60;
        return totalsec;
    }

    public static void timecal(int difference){// This function is to convert second by to hours and output the result
        int hours = difference / 3600;
        int minutes = (difference % 3600) / 60;
        System.out.println(hours + " hour(s) " + minutes + " minute(s)");
    }

    public static void printTimeDifference(String firstTime, String SecondTime){//This function is to read from input and allocate time to difference cases
        //extracting numbers from the user input
        int time1 = Integer.parseInt(firstTime.substring(0, 4));
        int time2 = Integer.parseInt(SecondTime.substring(0, 4));
        if(time1 > 2400 || time2 > 2400){
            System.out.println("There is something wrong with the input, exiting...");
            System.exit(2);
        }
        if(time2 >= time1){
            int difference = timetosec(time2) - timetosec(time1);
            timecal(difference);
        }
        else if(time2 < time1){
            int difference = timetosec(2400) - timetosec(time1) + timetosec(time2);
            timecal(difference);
        }
    }

    public static void main(String[] args) {
        printTimeDifference("0120", "1510");
        printTimeDifference("1635", "0250");
    }
}
