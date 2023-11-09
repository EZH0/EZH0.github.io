package org.javaro.lecture;
import java.util.*; // java.util 패키지 import

class Ex12_1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third"); // ArrayList에 문자열 추가

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println( (String)arrayList.get(i) ); // ArrayList의 요소 출력
        }
    }
}
	
