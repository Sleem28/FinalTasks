package Classes.GUI;

import Classes.AnimalCreator.AnimalCreator;
import Classes.AnimalProcessor.AnimalProcessor;
import Classes.Loader.BaseLoader;

public class AddPackAnimalMenu extends BaseGUI{
    AnimalCreator animalCreator;
    AnimalProcessor animalProcessor;

    /**
     * Класс меню для добавления вьючного животного
     * @param loader загрузчик доп классов
     */
    public AddPackAnimalMenu(BaseLoader loader) {
        super(loader);
        this.animalCreator = loader.getAnimalCreator();
        this.animalProcessor = loader.getAnimalProcessor();
    }

    /**
     * Метод показывает рабочее меню
     */
    @Override
    public void showMenu() {
        int choice = -1;
        while (choice != 0){
            System.out.println("Добавление вьючного животного:");
            System.out.println("Для добавления осла нажмите 1.");
            System.out.println("Для добавления верблюда нажмите 2.");
            System.out.println("Для добавления лошади нажмите 3.");
            System.out.println("Для выхода главное меню нажмите 0.");

            choice = loader.getScanner().nextInt();

            switch (choice){
                case 1 -> animalProcessor.addAnimal(animalCreator.createDonkey());
                case 2 -> animalProcessor.addAnimal(animalCreator.createCamel());
                case 3 -> animalProcessor.addAnimal(animalCreator.createHorse());
            }
            if(choice < 0 || choice >3)
                System.out.println("Неверный выбор. Выберите еще раз.");
        }
        System.out.println("Выход");
    }
}
