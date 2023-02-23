package Classes.AnimalCreator;

import Classes.Animal.*;
import jdk.jfr.StackTrace;


public class AnimalCreator implements CreateAnimals{
    ParamsGetter paramsGetter;
    String name;
    int legs;
    String birthday;
    double height;
    double weight;

    /**
     * Класс создает животных
     * @param paramsGetter класс беружий параметры из консоли
     */
    public AnimalCreator(ParamsGetter paramsGetter) {
        this.paramsGetter = paramsGetter;
    }

    @Override
    public Cat createCat() {
        Cat tmp = null;
        this.name = paramsGetter.getName("Кота");
        this.legs = paramsGetter.getLegs("Кота");
        this.birthday = paramsGetter.getBirthday("Кота");
        this.height = paramsGetter.getHeight("Кота");
        this.weight = paramsGetter.getWeight("Кота");

        try{
            if(this.name==null || this.legs<1 || this.birthday==null || this.height < 0 || this.weight<0){
                throw new RuntimeException("Неверные параметры для создания кота");
            }
            tmp = new Cat(this.name,this.legs,this.birthday,this.height,this.weight);
            AnimalCounter.add();
            System.out.println("Кот создан.\n");
        }catch (Exception e){
            e.getStackTrace();
        }
        return tmp;
    }

    @Override
    public Dog createDog() {
        Dog tmp = null;
        this.name = paramsGetter.getName("Собаки");
        this.legs = paramsGetter.getLegs("Собаки");
        this.birthday = paramsGetter.getBirthday("Собаки");
        this.height = paramsGetter.getHeight("Собаки");
        this.weight = paramsGetter.getWeight("Собаки");

        try{
            if(this.name==null || this.legs<1 || this.birthday==null || this.height < 0 || this.weight<0){
                throw new RuntimeException("Неверные параметры для создания Собаки");
            }
            tmp = new Dog(this.name,this.legs,this.birthday,this.height,this.weight);
            AnimalCounter.add();
            System.out.println("Собака создана.\n");
        }catch (Exception e){
            e.getStackTrace();
        }
        return tmp;
    }

    @Override
    public Humster createHumster() {
        Humster tmp = null;
        this.name = paramsGetter.getName("Хомяка");
        this.legs = paramsGetter.getLegs("Хомяка");
        this.birthday = paramsGetter.getBirthday("Хомяка");
        this.height = paramsGetter.getHeight("Хомяка");
        this.weight = paramsGetter.getWeight("Хомяка");

        try{
            if(this.name==null || this.legs<1 || this.birthday==null || this.height < 0 || this.weight<0){
                throw new RuntimeException("Неверные параметры для создания Хомяка");
            }
            tmp = new Humster(this.name,this.legs,this.birthday,this.height,this.weight);
            AnimalCounter.add();
            System.out.println("Хомяк создан.\n");
        }catch (Exception e){
            e.getStackTrace();
        }
        return tmp;
    }

    @Override
    public Donkey createDonkey() {
        Donkey tmp = null;
        this.legs = paramsGetter.getLegs("Осла");
        this.birthday = paramsGetter.getBirthday("Осла");
        this.height = paramsGetter.getHeight("Осла");
        this.weight = paramsGetter.getWeight("Осла");

        try{
            if(this.legs<1 || this.birthday==null || this.height < 0 || this.weight<0){
                throw new RuntimeException("Неверные параметры для создания Осла");
            }
            tmp = new Donkey(this.legs,this.birthday,this.height,this.weight);
            AnimalCounter.add();
            System.out.println("Осел создан.\n");
        }catch (Exception e){
            e.getStackTrace();
        }
        return tmp;
    }

    @Override
    public Camel createCamel() {
        Camel tmp = null;
        this.legs = paramsGetter.getLegs("Верблюда");
        this.birthday = paramsGetter.getBirthday("Верблюда");
        this.height = paramsGetter.getHeight("Верблюда");
        this.weight = paramsGetter.getWeight("Верблюда");

        try{
            if(this.legs<1 || this.birthday==null || this.height < 0 || this.weight<0){
                throw new RuntimeException("Неверные параметры для создания Верблюда");
            }
            tmp = new Camel(this.legs,this.birthday,this.height,this.weight);

            AnimalCounter.add();
            System.out.println("Верблюд создан.\n");
        }catch (Exception e){
            e.getStackTrace();
        }
        return tmp;
    }

    @Override
    public Horse createHorse() {
        Horse tmp = null;
        this.legs = paramsGetter.getLegs("Лошади");
        this.birthday = paramsGetter.getBirthday("Лошади");
        this.height = paramsGetter.getHeight("Лошади");
        this.weight = paramsGetter.getWeight("Лошади");

        try{
            if(this.legs<1 || this.birthday==null || this.height < 0 || this.weight<0){
                throw new RuntimeException("Неверные параметры для создания Лошади");
            }
            tmp = new Horse(this.legs,this.birthday,this.height,this.weight);
            AnimalCounter.add();
            System.out.println("Лошадь создана.\n");
        }catch (Exception e){
            e.getStackTrace();
        }
        return tmp;
    }
}
