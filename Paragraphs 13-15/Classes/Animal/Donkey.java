package Classes.Animal;

public class Donkey extends PackAnimal{
    /**
     * Класс Осел
     *
     * @param legs     количество ног
     * @param birthday дата рождения
     * @param height   рост
     * @param weight   вес
     */
    public Donkey(int legs, String birthday, double height, double weight) {
        super(legs, birthday, height, weight);
        super.cry = "ia-ia";
    }

    @Override
    public void cry() {
        System.out.println(super.cry);
    }
}
