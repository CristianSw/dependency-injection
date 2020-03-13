package spring.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.dependencyinjection.services.GreetingService;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("I18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
