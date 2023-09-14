package org.javaro.lecture;

public class Ex1_4 {

    public static void main(String[] args) {
        System.out.println("홍길동"+"-"+"20XX0901" + "-" + "변수");
        
        int a = 10; // int 정수형, 이름: a, 10대입
        int b = 20; // int 정수형, 이름: b, 20대입
        
        int c; //int 정수형, 이름: c, 초기화 없음
        c = a + b; 
        System.out.println("변수 타입별 테스트");
        System.out.println("포스트잇 a의 값"+a+"와"+"포스트잇 b의 값"+b+"의 합은"+c+"입니다.");
    }
}
