import java.util.*;

/**
 * @author Lenovo
 */

public class MainInter {

    static int result = 0;
    static Scanner in = new Scanner(System.in);
    static String enter;
    static Admin admin = new Admin("1111", "1111");
    static user user1 = new user();

    static {
        System.out.println("欢迎来到car租车平台！");
    }

    public static void main(String[] args) {

        System.out.println("管理员登录请输入1  用户登录请输入2  退出请输入其他");
        enter = in.nextLine();

        //管理员
        if ("1".equals(enter)) {
            result = loginSystem.login(admin);
            if (result == 1) {
                AdminSystem.windows(admin,user1);
            } else {
                System.out.println("See you!");
                System.exit(0);
            }
        }

        //用户
        else if ("2".equals(enter)) {
            System.out.println("登录请输入1  注册请输入2  退出请输入其他");
            enter = in.nextLine();
            do {
                        if ("1".equals(enter)) {
                            result = loginSystem.login(user1);
                            if (result == 1) {
                                //进入服务
                                UserServe.mainServe(user1);
                            } else {
                                System.out.println("See you!");
                                System.exit(0);
                            }
                        } else if ("2".equals(enter)) {
                            loginSystem.register(user1);
                            enter = "1";
                        }
                    }while ("1".equals(enter));
                }
        }
    }