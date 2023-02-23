package Classes.GUI;

import Classes.Animal.*;
import Classes.AnimalProcessor.AnimalProcessor;
import Classes.Loader.BaseLoader;

public class WorkWithPetMenu extends BaseGUI{
    AnimalProcessor processor;
    String type;
    /**
     * Класс меню для работы с домашними животными
     * @param loader загрузчик доп классов
     * @param type тип домашнего животного
     */
    public WorkWithPetMenu(BaseLoader loader, String type) {
        super(loader);
        this.processor = loader.getAnimalProcessor();
        this.type = type;
    }

    @Override
    public void showMenu() {
        String choice = "";
        String insertText = (this.type.equals("Cat"))? "Кота" : (this.type.equals("Dog"))? "Собаки" : "Хомяка";
        Pet pet = null;

        System.out.printf("Информация про имена %s:\n", insertText);
        switch (this.type){
            case "Cat" -> this.processor.getNames("Cat");
            case "Dog" -> this.processor.getNames("Dog");
            case "Humster" -> this.processor.getNames("Humster");
        }


        System.out.println("Если хоть одно животное найдено то введите его имя для дальнейшей работы с ним. Или 0 для выхода.");

        choice = loader.getScanner().next();
        if(choice.equals("0")) return;
        switch (this.type){
            case "Cat" -> pet = (Cat) processor.getPet("Cat",choice);
            case "Dog" -> pet = (Dog) processor.getPet("Dog",choice);
            case "Humster" -> pet = (Humster) processor.getPet("Humster",choice);
        }

        if(pet == null){
            System.out.printf("Неверно указана дата рождения %s. Выходим.\n", insertText);
        }else{
            int ch = -1;
            while(ch!=0){
                System.out.printf("\nДля просмотра статуса %s нажмите 1.\n", insertText);
                System.out.printf("Для установки статуса 'радуется' у %s нажмите 2.\n", insertText);
                System.out.printf("Для установки статуса 'отдыхает' у %s нажмите 3.\n", insertText);
                System.out.printf("Для установки статуса 'спит' у %s нажмите 4.\n", insertText);
                System.out.printf("Для установки добавления навыка у %s нажмите 5.\n", insertText);
                System.out.printf("Для установки просмотра всех навыков у %s нажмите 6.\n", insertText);
                System.out.println("Для выхода нажмите 0.");

                ch = loader.getScanner().nextInt();

                switch (ch){
                    case 1 ->  System.out.println(pet.getStatus());
                    case 2 -> {pet.enjoy();
                               System.out.println("Статус 'радуется' установлен.\n");}
                    case 3 -> {pet.play();
                               System.out.println("Статус 'играет' установлен.\n");}
                    case 4 -> {pet.sleep();
                               System.out.println("Статус 'спит' установлен.\n");}
                    case 5 -> {System.out.println("Введите навык: ");
                               String skill = loader.getScanner().next();
                               pet.train(skill);
                               System.out.println("Обучение успешно\n");}
                    case 6 -> {System.out.printf("Навыки %s.\n", insertText);
                               pet.getSkills();}
                }
                if(ch < 0 || ch >6)
                    System.out.println("Неверный выбор. Выберите еще раз.");
            }
        }
    }
}
