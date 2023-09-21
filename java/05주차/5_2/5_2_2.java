package org.javaro.lecture;

public class Ex3_4 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("초기 x =" + x);

        if (x == 5) {
            x = 6; // x에 6 대입
        }
        System.out.println("바뀐 x =" + x);

        x = 5; // x에 5 대입
        if (x == 6) {
            System.out.println("다시 바뀐 x =" + x);
        }
    }
}
