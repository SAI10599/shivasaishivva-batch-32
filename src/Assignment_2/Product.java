package Assignment_2;

public class Product {
    double price;

    public Product() {
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        price = this.price;
    }

    public double getPrice(int quantity) {
        return this.price * (double)quantity;
    }
}