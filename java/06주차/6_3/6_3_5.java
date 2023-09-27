package org.javaro.lecture;

public class Ex5_4 {

    public static void main(String[] args) {

        System.out.println("이지호" + "-" + "20201356" + "-" + "변수"); 
        int temp;
        int[] a = {8, 5, 2, 3, 6};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) { 
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) { 
            System.out.print(a[i] + " ");
        }
    }
}
