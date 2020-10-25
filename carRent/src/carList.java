class carList {
    private String numb;
    private String name;
    private double price;

    public carList() {
    }

    public carList(String numb, String name, double price) {
        this.numb = numb;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNumb() {
        return numb;
    }

    public void setNumb(String numb) {
        this.numb = numb;
    }
}
