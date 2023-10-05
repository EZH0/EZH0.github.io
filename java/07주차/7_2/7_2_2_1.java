package org.javaro.lecture;

class NavySoldier {
    String name;
    String rank;
    String height;

    // 생성자
    NavySoldier(String name) {
        this.name = name;
        this.rank = "일병";
    }

    void setHeight(String height) {
        this.height = height;
    }

    String getHeight() {
        return this.height;
    }

    void swimming() {
        System.out.println(name + " 잠수하기.");
    }

    void firing() {
        System.out.println(name + " 대포발사.");
    }
}
