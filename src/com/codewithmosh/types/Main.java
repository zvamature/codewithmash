package com.codewithmosh.types;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        byte x = 1;
        byte y = 1;
        System.out.println();
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        String message = "    Hello world " + "                   !!!    ";
        System.out.println(message.length());
        System.out.println(message.indexOf('J'));

        //parameters
        //arguments
        System.out.println(message.replace("o", "89"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());

        System.out.println(message);

    }
}
