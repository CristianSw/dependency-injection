package spring.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.dependencyinjection.services.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
