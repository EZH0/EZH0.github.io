package org.javaro.lecture;
import java.util.*;

public class BookMenu {
    public static void main(String[] args) {
        int menu;
        boolean check = true;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("----메뉴----");
            System.out.println("1. 책등록");
            System.out.println("2. 책삭제");
            System.out.println("3. 대출");
            System.out.println("4. 반납");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택>>");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("책 등록");
                    break;
                case 2:
                    System.out.println("책 삭제");
                    break;
                case 3:
                    System.out.println("대출");
                    break;
                case 4:
                    System.out.println("반납");
                    break;
                case 5:
                    System.out.println("종료합니다");
                    check = false;
                    break;
                default:
                    System.out.println("잘못된 입력값, 새로 입력해주세요");
            }
        } while(check);

        scan.close();
    }
}
