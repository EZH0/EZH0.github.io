package org.javaro.lecture;

class Ex7_1 {
    public static void main(String[] args) {
        NavySoldier kdhong;

        kdhong = new NavySoldier("19");

        System.out.println(kdhong.name);
        System.out.println(kdhong.rank);

        kdhong.setHeight("170");
        System.out.println(kdhong.getHeight());

        kdhong.swimming();
        kdhong.firing();
    }
}
