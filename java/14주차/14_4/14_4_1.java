package org.javaro.lecture;
import java.util.Scanner;

public class Ex13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 개, 2. 고양이");
        int select = sc.nextInt();
        Animal animal; // 동물을 선택

        if(select == 1) {
            animal = new Dog(); // 개를 선택
            animal.eat();
        } else if(select == 2) {
            animal = new Cat(); // 고양이를 선택
            animal.eat();
        }
        sc.close();
    }
}
