package test;

import java.util.*;

public class LatteIsHorse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int num = 0;
        String menu;
        boolean flag = true;

        Boss bo = new Boss();
        PartTime pt = new PartTime();
        System.out.println("************************");
        System.out.println("*  Americano -  1000   *");
        System.out.println("*  Icetea    -  1000   *");
        System.out.println("*  Latte     -  1500   *");
        System.out.println("*  OrangeJuice - 2000  *");
        System.out.println("*  HoneyBread  - 4500  *");
        System.out.println("************************");
        while (flag) {
            total += num;
            if (total >= 3) {
                pt.clean();
                System.out.println("\n");
                total=0;

            }

            System.out.println(" 1. 주문  | 2. 정산 | 4. 종료 ");

            System.out.print("선택(숫자 입력) : ");
            int input = sc.nextInt();


            switch (input) {
                case 1:
                    System.out.print("메뉴와 수량을 입력하세요. : ");
                    menu = sc.next();
                    num = sc.nextInt();

                    int rand = getRandomNumber();

                    Base b;
                    if (rand == 0) {
                        b = bo;
                    } else {
                        b = pt;
                    }
                    if (b.order(menu, num)) {
                        b.provide(menu, num);
                    } else {
                        System.out.println("없는 메뉴입니다. 다시 주문하세요");  //재주문 어케하냐고
                    }
                    break;
                case 2:
                    System.out.println("정산을 시작합니다.");
                    bo.calculator();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
            }
        }
    }


    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(2);
    }
}

