package org.zerock;

public class Order {

    String name;
    int price;
    int count;
    int cost;

    public Order(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.cost = this.price * this.count;
    }


    @Override
    public String toString() {
        return "주문하신 음식: "+name +"  "+ price+"  " + count+"  " + cost;
    }
}
