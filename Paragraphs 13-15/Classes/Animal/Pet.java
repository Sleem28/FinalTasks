package Classes.Animal;

import java.util.ArrayList;
import java.util.List;

public class Pet extends BaseAnimal implements IEnjoy, IGetSkills, IPlay, ITrain, ISleep {
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
        super.name = name;
        this.skills = new ArrayList<>();
        this.skill_counter = 0;
        super.status = "пока нет статуса";
    }
    /**
     * Устанавливает домашнему животному статус 'радуется'
     */
    @Override
    public void enjoy() {
        super.status = "радуется";
    }

    /**
     * Выводит на экран скиллы домашнего животного
     */
    @Override
    public void getSkills() {
        int counter = 1;
        StringBuilder sb = new StringBuilder();

        for (String item:
             skills) {
            sb.append(counter).append(": ").append(item).append("\n");
            counter++;
        }
        System.out.println(sb.toString());
    }
    /**
     * Устанавливает домашнему животному статус 'играет'
     */
    @Override
    public void play() {
        super.status = "играет";
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
        super.status = "спит";
    }

}
