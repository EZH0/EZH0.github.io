package org.javaro.lecture;

public class Ex8_11 {
    public static void main(String[] args) {
        Cat3 aCat = new Cat3();  // 객체 생성
        aCat.setName("야옹이");
        System.out.println(aCat.getName() + "의 걸음="+aCat.crawling());
        System.out.println(aCat.getName() + "는 "+aCat.identify());
    }
}

class Animal3 {
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

class Cat3 extends Animal3 {
    public String crawling() {  // 방식을 반환
        return "네발로 걷기";
    }

    @Override
    public String identify() {
        return "고양이";
    }
}
