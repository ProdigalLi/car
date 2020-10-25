
import java.util.Scanner;

public class AdminAssist {

    static Scanner in = new Scanner(System.in);
    static String enter = null;
    //管理用户(创立VIP用户)

    public static void upUser(user user) {
        if (user.getNumb() == null) {
            System.out.println("当前没有用户");
            System.out.println("返回服务界面请输入1    退出程序请输入2  ");
            enter = in.nextLine();
            if ("1".equals(enter)) {
                return;
            } else {
                System.exit(0);
            }
        }
        System.out.print("普通用户：");
        if ("普通用户".equals(user.getVip())) {
            System.out.print(user.getName());
        }
        System.out.println();
        System.out.print("VIP用户：");
        if ("VIP用户".equals(user.getVip())) {
            System.out.print(user.getName());
        }
        System.out.println();


        System.out.println("---------------------");

        System.out.println("升级用户请输入1     降级用户请输入2      返回服务界面请输入3");
        enter = in.nextLine();
            if ("1".equals(enter)) {
                if ("普通用户".equals(user.getVip())) {
                    user.setVip("VIP用户");
                    System.out.println(user.getName() + "已成功升级");
                } else if ("VIP用户".equals(user.getVip())) {
                    System.out.println(user.getName() + "已经是VIP用户");
                }
            } else if ("2".equals(enter)) {
                if ("VIP用户".equals(user.getVip())) {
                    user.setVip("普通用户");
                    System.out.println(user.getName() + "已成功降级");
                } else if ("普通用户".equals(user.getVip())) {
                    System.out.println(user.getName() + "已经是普通用户");
                }
            }
    }

    //查看用户订单

    public static void examine(user user) {
        if ("你当前没有订单".equals(user.getRentList())) {
            System.out.println("当前没有用户下单");
        }
        else {
            System.out.println("当前未完成的用户订单：");
            System.out.println(user.getRentList());
        }
    }

    //添加车辆

    public static carList addCar(carList car1) {
        System.out.println("请输入新增车辆的编号：");
        car1.setNumb(in.nextLine());
        System.out.println("请输入新增车辆的类型");
        car1.setName(in.nextLine());
        System.out.println("请输入新增车辆的价格");
        car1.setPrice(in.nextDouble());
        return car1;
    }

    //功能结束

    public static String systemOver() {
        String enter = null;
        System.out.println("返回服务界面请输入1   退出系统请输入2");
        enter = in.nextLine();
        return enter;
    }
}
