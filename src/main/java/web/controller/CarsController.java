package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsListService;


@Controller
public class CarsController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "-1") int count,
                            Model model){

        model.addAttribute("carsList", CarsListService.getCarList(count));
        return "cars";
    }
}
