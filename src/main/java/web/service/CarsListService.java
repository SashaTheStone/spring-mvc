package web.service;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarsListService {



    public static List<Car> getCarList(int count) {

        if (count >= 0 && count < 5){
            return CarDao.retCarListFromDB().subList(0,count);
        }

        return CarDao.retCarListFromDB();
    }

}
