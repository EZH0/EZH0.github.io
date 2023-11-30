package org.javaro.lecture;
class Ex14_6 {
    public static void main(String args[]) {
        Bank atm = new Bank("ATM");
        Bank front = new Bank("창구");
        atm.start();
        front.start();
    }
}

class AccountX1 {
    int balance = 10000; // 계좌 초기 잔액은 10000

    public synchronized void withdraw(String name, int amount) { // 동기화 메소드
        if(this.balance >= amount) {
            try {
                Thread.sleep(1000); // 1초 대기
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            this.balance = this.balance - amount; // 잔액 감소
            System.out.println("인출자="+name+", 인출액="+amount+", 인출시각="+System.nanoTime());
        }
    }
}
class Bank1 extends Thread {
    public Bank1() { }
    public Bank1(String name) { super(name); }
    static AccountX obj = new AccountX();

    @Override
    public void run() {
        while(true) { // 무한 루프
            int amount = (int)(Math.random()*4+1)*100; // 인출 금액 랜덤 생성
            if(obj.balance >= amount) {
                System.out.println(this.getName()+" : 인출 전 잔액="+obj.balance);
                obj.withdraw(this.getName(), amount);
                System.out.println(this.getName()+" : 인출 후 잔액="+obj.balance);
            } else {
                System.out.println("잔고 부족");
                break;
            }
        }
    }
}
