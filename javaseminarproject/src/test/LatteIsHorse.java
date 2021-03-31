package test;

import java.util.*;

public class LatteIsHorse {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int total =0;
        int num=0;
        String menu;


        Boss bo = new Boss();
        PartTime pt = new PartTime();

        for(int i=0;i<7;i++) {
            System.out.print("메뉴와 수량을 입력하세요. : ");

            menu = sc.next();
            num=sc.nextInt();

            total+=num;

            int rand = getRandomNumber();

            Base b ;
            if(rand==0) {
                b = bo;
            } else {
                b = pt;
            }
            if(b.order(menu,num)) {
                b.provi(menu, num);
            } else{
                System.out.println("없는 메뉴입니다. 다시 주문하세요");
            }

            if(total >= 3)
            {
                pt.clean();
                total=0;
            }

        }

        System.out.println("목표 주문량 달성, 퇴근!!");
        bo.cal();

    }

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(2);
    }
}
