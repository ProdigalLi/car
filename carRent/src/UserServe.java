import java.util.*;

public class UserServe {
    static Scanner in = new Scanner(System.in);
    static String enter;
    static int result;
    static String[] a = new String[0];
    //  调用uerAssist
    public static void mainServe(user user1) {
        do {
            System.out.println("修改密码请输入1   租车请输入2   查看订单请输入3  重新登陆请输入4  退出程序输入5");
            enter = in.nextLine();
            //修改密码
            if ("1".equals(enter)) {
                userAssist.chPassword(user1);
            }
            //租车
            else if ("2".equals(enter)) {
                if("你当前没有订单".equals(user1.getRentList())){
                    userAssist.rent(user1);
                    enter=userAssist.renew(enter);
                }
                else {
                    System.out.println("一个用户只能拥有一个未完成订单");
                }
            }
            //查看订单
            else if ("3".equals(enter)) {
                System.out.println(user1.getRentList());
                enter=userAssist.renew(enter);
            }
            // 重新登陆
            else if ("4".equals(enter)) {
                MainInter.main(a);
                /*
                result = loginSystem.login(user1);
                if (result == 1) {
                    //进入服务
                    mainUserServe.mainServe(user1);
                }
                else {
                    System.exit(0);
                }
                */
            }
            //退出系统
            else {
                System.out.println("See you!");
                System.exit(0);
            }
        } while ("2".equals(enter));
    }

}
