package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5")
                                int count, ModelMap model) {
        List<Car> carList = carService.getCar(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
