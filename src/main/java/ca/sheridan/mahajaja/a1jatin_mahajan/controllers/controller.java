package ca.sheridan.mahajaja.a1jatin_mahajan.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {
    @GetMapping("/")
    public String home(){
        return "home.html";
    }
}
