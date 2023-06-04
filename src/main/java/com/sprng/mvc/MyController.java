package com.sprng.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmpforDetails() {
        return "ask-emp-details-view";
    }

    //    @RequestMapping("/showDetails")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }
    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam("employeeName")String empName, Model model) {
        empName = "Mr. "+empName +"!";
        model.addAttribute("nameAttribute",empName);
        return "show-emp-details-view";
    }
}
