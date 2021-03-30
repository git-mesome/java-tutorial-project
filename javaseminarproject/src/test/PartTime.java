package test;

public class PartTime extends Base{


    public void provi(String menu,int num){
        System.out.println("주문하신"+menu+" "+num+"잔 나왔습니다. 맛있게 드세용");
        for(int i=0;i<3;i++){
            arr[i]=num;
        }
    };
    public void clean(){
        System.out.println("청소중입니다. 잠시만 기다려주세요");

        Base.arr = new int[3];
        System.gc();
    };
}
