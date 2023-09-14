package org.javaro.lecture;

import java.math.BigDecimal;

public class Ex2_2 {
    
    public static void main(String[] args) {
        float a = 3.5f;
        float b = 2.1f;

        BigDecimal bda = new BigDecimal(String.valueOf(a)); //BigDecimal클래스를 이용, 초기값a인 bda객체 생성
        BigDecimal bdb = new BigDecimal(String.valueOf(b));

        bda = bda.add(bdb);//bda객체가 해당 클래스의 add()메소드를 호출
        System.out.println("a=3.5f; a=a+2.1; a=" + bda.toString()); //bda객체가 tosring()호출 //값을 문자열로 변환

        bda = bda.add(bdb); //a + 2.1f
        System.out.println("a=5.6; a=a+2.1; a=" + bda.toString());

        bda = bda.subtract(bdb);
        System.out.println("a=7.7; a=a-2.1; a=" + bda.toString());

        int c = 2;
        BigDecimal bdc = new BigDecimal(String.valueOf(c));

        bda = bda.multiply(bdc);
        System.out.println("a=5.6; a=a*2; a=" + bda.toString());

        bda = bda.divide(bdc);
        System.out.println("a=11.2; a=a/2; a=" + bda.toString());

        bda = bda.remainder(bdc);
        System.out.println("a=5.6; a=a%2; a=" + bda.toString());
    }
}
