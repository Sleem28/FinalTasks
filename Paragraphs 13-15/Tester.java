import Classes.Animal.Cat;
import Classes.Animal.Horse;

public class Tester {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasiliy",4,"2020-12-02",0.32,3.2);
        cat.play();
        cat.cry();
        System.out.println(cat.getName());
        System.out.println(cat.getBirthday());
        System.out.println(cat.getStatus());

        Horse horse = new Horse(4,"2010-01-23",2.10,200);
        horse.work();
        horse.cry();

        System.out.println(horse.getBirthday());
        System.out.println(horse.getStatus());
    }
}
