package com.tlk.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test(@PathVariable int a , @PathVariable int b , Model model){
        int result = a + b;
        model.addAttribute("msg" , "Result: " + result);
        return "test";
    }
}
