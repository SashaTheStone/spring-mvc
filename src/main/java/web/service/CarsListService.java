package web.service;

import web.model.Car;

import java.util.List;

public class CarsListService {

    public static List<Car> getCarList(List<Car> modelList, int count) {

        if (count >= 0 && count < 5){
            return modelList.subList(0,count);
        }
        return modelList;
    }

}
