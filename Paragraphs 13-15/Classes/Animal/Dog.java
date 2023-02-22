package Classes.Animal;

public class Dog extends Pet{
    /**
     * Класс Собака
     * @param name     имя
     * @param legs     количество ног
     * @param birthday дата рождения
     * @param height   рост
     * @param weight   вес
     */
    public Dog(String name, int legs, String birthday, double height, double weight) {
        super(name, legs, birthday, height, weight);
        super.cry = "gav-gav";
    }
    /**
     * Выводит на экран как собака гавкает
     */
    @Override
    public void cry() {
        System.out.println(super.cry);
    }
}
