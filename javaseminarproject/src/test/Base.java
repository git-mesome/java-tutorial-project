package test;

public abstract class Base {

    protected static int[] arr;
    protected static int sum;

    static {
        arr = new int[3];
        sum = 0;
    }

    public boolean order(String menu,int num) {
        if (menu.equals("Americano")) {sum+=(1000*num); return true; }
        else if(menu.equals("Icetea")) {sum+=(1000*num); return true; }
        else if(menu.equals("Latte")) {sum+=(1500*num); return true; }
        else if(menu.equals("OrangeJuice")) {sum+=(2000*num); return true; }
        else if(menu.equals("HoneyBread")) {sum+=(4500*num); return true; }
        else return false;
    }

    protected abstract void provi(String menu, int num);

}
