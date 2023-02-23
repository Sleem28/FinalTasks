package Classes.AnimalProcessor;

import Classes.Animal.BaseAnimal;
import Classes.Animal.PackAnimal;

import java.util.List;

public class CollectionFinder {
    /**
     * Метод ищет вьючное животное в коллекции по дате рождения
     * @param list коллекция с вьючными животными
     * @param birthday дата рождения вьчного животного
     * @return возвращает найденное животное
     */
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
    /**
     * Метод ищет домашнее животное в коллекции по дате рождения
     * @param list коллекция с домашнини животными
     * @param name имя домашнего животного
     * @return возвращает найденное животное
     */
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
