package org.javaro.lecture;
public class Ex8_12 {
    public static void main(String[] args) {
        Pine pine = new Pine("3.5", "소나무");
        System.out.println("높이(m):" + pine.getHeight());
        System.out.println("종류:" + pine.getSpecies());
    }
}
class Tree {
    String height;

    public Tree(String height) {  // 생성자
        this.height = height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return this.height;
    }
}
class Pine extends Tree {  // 파생 클래스 생성
    String species;  // 종류를 저장

    public Pine(String height, String species) {  // 생성자
        super(height);
        this.species = species;
    }

    public void setSpecies(String species) {  // 종류 설정
        this.species = species;
    }

    public String getSpecies() {  // 종류 가져오기
        return this.species;
    }
}
