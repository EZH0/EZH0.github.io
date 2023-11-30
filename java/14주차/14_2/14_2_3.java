package org.javaro.lecture;
class Ex14_x {
    public static void main(String[] args) {
        try {
            for(int i=0; i<5; i++) { // 총 5번 생성 및 실행
                MyThread mt = new MyThread(i+1);
                mt.start();
                mt.join(); // 스레드 종료 대기
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
class MyThread extends Thread {
    private int x;
    
    public MyThread(int x) {
        this.x = x;
    }
    
    @Override
    public void run() {
        try {
            for(int i = 0; i < 2; i++) {
                Thread.sleep(1000); // 1초 대기
                System.out.println(this.getName() + " : " + i);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
