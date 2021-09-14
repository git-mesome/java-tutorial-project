package test;

public class PartTime extends Base {

  @Override
  public void provide(String menu, int num) {
    System.out.println("주문하신" + menu + " " + num + "잔 나왔습니다. 맛있게 드세용");
    value++;
  }

  public void clean() {
    System.out.println("청소중입니다. 잠시만 기다려주세요");
    value = 0;
  }

}
