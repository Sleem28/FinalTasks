package Classes.Animal;

public class Cat extends Pet{
    /**
     * Класс Кот
     * @param name имя
     * @param legs количество ног
     * @param birthday  дата рождения
     * @param height рост
     * @param weight вес
     */
    public Cat(String name, int legs, String birthday, double height, double weight) {
        super(name, legs, birthday, height, weight);
        super.cry = "miau";
    }
    /**
     * Выводит на экран как кот мяукает
     */
    @Override
    public void cry() {
        System.out.println(super.cry);
    }
}
