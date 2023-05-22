package vn.com.simple.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String message(Model model) {
        String msg = "This is a custom message" ;
        model.addAttribute("msg", msg);
        return "GioiThieu";
    }
}
