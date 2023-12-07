package javatest;
import java.io.*;
import java.util.*;

public class myCSVMenu {
    public static void main(String[] args) {
        int menu;
        boolean check = true;
        float[][] indat = new float[10][3];

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("----메뉴----");
            System.out.println("1. 열기");
            System.out.println("2. 저장");
            System.out.print("메뉴 선택하세요:");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("열기");
                    try {
                        File csv = new File("C:\\\\Users\\\\Public\\\\123\\\\1.csv");
                        BufferedReader br = new BufferedReader(new FileReader(csv));
                        String line = null;
                        int row=0;
                        do {
                            line = br.readLine(); // 한 줄 읽기
                            if(line!=null){
                                String[] token = line.split(",", -1); // 1번을 의미하는 마지막 ","이 빠진 경우 읽기 위함
                                for(int i=0; i<3; i++) {
                                    indat[row][i] = Float.parseFloat(token[i]);
                                }
                                for(int i=0; i<3; i++) {
                                    System.out.print(indat[row][i] + ",");
                                }
                                System.out.println("");
                                row++;
                            }
                        } while(line != null);
                        br.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    check = false;
                    FileOutputStream out = null;
                    try {
                        out = new FileOutputStream("C:\\\\Users\\\\Public\\\\123\\\\2.csv");
                        for(int i=0; i<10; i++) {
                            for(int j=0; j<3; j++) {
                                out.write((Float.toString(indat[i][j]).getBytes("utf-8")));
                                out.write(",".getBytes("utf-8"));
                            }
                            out.write("\n".getBytes("utf-8"));
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try { out.close(); } catch (IOException e) { }
                    }
                    System.out.println("저장하고 종료합니다");
                    check = false;
                    break;
                default:
                    System.out.println("잘못된 입력값, 새로운 입력하세요");
            }
        } while(check);
        scan.close();
    }
}
