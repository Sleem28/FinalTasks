package Classes.AnimalProcessor.Interfaces;

import Classes.Animal.BaseAnimal;
import Classes.Animal.Pet;

public interface IGetPet {
    BaseAnimal getPet(String type,String name);
}
