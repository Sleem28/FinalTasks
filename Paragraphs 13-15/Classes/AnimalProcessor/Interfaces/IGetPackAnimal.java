package Classes.AnimalProcessor.Interfaces;

import Classes.Animal.BaseAnimal;
import Classes.Animal.PackAnimal;

public interface IGetPackAnimal{
    BaseAnimal getPackAnimal(String type, String birthday);
}
