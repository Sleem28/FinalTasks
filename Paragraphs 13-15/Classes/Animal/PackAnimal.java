package Classes.Animal;

import Interfaces.Animal.IRest;
import Interfaces.Animal.IWork;

import java.util.Date;

public class PackAnimal extends BaseAnimal implements IWork, IRest {

    /**
     * Базовый класс для вьючных животных
     * @param legs количество ног
     * @param birthday  дата рождения
     * @param height рост
     * @param weight вес
     */
    public PackAnimal(int legs, String birthday, double height, double weight) {
        super(legs, birthday, height, weight);
    }

    @Override
    public void rest() {
        super.status = "rest";
    }

    @Override
    public void work() {
        super.status = "work";
    }

}
