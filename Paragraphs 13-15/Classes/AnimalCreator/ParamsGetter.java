package Classes.AnimalCreator;

import java.util.Scanner;

public class ParamsGetter {
    Scanner scanner;

    public ParamsGetter(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getName(String type){
        System.out.printf("Введите имя %s : ",type);
        return this.scanner.next();
    }

    public int getLegs(String type){
        System.out.printf("Введите количество ног у %s : ",type);
        return this.scanner.nextInt();
    }

    public String getBirthday(String type){
        System.out.printf("Введите дату рождения %s : ",type);
        return this.scanner.next();
    }

    public double getHeight(String type){
        System.out.printf("Введите рост %s : ",type);
        return this.scanner.nextDouble();
    }

    public double getWeight(String type){
        System.out.printf("Введите вес %s : ",type);
        return this.scanner.nextDouble();
    }
}
