package com.codewithmosh.types;

import java.util.Arrays;

public class EscapeSequences {

    public static void main(String[] args) {
        String message = "Hello \"Mosh\"";
        System.out.println(message);
        String cwindows = "c:\\Windows\\....";
        System.out.println(cwindows);

        //Other Escape sequences are \n and \t

        //implementation of \n
        String cwindows2 = "c:\nWindows\\....";
        System.out.println(cwindows2);

        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
//        numbers[20] = 3;



        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {2, 3, 5, 5,6,8};
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        System.out.println();

        int [][]  numbers3 =  new int[2][3];
        numbers3[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers3));

        int[][] numbers4 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers4));


    }
}
