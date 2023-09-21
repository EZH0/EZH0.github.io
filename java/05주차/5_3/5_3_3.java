package org.javaro.lecture;

public class Ex3_7 {
    public static void main(String args[]) {
        int a = 10;

        switch (a % 3) { // 나머지
            case 1:
                System.out.println("나머지는 1입니다");
                break;
            case 2:
                System.out.println("나머지는 2입니다");
                break;
            default:
                System.out.println("나머지는 0입니다");
                break;
        }
    }
}
