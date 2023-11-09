package org.javaro.lecture;
import java.util.*; // java.util 패키지 import

class Ex12_4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third"); // ArrayList에 문자열 추가

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i)); // 기본 for 루프를 사용하여 ArrayList의 요소 출력
        }

        for(String str : arrayList) {
            System.out.println(str); // 향상된 for 루프를 사용하여 ArrayList의 요소 출력
        }
    }
}
