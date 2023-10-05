package org.javaro.lecture;

public class Ex6_test_1 {
	public static void main(String[] args) {
		String korean;
		
        String gender = "female";
        korean = fnGender(gender);
        System.out.println(korean);
        
        gender = "male";
        korean = fnGender(gender);
        System.out.println(korean);

    }

    static String fnGender(String gender) {
    	String kgender = "";
        if (gender=="female") {
        	kgender = "여자";
        } else if (gender=="male") {
        	kgender = "남자";
        }
    	return kgender;
    }
}
