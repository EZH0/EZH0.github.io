package org.javaro.lecture;

public class Ex7_12 {
    public static void main(String[] args) {
        Animal anim = new Animal();
        anim.setName("야옹이");
        System.out.println(anim.getName() + "는 " + anim.identify());
    }
}

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String identify() {
        return "동물";
    }
}
