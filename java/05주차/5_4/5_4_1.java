package org.javaro.lecture;

public class Ex4_1 {
    
    public static void main(String[] args) {
        
        int x = 11;  // 11 초기값
        int end = 15; // 종료조건
        
        while (x <= end) {
            System.out.println("x=" + x + ", End=" + end + ", " + (x <= end));
            x = x + 1; // 조건식 변화
        }
    }
}
