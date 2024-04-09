package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServicelmpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarServicelmpl carServicelmpl;
    @Autowired
    public CarController(CarServicelmpl carServicelmpl) {
        this.carServicelmpl = carServicelmpl;
    }

    @GetMapping()
    public String cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count == null || count >= 5) {
            model.addAttribute("cars", carServicelmpl.index());
        } else {
            model.addAttribute("cars", carServicelmpl.show(count));
        }
        return "cars";
    }
}
