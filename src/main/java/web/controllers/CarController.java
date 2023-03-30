package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;



@Controller
@RequestMapping("/cars")
public class CarController {

    private CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCars(@RequestParam(value = "count", required = false) String count, Model model) {
        if(count != null  && Integer.parseInt(count) < 5) {
            model.addAttribute("cars", carService.returnGivenNumberCars(Integer.parseInt(count)));
        } else {
            model.addAttribute("cars", carService.returnGivenNumberCars(5));
        }
        return "cars";
    }
}
