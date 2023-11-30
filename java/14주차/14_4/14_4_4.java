package org.javaro.lecture;
import java.util.*; // java.util 패키지 임포트

public class Ex13_5 {
    public static void main(String args[]) {
        int Max = 10; // 변수 이름은 소문자로 시작하는 것이 일반적 (max)
        DogX[] dogcage = new DogX[Max]; // DogX 객체 배열 생성

        for(int i=0; i<dogcage.length; i++) {
            dogcage[i] = new DogX(); // 배열의 각 요소에 DogX 객체 인스턴스화
        }

        for(int i=0; i<dogcage.length; i++) {
            DogX dog = dogcage[i]; // 배열의 i번째 DogX 객체를 dog 변수에 할당
            dog.eat(); // dog 변수의 eat 메소드 호출
            dog.sleep(); // dog 변수의 sleep 메소드 호출
            // dogcage[i].eat(); // 주석 처리된 배열의 i번째 객체의 eat 메소드 호출
            // dogcage[i].sleep(); // 주석 처리된 배열의 i번째 객체의 sleep 메소드 호출
        }
    }
}
