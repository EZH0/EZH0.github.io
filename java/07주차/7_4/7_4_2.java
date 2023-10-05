package org.javaro.lecture;

public class Ex7_11 {
    public static void main(String[] args) {
        Studentx stud1 = new Studentx();
        
        stud1.setStudNo("20201356");
        stud1.setName("이지호");

        System.out.println(stud1.getName());
        System.out.println(stud1.getStudNo());
    }
}

class Studentx { 
    // 멤버 변수 선언
    String studNo, name;

    public void setStudNo(String studNo) {
        this.studNo = studNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudNo() {
        return this.studNo;
    }
    public String getName() {
        return this.name;
    }
}

