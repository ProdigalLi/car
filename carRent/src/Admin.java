public class Admin {
    private String numb;
    private String password;

    public Admin() {
    }

    public Admin(String numb, String password) {
        this.numb = numb;
        this.password = password;
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
}
