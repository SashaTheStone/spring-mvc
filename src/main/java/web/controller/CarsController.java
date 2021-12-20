package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsListService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "-1") int count,
                            Model model){

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Машинка1", 101, "Зеленый"));
        carList.add(new Car("Машинка2", 102, "Черный"));
        carList.add(new Car("Машинка3", 103, "Синий"));
        carList.add(new Car("Машинка4", 104, "Красный"));
        carList.add(new Car("Машинка5", 105, "Фиолетовый"));

        model.addAttribute("carsList", CarsListService.getCarList(carList,count));

        return "cars";
    }
}
