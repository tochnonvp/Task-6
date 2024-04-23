package web.model;


public class Car {
    private String Brand;
    private String color;

    public Car() {
    }

    public Car(String model, String color, int price) {
        this.Brand = model;
        this.color = color;
        this.price = price;
    }

    private int price;

    public String getModel() {
        return Brand;
    }

    public void setModel(String model) {
        this.Brand = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                Brand  +
                        color +
                        price
                ;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
