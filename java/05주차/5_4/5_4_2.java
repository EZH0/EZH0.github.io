package org.javaro.lecture;

public class Ex4_2 {

    public static void main(String[] args) {
        
        int x = 11; // 11 초기값
        int End = 15;

        do {
            System.out.println("x=" + x + ", End=" + End + ", " + (x <= End));
            x = x + 1; // 조건식 변화
        } while (x <= End);
    }
}
