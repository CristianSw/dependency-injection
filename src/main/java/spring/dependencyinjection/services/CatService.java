package spring.dependencyinjection.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("homeAnimal")
public class CatService implements PetService {

    @Override
    public String sayAnimal() {
        return "The best are cats !";
    }
}
