package org.javaro.lecture;

public class Ex3_2 {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("A 학점입니다");
        } else if (score < 90 && score >= 80) {
            System.out.println("B 학점입니다");
        } else if (score < 80 && score >= 70) {
            System.out.println("C 학점입니다");
        } else if (score < 70 && score >= 60) {
            System.out.println("D 학점입니다");
        } else {
            System.out.println("F 학점입니다");
        }
    }
}
