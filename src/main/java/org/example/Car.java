package org.example;

public class Car
{
    private int price;
    private int engineSize;

    public Car(int price, int engineSize) {
        this.price = price;
        this.engineSize = engineSize;
    }

    public int getPrice() {
        return price;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", engineSize=" + engineSize +
                '}';
    }
}
