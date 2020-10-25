import java.util.Scanner;

public class loginSystem {

    static Scanner in = new Scanner(System.in);

    //管理员专用
    public static int login(Admin admin) {
        String enter3;
        do {
            System.out.println("请输入管理员账号：");
            String enter1 = in.nextLine();
            System.out.println("请输入管理员密码：");
            String enter2 = in.nextLine();

            //登录判断
            if (enter1.equals(admin.getNumb()) && enter2.equals(admin.getPassword())) {
                System.out.println("登陆成功！");
                return 1;
            } else {
                System.out.println("账号或密码错误，再试一遍请输入1   退出系统请输入2  ");
                enter3 = in.nextLine();
            }
        } while ("1".equals(enter3));
        return 0;
    }

    //用户专用
    public static void register(user users) {
        System.out.println("请输入用户名：");
        users.setName(in.nextLine());
        System.out.println("请输入账号：");
        users.setNumb(in.nextLine());
        System.out.println("请输入密码：");
        users.setPassword(in.nextLine());
        System.out.println("注册成功，请重新登录。");
    }

    public static int login(user user1) {

        String enter3;//密码错误出入口

        do {
            System.out.println("请输入账号：");
            String enter1 = in.nextLine();
            System.out.println("请输入密码：");
            String enter2 = in.nextLine();

            //登录判断
            if (enter1.equals(user1.getNumb()) && enter2.equals(user1.getPassword())) {
                System.out.println("登陆成功！");
                return 1;
            } else {
                System.out.println("账号或密码错误，再试一遍请输入1  注册账号请输入2  忘记密码请输入3  退出系统请输入其他任意键。");
                enter3 = in.nextLine();
                //注册
                if ("2".equals(enter3)) {
                    register(user1);
                    enter3 = "1";
                }
                //忘记密码
                while ("3".equals(enter3)) {
                    System.out.println("请输入账号：");
                    String enter4 = in.nextLine();

                    //检测账号并返回密码
                    //账号正确
                    if (enter4.equals(user1.getNumb())) {
                        System.out.println("你的密码是：" + user1.getPassword());
                        System.out.println("重新登录请输入1  退出系统请输入3  ");
                        enter3 = in.nextLine();
                    }
                    //账号错误
                    else {
                        System.out.println("该账号不存在，再试一次请输入1  退出系统请输入2 ");
                        enter3 = in.nextLine();
                        if ("1".equals(enter3)) {
                            enter3 = "3";
                        } else {
                            enter3 = "others";
                        }
                    }
                }
            }
        } while ("1".equals(enter3));
        return 0;
    }
}
