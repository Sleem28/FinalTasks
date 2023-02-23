package Classes.GUI;

import Classes.AnimalCreator.AnimalCreator;
import Classes.AnimalProcessor.AnimalProcessor;
import Classes.Loader.BaseLoader;

public class AddPetMenu extends BaseGUI{
    AnimalCreator animalCreator;
    AnimalProcessor animalProcessor;
    /**
     * Класс меню для добавления домашнего животного
     * @param loader загрузчик доп классов
     */
    public AddPetMenu(BaseLoader loader) {
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
            System.out.println("Добавление домашнего животного:");
            System.out.println("Для добавления кота нажмите 1.");
            System.out.println("Для добавления собаки нажмите 2.");
            System.out.println("Для добавления хомяка нажмите 3.");
            System.out.println("Для выхода в главное меню нажмите 0.");

            choice = loader.getScanner().nextInt();

            switch (choice){
                case 1 -> animalProcessor.addAnimal(animalCreator.createCat());
                case 2 -> animalProcessor.addAnimal(animalCreator.createDog());
                case 3 -> animalProcessor.addAnimal(animalCreator.createHumster());
            }
            if(choice < 0 || choice >3)
                System.out.println("Неверный выбор. Выберите еще раз.");
        }
        System.out.println("Выход");
    }
}
