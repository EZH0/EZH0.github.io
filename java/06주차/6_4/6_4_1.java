package org.javaro.lecture;

public class Ex6_1 {
	 public static void main(String[] args) {
	        int d = sum(1, 2, 3); // 변수 선언 부분 수정
	        System.out.println("d=" + d); 
	    }

	    static int sum(int a, int b, int c) {
	        int total = a + b + c;
	        return total;
	    }
}
