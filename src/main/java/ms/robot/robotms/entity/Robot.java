package ms.robot.robotms.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "robots")

public class Robot {
    String name;
    int height;
    int price;
    int stock;
    List<String> powers;

    public Robot(String name, int height, int price, List<String> powers, int stock) {
        this.name = name;
        this.height = height;
        this.price = price;
        this.powers = powers;
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getPowers() {
        return this.powers;
    }

    public void setPowers(List<String> powers) {
        this.powers = powers;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}