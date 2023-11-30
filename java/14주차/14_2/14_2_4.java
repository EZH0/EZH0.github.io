package org.javaro.lecture;
class Ex14_y {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for(int i = 0; i < 200000001; i++) { // 1부터 2억까지
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("합계=" + sum);
        System.out.println("CPU 시간=" + (endTime - startTime) / 1000.0 + "초");
    }
}
