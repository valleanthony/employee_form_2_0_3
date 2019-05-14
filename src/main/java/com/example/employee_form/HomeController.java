package com.example.employee_form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("emp",new Employee());
        return "form";
    }

    @PostMapping("/form")
    public String sendForm(@ModelAttribute Employee emp, Model model){
        model.addAttribute("emp",emp); // is this right?
        return "confirmemp";

    }


}
