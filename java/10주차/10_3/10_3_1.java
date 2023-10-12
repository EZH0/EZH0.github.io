package org.javaro.lecture;

public class Ex8_14 {
    public static void main(String[] args) {
        BeverageX coke = new BeverageX("콜라", 2000, 15);
        coke.printTitle();
        coke.printData();

        // Beverage tea = new Beverage();
        // tea.setProduct("녹차");
        // tea.setPrice(3000);
        // tea.setQuantity(20);
        BeverageX tea = new BeverageX("녹차", 3000, 20);
        tea.printData();

        Liquor vodka = new Liquor("보드카", 2000, 2, 35.0f);
        vodka.printTitle();
        vodka.printData();

        int sum = coke.getTotal() + tea.getTotal() + vodka.getTotal();
        System.out.println("전체 합계=" + sum);
    }
}

class BeverageX {
    String product;
    int price;
    int quantity;

    public BeverageX(String product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return this.product;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getTotal() {
        return this.price * this.quantity;
    }

    void printTitle() {
        System.out.println("제품명\t단가\t수량\t금액");
    }

    void printData() {
        System.out.println(this.product + "\t" + this.price + "\t" + this.quantity + "\t" + this.getTotal());
    }
}

class Liquor extends BeverageX {
    float alcohol;

    public Liquor(String product, int price, int quantity, float alcohol) {
        super(product, price, quantity);
        this.alcohol = alcohol;
    }

    void printData() {
        System.out.println(this.product + "(" + this.alcohol + "도)" + "\t" + this.price + "\t" + this.quantity + "\t" + this.getTotal());
    }
}
