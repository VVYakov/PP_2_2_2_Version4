package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.Service;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final Service carService;

    @Autowired
    public CarsController(Service carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getAllCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        System.out.println(count);
        List<Car> carList;
        carList = carService.getAllCars(count);
        carList.stream().forEach(System.out::println);
        model.addAttribute("cars", carService.getAllCars(count));
        return "cars";
    }
}
