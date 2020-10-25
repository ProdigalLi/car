import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServePrint {
    static Scanner in = new Scanner(System.in);

    static carList car = new carList("1", "car", 200);
    static carList turck = new carList("2", "turck", 400);
    static carList bicycle = new carList("3", "bicycle", 4);
    static List<String> c = new ArrayList<>();

    public static void pList(user user1){
        int price = 0;
        int day = 0;
        double sum;
        String enter1;
        String carName = null;
        //打印租车界面
        carRent();
        //
        System.out.println("输入你想租用车辆的编号：");
        enter1 = in.nextLine();
        switch (enter1) {
            case "1":
                price = 200;
                carName = car.getName();
                break;
            case "2":
                price = 400;
                carName = turck.getName();
                break;
            case "3":
                price = 4;
                carName = bicycle.getName();
                break;
            default:
        }

        System.out.println("输入你想租用的天数：");
        day = in.nextInt();

        sum = price * day;
        user1.setPay(sum);

        if (carName != null){
            user1.setRentList("用户"+user1.getName()+"租用的车为：" + carName + "  租用的天数为：" + day + "  总金额为：" + sum+" 元。");
        }
    }

    public static void carRent() {
        addCar();
        System.out.println("********************************");
        System.out.println("              价格表             ");
        System.out.println("  编号     种类       价格(元/天)  ");
        for (String s : c) {
            System.out.println(s);
        }
        c.clear();
        System.out.println("tips:每位用户只能同时租用一台车。");
        System.out.println("********************************");
    }

    public static void addCar(){
        c.add(exChange(car));
        c.add(exChange(turck));
        c.add(exChange(bicycle));
    }

    public static String exChange(carList car) {
        String c = null;
        c="    " + car.getNumb() + "      " + car.getName() + "\t" + car.getPrice() + "     ";
        return c;
    }
}