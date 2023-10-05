package org.javaro.lecture;

public class Ex6_3 {

    public static void main(String[] args) {

        String gender = "female";
        fnGender(gender);

        gender = "male";
        fnGender(gender);

    }

    static void fnGender(String gender) {
        if (gender=="female") {
            System.out.println("여자");
        } else if (gender=="male") {
            System.out.println("남자");
        }
    }
}
