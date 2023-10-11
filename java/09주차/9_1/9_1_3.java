package org.javaro.lecture;

public class Ex7_9 {
    public static void main(String[] args) {
        Student stud1 = new Student("201901", "5", 3);

        // 생성자 이용 초기화
        stud1.exam[0].setSubject("X");
        stud1.exam[1].setSubject("C");
        stud1.exam[2].setSubject("C++");

        stud1.exam[0].setScore(88);
        stud1.exam[1].setScore(91);
        stud1.exam[2].setScore(92);

        stud1.printGPA();
    }
}

class Student {
    String studNo, name;
    int totSubject;
    Exam[] exam;

    public Student(String studNo, String name, int totSubject) {
        this.studNo = studNo;
        this.name = name;
        this.totSubject = totSubject;
        exam = new Exam[totSubject];

        for (int i = 0; i < exam.length; i++) {
            exam[i] = new Exam();
        }
    }

    public void setStudNo(String studNo) {
        this.studNo = studNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getGPA() {
        int sum = 0;
        for (int i = 0; i < exam.length; i++) {
            sum = sum + this.exam[i].getScore();
        }
        return sum;
    }

    public void printGPA() {
        for (int i = 0; i < exam.length; i++) {
            System.out.println("subject:" + this.exam[i].getSubject() + " score = " + this.exam[i].getScore());
        }
        System.out.println("sum = " + this.getGPA());
    }
}

class Exam {
    String subject;
    int score;

    public void setExamScore(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }
}
