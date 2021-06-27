package com.codewithmosh.types;

public class Casting {
    public static void main(String[] args){

        /*
         *
         * todo
         *  add more code examples
         */
        //IMplicit casting Automatic conversion
        //byte>short>int>long>float>double
        short x=1;
        int y = x+2;
        System.out.println(y);

        double a = 1.1;
        double b = a + 2;
        System.out.println(b);

        // EXplicit casting
        double d = 1.1;
        int e = (int)d + 2;
        System.out.println(d);

        String f = "1";

        //todo reserach and implement on the parse method
        int h =Integer.parseInt(f);
        int g =    h+7;
        System.out.println(g);




    }
}
