package Classes.GUI;

import Classes.Animal.Camel;
import Classes.Animal.Donkey;
import Classes.Animal.Horse;
import Classes.Animal.PackAnimal;
import Classes.AnimalProcessor.AnimalProcessor;
import Classes.Loader.BaseLoader;

public class WorkWithPackAnimalMenu extends BaseGUI{
    AnimalProcessor processor;
    String type;
    public WorkWithPackAnimalMenu(BaseLoader loader, String type) {
        super(loader);
        this.processor = loader.getAnimalProcessor();
        this.type = type;
    }

    @Override
    public void showMenu() {
        String choice = "";
        String insertText = (this.type.equals("Donkey"))? "Осла" : (this.type.equals("Camel"))? "Верблюда" : "Лошади";
        PackAnimal packAnimal = null;

            System.out.printf("Информация про даты рождения %s:\n", insertText);
        switch (this.type){
            case "Donkey" -> this.processor.getBirthdays("Donkey");
            case "Camel" -> this.processor.getBirthdays("Camel");
            case "Horse" -> this.processor.getBirthdays("Horse");
        }


            System.out.println("Если хоть одно животное найдено то введите его дату рождения для дальнейшей работы с ним. Или 0 для выхода.");

            choice = loader.getScanner().next();
            if(choice.equals("0")) return;
            switch (this.type){
                case "Donkey" -> packAnimal = (Donkey) processor.getPackAnimal("Donkey",choice);
                case "Camel" -> packAnimal = (Camel) processor.getPackAnimal("Camel",choice);
                case "Horse" -> packAnimal = (Horse) processor.getPackAnimal("Horse",choice);
            }

            if(packAnimal == null){
                System.out.printf("Неверно указана дата рождения %s. Выходим.\n", insertText);
            }else{
               int ch = -1;
               while(ch!=0){
                   System.out.printf("\nДля просмотра статуса %s нажмите 1.\n", insertText);
                   System.out.printf("Для установки статуса 'работает' у %s нажмите 2.\n", insertText);
                   System.out.printf("Для установки статуса 'отдыхает' у %s нажмите 3.\n", insertText);
                   System.out.println("Для выхода нажмите 0.");

                   ch = loader.getScanner().nextInt();

                   switch (ch){
                       case 1 -> System.out.println(packAnimal.getStatus());
                       case 2 -> {packAnimal.work();
                                  System.out.println("Статус работает установлен.");}
                       case 3 -> {packAnimal.rest();
                           System.out.println("Статус отдыхает установлен.");}
                   }
               }
            }
    }
}
//TODO Дальше делать менюшки для работы с вьючными. Потом делать менюшки для пэтов.
