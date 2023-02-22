package Classes.Animal;

public class Horse extends PackAnimal{
    /**
     * Класс Лощадь
     *
     * @param legs     количество ног
     * @param birthday дата рождения
     * @param height   рост
     * @param weight   вес
     */
    public Horse(int legs, String birthday, double height, double weight) {
        super(legs, birthday, height, weight);
        super.cry = "igo-go";
    }

    @Override
    public void cry() {
        System.out.println(super.cry);
    }
}
