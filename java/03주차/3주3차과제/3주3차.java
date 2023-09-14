package org.javaro.lecture;

public class Ex1_2 {

    static int intVar;
    static long longVar;
    static boolean booleanVar;
    static double doubleVar;
    static char charVar;

    public static void main(String[] args) {
        System.out.println("홍길동" + "-" + "20XX0901" + "-" + "변수");
        System.out.println("클래스 멤버변수의 자동초기값을 확인하기 위해 변수설정 및 인쇄 초기값 인쇄됨");
        System.out.println(intVar + "," + longVar + "," + charVar + "," + booleanVar + " " + doubleVar);
    }
}
