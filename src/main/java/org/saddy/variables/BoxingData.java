package org.saddy.variables;

import java.util.ArrayList;

public class BoxingData {
    public static void main(String[] args) {
        int a  = 10;
        Integer b = Integer.valueOf(a); //boxing
        System.out.println(b);
        int a1 = b.intValue();      //Unboxing

        Integer x = 10; //Autoboxing
        int y = x;      // unboxing

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(a);
        printNum(Short.valueOf(String.valueOf(a)));
    }

    static void printNum(Short num){
        System.out.println("Number: " + num);
    }
}
