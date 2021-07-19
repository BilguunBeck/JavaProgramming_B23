package day_13_Scanner2;

import java.util.Scanner;

public class Speed_Check {
    public static void main(String[] args) {
                    int speedLimit = 35;

                    System.out.println("Enter your current speed:");
                    int currentSpeed = new Scanner(System.in).nextInt();  // 100
                    // if we are using scanner object for one input only, then we do not need to create a variable for scanner

                    int overSpeedLimit = currentSpeed - speedLimit;

                    if (overSpeedLimit > 0 ){
                        System.out.println("You are driving "+overSpeedLimit+" miles over speed limit. Slow Down!");
                    }



                }

    }

