package Classes.Animal;

public class Camel extends PackAnimal{
    /**
     * Класс Верблюд
     *
     * @param legs     количество ног
     * @param birthday дата рождения
     * @param height   рост
     * @param weight   вес
     */
    public Camel(int legs, String birthday, double height, double weight) {
        super(legs, birthday, height, weight);
        super.cry = "hrr-hrr";
    }

    @Override
    public void cry() {
        System.out.println(super.cry);
    }
}
