package org.zerock;

import java.util.ArrayList;

public class OrderManager {

    ArrayList<Order> orderlist;
    ArrayList<Menu> menulist;
    FileRead fileRead;

    public OrderManager() {
        this.orderlist = new ArrayList<>();
        this.fileRead = new FileRead();
    }

    public void getOrderList(){
        for(Order order : this.orderlist){
            System.out.println(order);
        }
    }

    public void setOrder(int num, int count){
        this.menulist = fileRead.menuList();
        Menu menu = this.menulist.get(num - 1);
        this.orderlist.add(new Order(menu.name,menu.price, count));
    }

    public int totalPrice(ArrayList<Order> orders){
        int totalCost = 0;
        for(Order order : orders){
            totalCost += order.cost;
        }
        return totalCost;
    }

    public void removeMenu(String name, int num){
        for (Order order : this.orderlist){
            if (order.name.equalsIgnoreCase(name)){
                order.count -= num;
                order.cost -= num * order.price;
                System.out.println("선택하신 \"+order.name+\" 메뉴가 \"+num+\" 만큼 취소되었습니다.");
                break;
            }
        }

    }
}
