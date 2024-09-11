package org.saddy.variables;

public class PrimitiveDataType {
    public static void main(String[] args) {
//        byte a = 128; //range of byte is -128 to 127

//        short a = 32767; //range for short -32768 to 32767
//        int x = 100;
//        long a = 10000000000000000L;
//        System.out.println(a);
//        Type conversion: Converting one type of data to another data-type
//        type-casting
        short a = 100;
        int x = a;          // implicit conversion
        System.out.println(x);

        int y = 50;
        short b = (short) y; // explicit casting/conversion
        System.out.println(b);

        short z = 200;
        byte c = (byte) z;
        System.out.println(c);
    }
}


//Wrapper class