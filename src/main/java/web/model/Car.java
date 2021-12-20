package web.model;

import org.springframework.stereotype.Component;


public class Car {
    private String model;
    private long serialNum;
    private String color;

    public Car() {
    }

    public Car(String model, long serialNum, String color) {
        this.model = model;
        this.serialNum = serialNum;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
