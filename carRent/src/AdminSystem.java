
import java.util.Scanner;

public class AdminSystem {


    public static void windows(Admin admin, user user) {
        Scanner in = new Scanner(System.in);
        String enter;
        System.out.println("欢迎" + admin.getNumb() + "回来！");
        System.out.println("---------------------------");
        do {
            System.out.println("管理用户请输入1   查看用户订单请输入2   新增车辆请输入3     打开租车界面请输入4   退出程序请输入5 ");
            enter = in.nextLine();
            if ("1".equals(enter)) {
                AdminAssist.upUser(user);
                enter = "3";
            }
            //查看用户订单
            else if ("2".equals(enter)) {
                AdminAssist.examine(user);
                enter = "3";
            }
            //新增车辆
            else if ("3".equals(enter)) {
                System.out.println("该功能尚未实现");
                /*
                carList car1 = new carList();
                AdminAssist.addCar(car1);
                 */
            }
            //打开租车界面
            else if("4".equals(enter)){
                ServePrint.carRent();
                enter = "3";
            }
            //
            else {
                System.out.println("See you!");
                System.exit(0);
            }
        } while ("3".equals(enter));
    }
}
