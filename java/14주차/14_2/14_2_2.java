package org.javaro.lecture;
class Ex14_3 {
    public static void main(String[] args) {
        RunNew1 rn1 = new RunNew1();
        Thread t1 = new Thread(rn1);
        t1.start();
    }
}
class RunNew1 implements Runnable {
    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(1000); // 1초 대기
                System.out.println("Thread : " + i);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
