package org.javaro.lecture;

public class Ex2_1 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        
        System.out.println("=연산자 활용");
        a = 3;
        a = a + 2;
        System.out.println("a에 3을 대입 후 2를 더한 값은 " + a);
        
        System.out.println("+=연산자 활용");
        b = 2;
        a += b;
        System.out.println("b에 2를 대입 후 a에 a와 b를 더한 값을 대입한 후의 a의 값은 " + a);
        
        System.out.println("-=연산자 활용");
        a -= b;
        System.out.println("a에 a에서 b를 뺀 값을 대입한 후의 a의 값은 " + a);
        
        System.out.println("*=연산자 활용");
        a *= b;
        System.out.println("a에 a와 b를 곱한 값을 대입한 후의 a의 값은 "+ a);
        
        System.out.println("/=연산자 활용");
        a /= b;
        System.out.println("a에 b를 나눈 값을 대입한 후의 a의 값은 "+ a);
        
        System.out.println("%=연산자 활용");
        a %= b;
        System.out.println("a에 a를 b로 나눈 후의 나머지를 대입한 후의 a의 값은 " + a);
    }
}
