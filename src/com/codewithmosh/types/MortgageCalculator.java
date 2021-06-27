package com.codewithmosh.types;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){

        /*
         *
         * todo
         *  add more code examples
         */




        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        Float principal = scanner.nextFloat();

        System.out.print("Annual Interest rate: ");
        Double rate = scanner.nextDouble();
        Double monthlyRate = rate /100/12;
        System.out.println(monthlyRate);

        System.out.print("Period: ");
        int period = scanner.nextInt();

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double b = Math.pow((1+rate), monthlyRate)-1;
        double a = principal * (rate*Math.pow((1+rate), monthlyRate)) / b;

        System.out.println(a);



        String mortgagePayment = currency.format(principal * (monthlyRate * Math.pow((1 + monthlyRate ), period)) / (Math.pow((1 + monthlyRate ), period) -1));

        System.out.println("Mortgage: " + mortgagePayment);



    }
}
