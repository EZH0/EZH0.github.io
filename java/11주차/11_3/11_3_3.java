package org.javaro.lecture;
class Ex10_3 {
    public static void main(String[] args) {
        try {
            // java Ex10_3 10 20
            System.out.println("매개변수로 받은 두 개의 값");
            int a = Integer.parseInt(args[0]); // 문자열 인자를 정수로 변환
            int b = Integer.parseInt(args[1]);
            System.out.println("a=" + a + ", b=" + b);
            System.out.println("a/b=" + (a / b));
            System.out.println("나눗셈 수행");
        } catch (ArithmeticException e) {
            // java Ex10_3 10 0
            System.out.println("ArithmeticException 처리루틴:");
            System.out.println(e + " 예외 발생");
        } catch (ArrayIndexOutOfBoundsException e) {
            // java Ex10_3 10
            System.out.println("ArrayIndexOutOfBoundsException 처리루틴:");
            System.out.println(e + " 예외 발생");
        } catch (NumberFormatException e) {
            // java Ex10_3 10 b
            System.out.println("NumberFormatException 처리루틴:");
            System.out.println(e + " 예외 발생");
        } finally {
            System.out.println("예외 처리후 finally 블록 수행");
        }
    }
}
