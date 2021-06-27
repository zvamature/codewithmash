package com.codewithmosh.types;

public class Arrays {

    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
//        numbers[20] = 3;

        System.out.println(java.util.Arrays.toString(numbers));

        int[] numbers2 = {2, 3, 5, 5,6,8};
        System.out.println(numbers2.length);
        java.util.Arrays.sort(numbers2);
        System.out.println(java.util.Arrays.toString(numbers2));
        System.out.println();

        int [][]  numbers3 =  new int[2][3];
        numbers3[0][0] = 1;
        System.out.println(java.util.Arrays.deepToString(numbers3));

        int[][] numbers4 = {{1,2,3}, {4,5,6}};
        System.out.println(java.util.Arrays.deepToString(numbers4));


    }
}
