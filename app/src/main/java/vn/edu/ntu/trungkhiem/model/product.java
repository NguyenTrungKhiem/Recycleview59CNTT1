package vn.edu.ntu.trungkhiem.model;

public class product
{
    String Name;
    int Price;
    String Des;

    public product(String name, int price, String des) {
        Name = name;
        Price = price;
        Des = des;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }
}
