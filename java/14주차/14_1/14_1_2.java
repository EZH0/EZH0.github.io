package org.javaro.lecture;
class Ex14_2 {
    public static void main(String[] args) {
        ThreadNew2 tn1 = new ThreadNew2("**스레드1");
        ThreadNew2 tn2 = new ThreadNew2("**스레드2");
        tn1.start();
        tn2.start();
    }
}

class ThreadNew2 extends Thread {
    public ThreadNew2(String str) {
        super(str);
    }
    public ThreadNew2() {
    }
    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(1000); // 1초 대기
                System.out.println(this.getName()+" "+i);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
