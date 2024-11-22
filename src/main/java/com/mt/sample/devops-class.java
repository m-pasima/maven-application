package com.mt.sample;

/**
 * Welcome to The DevOps Academy Master Class.
 * 
 * This program provides a simple demonstration of using the Maven Build Tool.
 * It also shows how to retrieve and display the current local date.
 * 
 * Author: DevOps Academy
 * Date: 2024-11-22
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class DevOpsWorld {

    public static void main(String[] args) {
        System.out.println("Hello Engineers, Welcome to The DevOps Academy Master Class.");
        System.out.println("You are currently studying the Maven Build Tool.");
        System.out.println("Today's Date: " + getLocalCurrentDate());
    }

    /**
     * Retrieves the current local date in a formatted manner.
     * 
     * @return The current local date as a string.
     */
    private static String getLocalCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
