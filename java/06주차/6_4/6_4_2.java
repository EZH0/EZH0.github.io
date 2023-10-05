package org.javaro.lecture;

public class Ex6_2 {

    public static void main(String[] args) {

        float num = 10.0f;

        System.out.println("num=" + num);
        rand(num);

        num = 20.0f;
        System.out.println("num=" + num);
        
        rand(num);
        System.out.println("num=" + num);
    }

    static void rand(float newnum) {
        newnum = newnum + 5.0f;
        System.out.println("new num =" + newnum);
    }
}
