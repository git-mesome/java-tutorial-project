package test;

import java.util.HashMap;
import java.util.Map;

public abstract class Base {

    protected static int[] arr;
    protected static int sum;
    private Map<String, Integer> menuItem = new HashMap<>()
    {{
        put("Americano", 1000);
        put("Icetea", 1000);
        put("Latte", 1500);
        put("OrangeJuice", 2000);
        put("HoneyBread", 4500);

    }};

    static {
        arr = new int[3];
        sum = 0;
    }

    public boolean order(String menu,int num) {
        if(menuItem.containsKey(menu)){
            sum+=(num*menuItem.get(menu));
            return true;
        }else{
            return false;
        }
    }

    protected abstract void provi(String menu, int num);

}
/*  **해시맵 사용전 코드
if (menu.equals("Americano")) {sum+=(1000*num); return true; }
          else if(menu.equals("Icetea")) {sum+=(1000*num); return true; }
          else if(menu.equals("Latte")) {sum+=(1500*num); return true; }
          else if(menu.equals("OrangeJuice")) {sum+=(2000*num); return true; }
          else if(menu.equals("HoneyBread")) {sum+=(4500*num); return true; }
          else return false;*/

/* Map.of    10개이상 개수 제한
    Map<String,Integer> menuItem = Map.of(
        "Americano",1000,
        "Latte",2000
     );
 */