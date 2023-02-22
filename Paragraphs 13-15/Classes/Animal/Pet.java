package Classes.Animal;

import Interfaces.Animal.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pet extends BaseAnimal implements IEnjoy, IGetSkills, IPlay, ITrain, ISleep {
    String name;
    int skill_counter;
    List<String> skills;

    public String getName() {
        return name;
    }

    /**
     * Базовый класс для домашних животных
     * @param name имя
     * @param legs количество ног
     * @param birthday  дата рождения
     * @param height рост
     * @param weight вес
     */
    public Pet(String name, int legs, String birthday, double height, double weight) {
        super(legs, birthday, height, weight);
        this.name = name;
        this.skills = new ArrayList<>();
        this.skill_counter = 0;
    }
    /**
     * Устанавливает домашнему животному статус 'радуется'
     */
    @Override
    public void enjoy() {
        super.status = "enjoy";
    }

    @Override
    public void getSkills() {

    }
    /**
     * Устанавливает домашнему животному статус 'играет'
     */
    @Override
    public void play() {
        super.status = "play";
    }

    /**
     * Добавляет комманду домашнему животному. Может быть не более 3 комманд.
     * @param skill комманда, которая добавится животному
     */
    @Override
    public void train(String skill) {
        if(this.skill_counter < 3){
            skills.add(skill);
        }else {
            System.out.println("Животное туповато. Может быть не более 3 комманд.");
        }
    }

    /**
     * Устанавливает домашнему животному статус 'спит'
     */
    @Override
    public void sleep() {
        super.status = "sleep";
    }

}
