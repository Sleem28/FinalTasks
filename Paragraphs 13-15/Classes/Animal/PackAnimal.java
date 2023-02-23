package Classes.Animal;


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
        super.status = "пока нет статуса";
    }

    /**
     * Устанавливает статус "отдыхает" для вьючного животного
     */
    @Override
    public void rest() {
        super.status = "отдыхает";
    }
    /**
     * Устанавливает статус "работает" для вьючного животного
     */
    @Override
    public void work() {
        super.status = "работает";
    }

}
