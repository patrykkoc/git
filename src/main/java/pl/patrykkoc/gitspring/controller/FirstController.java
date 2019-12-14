package pl.patrykkoc.gitspring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.patrykkoc.gitspring.Person;

@Controller
public class FirstController {

Person p;

    public FirstController(){
        p = new Person("Patryk","Koc",11);
    }

    @GetMapping(name ="/")
    public Person FirstContr(){


        return  p;
    }

}
