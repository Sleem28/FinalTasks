package Classes.Animal;

public class Humster extends Pet{
    /**
     * Класс хомяк
     * @param name     имя
     * @param legs     количество ног
     * @param birthday дата рождения
     * @param height   рост
     * @param weight   вес
     */
    public Humster(String name, int legs, String birthday, double height, double weight) {
        super(name, legs, birthday, height, weight);
        super.cry = "пи-пи";
    }

    @Override
    public void cry() {
        System.out.println(super.cry);
    }
}
