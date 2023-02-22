package Classes.AnimalProcessor;

import Classes.Animal.BaseAnimal;
import Classes.Animal.PackAnimal;

import java.util.List;

public class CollectionFinder {
    public BaseAnimal searchByBirthday(List<BaseAnimal> list, String birthday){
        BaseAnimal animal = null;
        for (BaseAnimal item:
             list) {
            if(item.getBirthday().equals(birthday)){
                animal = item;
                break;
            }
        }
        return animal;
    }

    public BaseAnimal searchByName(List<BaseAnimal> list, String name){
        BaseAnimal animal = null;
        for (BaseAnimal item:
                list) {
            if(item.getName().equals(name)){
                animal = item;
                break;
            }
        }
        return animal;
    }
}
