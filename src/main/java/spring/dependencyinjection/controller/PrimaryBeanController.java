package spring.dependencyinjection.controller;

import org.springframework.stereotype.Controller;
import spring.dependencyinjection.services.GreetingService;

@Controller
public class PrimaryBeanController {

    GreetingService greetingService;

    public PrimaryBeanController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
