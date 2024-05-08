package com.icortex.common_problem;

public class HourConverstion {

    public static String hourConvert12(String hour) {
        String[] hours = hour.split(":");

        int hourInt = Integer.parseInt(hours[0]);
        int minute = Integer.parseInt(hours[1]);
        int second = Integer.parseInt(hours[2]);

        String format = hourInt >= 12 ? "PM":"AM";

        hourInt = hourInt >= 12 ? hourInt - 12 : hourInt;
        hourInt = hourInt == 0 ? 12 : hourInt;

        return hourInt + ":"+minute+":"+second+" "+format;
    }

    public static String hourConvert24(String hour){
        String []hours = hour.split(":");

        int hourInt = Integer.parseInt(hours[0]);
        char format = hour.charAt(8);

        if(format == 'P'){
            hourInt = hourInt != 12 ? hourInt + 12 : hourInt;
        }else if(format == 'A'){
            hourInt = hourInt == 12 ? 0 : hourInt;
        }

        String second = hours[2].substring(0,2);
        return hourInt + ":"+hours[1] + ":"+second;
    }

    public static void main(String[] args) {
        System.out.println("12 hour format : "+hourConvert12("00:20:30"));
        System.out.println("24 hour format : "+hourConvert24("07:05:45PM"));
    }
}
