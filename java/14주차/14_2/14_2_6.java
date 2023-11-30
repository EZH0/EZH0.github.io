package org.javaro.lecture;
class Ex14_5 {
    public static void main(String args[]) {
        Bank atm = new Bank("ATM");
        Bank front = new Bank("창구");
        atm.start();
        front.start();
    }
}

class AccountX {
    int balance = 10000; // 계좌 초기 잔액은 10000

    public void withdraw(String name, int amount) {
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
class Bank extends Thread {
    public Bank() { }
    public Bank(String name) { super(name); }
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
