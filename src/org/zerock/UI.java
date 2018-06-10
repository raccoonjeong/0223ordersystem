package org.zerock;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    FileRead menus;
    Scanner scanner;
    OrderManager order;

    public UI() {
        this.scanner = new Scanner(System.in);
        this.menus = new FileRead();
        this.order = new OrderManager();
    }

    public void play(){

        this.menus.menuList();

        Outer:
        while(true) {
            this.start();
            System.out.println("추가 주문(Y) | 주문 완료(N) | 주문 삭제(D)");
            Character answer = scanner.next().charAt(0);

            switch (answer){
                case 'y'|'Y':
                    break;
                case 'n'|'N':
                    end();
                    break Outer;
                case 'd'|'D':
                    delete();
                    break;
                default:
                    System.out.println("다시 주문해주세요.");
                    break;
            }
        }
    }


    public void start(){
        menus.showMenu();
        System.out.println("주문 번호를 입력하세요..");
        int num = scanner.nextInt();
        System.out.println("수량을 입력하세요.");
        int count = scanner.nextInt();
        order.setOrder(num, count);
        System.out.println("=============메뉴이름   가격  수량  총합========");
        order.getOrderList();
    }

    public void end(){
        int totalCost = this.order.totalPrice(this.order.orderlist);
        System.out.println("주문하신 총 금액은 "+totalCost+"원입니다.");
    }

    public void delete(){
        System.out.println("삭제하실 음식을 입력해주세요.");
        String name = scanner.next();
        System.out.println("취소할 수량을 입력해주세요.");
        int num = scanner.nextInt();
        order.removeMenu(name, num);
        System.out.println("=============메뉴이름   가격  수량  총합========");
        order.getOrderList();
    }
}
