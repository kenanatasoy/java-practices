package org.example.switchCase;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class SwitchDemo {

    public static void switchCase() {

        int month = 2;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                + numDays);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        switch(sc.next()){
            case "A":
                out.println("A is entered");
                switch (sc.next()){
                    case "A" : out.println("A is entered again");
                }
            case "B": out.println("B is entered"); break;
            case "C": out.println("C is entered");
            case "D": out.println("D is entered");
            case "E": out.println("E is entered");

            default: out.println("No character is matched");

        }

    }


}
