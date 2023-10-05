package org.javaro.lecture;

public class Ex7_2 {

    public static void main(String[] args) {
        String name, rank, height;

        name = "홍길동";
        rank = "일병";

        System.out.println(name);
        System.out.println(rank);

        height = "170";
        System.out.println(height);

        swimming(name);
        firing(name);
    }

    static void swimming(String name) {
        System.out.println(name + " 잠수하기.");
    }

    static void firing(String name) {
        System.out.println(name + " 대포발사.");
    }
}
