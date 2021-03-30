package test;

public class Boss extends Base{

    @Override
    public void provi(String menu,int num){
        System.out.println("주문하신"+menu+" "+num+"잔 나왔습니다. 맛있게 드셔요!!");
        for(int i=0;i<2;i++){
            arr[i]=num;
        }
    };
    public void cal(){
        System.out.println("오늘 하루 매출액은 총"+sum+"원 입니다.");
    };
}
