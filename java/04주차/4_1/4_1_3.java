package org.javaro.lecture;

public class Ex2_1 {

    public static void main(String[] args) {
        int secondVar = 1000; //입력 초
        int minOut = secondVar / 60; //분 계산
        int secondOut = secondVar % 60; //남은 초 계산

        System.out.println(secondVar + "초는 " + minOut + "분 " + secondOut + "초 입니다.");
    }
}
