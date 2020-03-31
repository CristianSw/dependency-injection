package spring.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class MyControllerGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from my own Greeting";
    }
}
