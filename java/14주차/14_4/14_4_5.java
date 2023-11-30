package org.javaro.lecture;
import java.util.*; // java.util 패키지 import

public class Ex13_6 {
    public static void main(String args[]) {
        int Max = 10; // 'Max'는 대문자로 시작하지만, 일반적으로 변수는 소문자로 시작합니다.
        ArrayList<DogX> dogcage = new ArrayList<DogX>(); // DogX 타입의 ArrayList 생성

        for(int i = 0; i < Max; i++) {
            dogcage.add(new DogX()); // dogcage 리스트에 DogX 객체들을 추가
        }

        for(int i = 0; i < dogcage.size(); i++) {
            DogX dog = (DogX) dogcage.get(i); // dogcage 리스트에서 DogX 객체를 가져옴
            dog.eat(); // DogX 객체의 eat 메소드 호출
            dog.sleep(); // DogX 객체의 sleep 메소드 호출
            // dogcage.get(i).eat(); // 주석 처리된 부분, 리스트에서 직접 객체의 eat 메소드 호출
            // dogcage.get(i).sleep(); // 주석 처리된 부분, 리스트에서 직접 객체의 sleep 메소드 호출
        }
    }
}
