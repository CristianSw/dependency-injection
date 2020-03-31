package spring.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service("homeAnimal")
public class DogService implements PetService {

    @Override
    public String sayAnimal() {
        return "The best are dogs !";
    }
}
