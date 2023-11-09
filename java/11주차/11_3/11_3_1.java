package org.javaro.lecture;

public class Ex10_1 {
    public static void main(String[] args) {
        func(); // 예외 동작
    }

    static void func() {
        int i = 5;
        int j = 0;
        System.out.println(i / j); // 5/0 -> 예외 발생
    }
}
