package spring.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"RO", "default"})
@Service("I18nService")
public class I18nRomanianService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Salut aceasta e Romana";
    }
}
