package org.javaro.lecture;

public class Ex3_test_2 {
	public static void main(String[] args) {
		String strLove = "I Love java.";

		if (strLove.contains("java")) { // String 클래스의 method 확인
		    // 포함하는 경우
		    System.out.println("Yes, java"); // true
		} 
		else {
		    // 포함하지 않는 경우
		    System.out.println("No, java"); // false
		}

    }
}
