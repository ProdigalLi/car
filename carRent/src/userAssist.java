import java.util.Scanner;

    //被mainUserServe调用

public class userAssist {
    static Scanner in = new Scanner(System.in);

    //修改密码
    public static void chPassword(user user1) {
        System.out.println("请输入新的密码：");
        user1.setPassword(in.nextLine());
        System.out.println("密码修改成功,请重新登录");
    }

    //租车
    public static void rent(user user1) {
        ServePrint.pList(user1);
        System.out.println("你需要支付：" + user1.getPay() + "元");
    }

    //返回服务界面与登出
    //mainUserServe专用
    public static String renew(String enter){
        String test;
        System.out.println("返回服务界面输入1  退出登陆输入2  ");
        test = in.nextLine();
        if ("1".equals(test)){
            enter = "2";
        }
        else{
            enter = "3";
        }
        return enter;
    }
}
