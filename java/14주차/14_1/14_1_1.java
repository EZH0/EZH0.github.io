package org.javaro.lecture;

class Ex14_1 {
    public static void main(String[] args) {
        ThreadNew1 tn1 = new ThreadNew1();
        tn1.start();
    }
}

class ThreadNew1 extends Thread {
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
