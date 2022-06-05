package org.example.numberFormat;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class NumberFormatting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nFUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nFIN = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat nFCH = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nFFR = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        out.println("US: " + nFUS.format(payment));
        out.println("India: " + nFIN.format(payment));
        out.println("China: " + nFCH.format(payment));
        out.println("France: " + nFFR.format(payment));
    }
}
