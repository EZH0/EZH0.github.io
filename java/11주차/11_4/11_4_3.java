package org.javaro.lecture;
import java.util.*; // java.util 패키지 import

class Ex12_3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(); // 모든 요소가 String 타입
        int idx = 0;
        String obj1 = "Korea";
        String obj2 = "Seoul";
        String obj3 = "Daejeon";

        arrayList.add(obj1); // "Korea" 추가
        System.out.println("1=" + arrayList.get(0)); // "Korea" 출력

        arrayList.add(idx, obj2); // idx=0 위치에 "Seoul" 추가
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println("2=" + arrayList.get(i)); // "Seoul", "Korea" 순으로 출력
        }

        arrayList.set(idx, obj3); // idx=0 위치의 요소를 "Daejeon"으로 변경
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println("3=" + arrayList.get(i)); // "Daejeon", "Korea" 순으로 출력
        }

        idx = arrayList.indexOf(obj1); // "Korea"의 인덱스 찾기
        arrayList.remove(idx); // "Korea" 삭제 -> "Daejeon"만 남음

        int count = arrayList.size(); // 현재 ArrayList의 크기
        System.out.println(count);

        Object[] str = arrayList.toArray(); // ArrayList를 배열로 변환
        for(int i = 0; i < str.length; i++) {
            System.out.println((String) str[i]); // 배열의 모든 요소 출력
        }

        arrayList.clear(); // ArrayList 비우기
    }
}
