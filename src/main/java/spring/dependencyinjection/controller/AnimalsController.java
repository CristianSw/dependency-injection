package spring.dependencyinjection.controller;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.dependencyinjection.services.PetService;

@Controller
public class AnimalsController {
    private final PetService petService;

    public AnimalsController(@Qualifier("homeAnimal") PetService petService) {
        this.petService = petService;
    }

    public String whichAreTheBest() {
        return petService.sayAnimal();
    }
}
