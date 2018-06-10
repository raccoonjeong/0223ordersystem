package org.zerock;

public class Menu {

    int index;
    String name;
    int price;

    public Menu(int index, String name, int price) {
        this.index = index;
        this.name = name;
        this.price = price;
    }
    public Menu(){
        this.index = index;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return index + " : " + name + "  " + price;
    }
}
