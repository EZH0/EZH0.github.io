package org.javaro.lecture;
import java.io.*;

class Ex11_13 {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("이름을 입력하시오:");
            String name = br.readLine();
            System.out.println("이름은 " + name + "입니다");

        } catch(IOException ioe) {
            System.out.println("입력 오류");
        }
    }
}
