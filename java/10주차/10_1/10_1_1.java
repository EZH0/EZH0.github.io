package org.javaro.lecture;
public class Ex8_11 {
    public static void main(String[] args) {
        Cat4 aCat = new Cat4();  // 객체 생성
        aCat.setName("아이유");
        System.out.println(aCat.getName() + "의 장점=" + aCat.crawling());
        System.out.println(aCat.getName() + "는 " + aCat.identify());
        System.out.println(aCat.getName() + "는 원래 " + aCat.identifyOrigin());
    }
}
class Animal4 {
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
class Cat4 extends Animal4 {
    public String crawling() {  // 방식을 반환
        return "네발로 걷기";
    }

    @Override
    public String identify() {
        return "고양이";
    }

    public String identifyOrigin() {
        String str = super.identify();
        return str;
    }
}
