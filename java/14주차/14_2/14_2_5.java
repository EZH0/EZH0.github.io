package org.javaro.lecture;
public class Ex14_z {
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        MyThreadA.sum=0;
        int threadCount = 4;
        int target = 2000000;
        MyThreadA[] threads = new MyThreadA[threadCount];
        for(int i=0; i<threads.length; i++){
            threads[i] = new MyThreadA(i, target, threadCount);
            threads[i].start();
        }
        for(int i=0; i<threads.length; i++){
            threads[i].join();
        }
        long end = System.currentTimeMillis();
        System.out.println("합계: " + MyThreadA.sum);
        System.out.println("연산 시간: " + (end-start)/1000.0 + "초");
    }
}
class MyThreadA extends Thread {
    public static long sum;
    private int start;
    private int end;
    private int threadCount;
    
    public MyThreadA(int start, int end, int threadCount) {
        this.start = start;
        this.end = end;
        this.threadCount = threadCount;
    }
    
    @Override
    public void run() {
        long temp = 0;
        for(int i = start; i <= end; i += this.threadCount){
            temp = temp + i;
        }
        sum += temp;
    }
}
