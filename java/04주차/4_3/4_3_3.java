package org.javaro.lecture;

public class Ex2_5 {

    public static void main(String[] args) {
        System.out.println("OH");
        
        System.out.println("2>2=" + (2 > 2)); // false

        boolean flag;
        int b = 2;

        flag = (2 < b);
        System.out.println("2<b = " + flag); // false

        flag = (2 > b);
        System.out.println("2>b = " + flag); // false

        flag = (2 <= b);
        System.out.println("2<=b = " + flag); // true

        flag = (2 >= b);
        System.out.println("2>=b = " + flag); // true

        flag = (2 == b);
        System.out.println("2==b = " + flag); // true

        flag = (2 != b);
        System.out.println("2!=b = " + flag); // false
    }
}
