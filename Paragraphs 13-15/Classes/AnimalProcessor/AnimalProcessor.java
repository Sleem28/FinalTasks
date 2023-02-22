package Classes.AnimalProcessor;

import Classes.Animal.*;
import Classes.AnimalProcessor.Interfaces.*;
import Classes.Zoo.BaseZoo;

import java.util.List;

public class AnimalProcessor implements IAddAnimal, IGetPet, IGetPackAnimal, IGetNames, IGetBirthdays {
    BaseZoo zoo;
    CollectionFinder finder;

    public AnimalProcessor(BaseZoo zoo) {
        this.zoo = zoo;
        finder = new CollectionFinder();
    }

    /**
     * Добавляет животное в соответствующую коллекцию
     * @param animal добавляемое животное
     */
    @Override
    public void addAnimal(BaseAnimal animal) {
        if(animal.getClass().equals(Cat.class)) {

            zoo.getCats().add(animal);
        }
        else if(animal.getClass().equals(Dog.class)){
            zoo.getDogs().add(animal);
        }
        else if(animal.getClass().equals(Humster.class)){
            zoo.getHumsters().add(animal);
        }
        else if(animal.getClass().equals(Donkey.class)){
            zoo.getDonkeys().add(animal);
        }
        else if(animal.getClass().equals(Camel.class)){
            zoo.getCamels().add(animal);
        }
        else if(animal.getClass().equals(Horse.class)){
            zoo.getHorses().add(animal);
        }
        else
            System.out.println("Не верный класс для добавления животного.");

        }

    /**
     *
     * @param type тип вьючного животного Donkey или Camel или Horse
     * @param birthday дата рождения
     * @return Возвращает вьючное животное по дате его рождения
     */
    @Override
    public BaseAnimal getPackAnimal(String type, String birthday) {
        BaseAnimal animal = switch (type) {
            case "Donkey" -> finder.searchByBirthday(zoo.getDonkeys(), birthday);
            case "Camel" -> finder.searchByBirthday(zoo.getCamels(), birthday);
            case "Horse" -> finder.searchByBirthday(zoo.getHorses(), birthday);
            default -> null;
        };

        return animal;
    }

    /**
     *
     * @param type тип домашнего животного Cat или Dog или Humster
     * @param name имя домашнего животного
     * @return Возвращает домашнее животное по его имени
     */
    @Override
    public BaseAnimal getPet(String type, String name) {
        BaseAnimal pet = switch (type) {
            case "Cat" -> finder.searchByName(zoo.getCats(), name);
            case "Dog" -> finder.searchByName(zoo.getDogs(), name);
            case "Humster" -> finder.searchByName(zoo.getHumsters(), name);
            default -> null;
        };

        return pet;
    }

    /**
     * Выводит на экран дни рождения добавленных в коллекции вьючных животных
     * @param type тип вьючного животного
     */
    @Override
    public void getBirthdays(String type) {

        String birthdays = "";
        switch (type) {
            case "Donkey" -> birthdays = getBirthdaysFromCollection(zoo.getDonkeys());
            case "Camel" -> birthdays = getBirthdaysFromCollection(zoo.getCamels());
            case "Horse" -> birthdays = getBirthdaysFromCollection(zoo.getHorses());
        }
        if(birthdays.equals(""))
            System.out.println("Этох животных еще не добавили. Жмите 0 на выход.");
        else
            System.out.println(birthdays);
    }

    /**
     * Выводит на экран имена добавленных в коллекции домашних животных
     * @param type тип домашнего животного
     */
    @Override
    public void getNames(String type) {
        String names = "";
        switch (type) {
            case "Cat" -> names = getNamesFromCollection(zoo.getCats());
            case "Dog" -> names = getNamesFromCollection(zoo.getDogs());
            case "Humster" -> names = getNamesFromCollection(zoo.getHumsters());
        }
        if(names.equals(""))
            System.out.println("Этох животных еще не добавили. Жмите 0 на выход.");
        else
            System.out.println(names);
    }

    private String getBirthdaysFromCollection(List<BaseAnimal> list){
        int counter = 1;
        StringBuilder sb = new StringBuilder();

        for (BaseAnimal item:
             list) {
            sb.append(counter).append(": ").append(item.getBirthday()).append("\n");
            counter++;
        }
        return  sb.toString();
    }

    private String getNamesFromCollection(List<BaseAnimal> list){
        int counter = 1;
        StringBuilder sb = new StringBuilder();

        for (BaseAnimal item:
                list) {
            sb.append(counter).append(": ").append(item.getName()).append("\n");
            counter++;
        }
        return  sb.toString();
    }
}

