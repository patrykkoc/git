package pl.patrykkoc.gitspring.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {


    @GetMapping("/name")
    String myName(){
        return "Patryk";
    }
    @GetMapping("/age")
    String myAge(){
        return "12";
    }
}
