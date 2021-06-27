package com.codewithmosh.types;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args){

        /*
         *
         * todo
         *  add more code examples
         */

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String res =currency.format(123456.892354);
        System.out.println(res);

        NumberFormat.getPercentInstance().format(0.1);
        String res3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(res3);


    }
}
