package pl.patrykkoc.gitspring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
