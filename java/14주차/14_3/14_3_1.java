package org.javaro.lecture;
public class Ex7_11 {
    public static void main(String[] args) {
        Studentx stud1 = new Studentx();
        stud1.setStudNo("20xx1234");
        stud1.setName("홍길동");
        System.out.println(stud1.getStudNo());
        System.out.println(stud1.getName());
    }
}
class Studentx { // 클래스 정의
    String studNo, name;

    public void setStudNo(String studNo) { // 학번 설정
        this.studNo = studNo;
    }

    public void setName(String name) { // 이름 설정
        this.name = name;
    }

    public String getStudNo() { // 학번 반환
        return this.studNo;
    }

    public String getName() { // 이름 반환
        return this.name;
    }
}
