package com.codewithmosh.types;

public class MathClass {
    public static void main(String[] args){

        /*
         *
         * todo
         *  add more code examples
         */
        int result = Math.round(1.1F);
        int result2 = (int)Math.ceil(1.1F);
        int result3 = (int)Math.floor(6.7521F);
        System.out.println(result2);
        System.out.println(result3);

        int result4 = (int) (Math.random() * 100);
        System.out.println(result4);
    }
}
