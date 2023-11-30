package org.javaro.lecture;
class Ex14_4 {
    public static void main(String[] args) {
        RunNew2 rn1 = new RunNew2("스레드1");
        RunNew2 rn2 = new RunNew2("스레드2");
        Thread t1 = new Thread(rn1);
        Thread t2 = new Thread(rn2);
        t1.start();
        t2.start();
    }
}
class RunNew2 implements Runnable {
    private String str;
    
    public RunNew2(String str) {
        this.str = str;
    }
    
    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(1000); // 1초 대기
                System.out.println(this.str + " : " + i);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
