import java.util.*;
public class user {
        private static int nextId = 1 ;
        private String name;
        private String numb ;
        private String password;
        private double pay;
        private String rentList = "你当前没有订单";
        private String vip = "普通用户";

    public user() {

    }

    public user(String name , String numb , String password){
            this.name=name;
            this.numb=numb;
            this.password=password;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumb() {
        return numb;
    }

    public void setNumb(String numb) {
        this.numb = numb;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getRentList() {
        return rentList;
    }

    public void setRentList(String rentList) {
        this.rentList = rentList;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }
}
