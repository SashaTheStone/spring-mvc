package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao {


    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Машинка1", 101, "Зеленый"));
        carList.add(new Car("Машинка2", 102, "Черный"));
        carList.add(new Car("Машинка3", 103, "Синий"));
        carList.add(new Car("Машинка4", 104, "Красный"));
        carList.add(new Car("Машинка5", 105, "Фиолетовый"));
    }

    public static List<Car> retCarListFromDB(){
        return carList;
    }

}
