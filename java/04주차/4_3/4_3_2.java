package org.javaro.lecture;

public class Ex2_4 {

    public static void main(String[] args) {
        System.out.println("++b, d++");

        int a, b = 1;
        a = ++b;
        System.out.println("l: a=" + a + ", b=" + b); // 2, 2

        int c, d = 1;
        c = d++;
        System.out.println("XI: c=" + c + ", d=" + d); // 1, 2
    }
}
