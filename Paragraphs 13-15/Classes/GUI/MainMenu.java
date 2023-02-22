package Classes.GUI;

import Classes.Loader.BaseLoader;

public class MainMenu extends BaseGUI{
    AddPackAnimalMenu packAnimalMenu;
    AddPetMenu petMenu;
    InfoAnimalsMenu animalsMenu;
    public MainMenu(BaseLoader loader) {
        super(loader);
        this.packAnimalMenu = new AddPackAnimalMenu(super.loader);
        this.petMenu = new AddPetMenu(super.loader);
        this.animalsMenu = new InfoAnimalsMenu(loader);
    }

    @Override
    public void showMenu() {
        int choice = -1;
        while (choice != 0){
            System.out.println("Главное меню:");
            System.out.println("Для добавления вьючного животного нажмите 1.");
            System.out.println("Для добавления домашнего животного нажмите 2.");
            System.out.println("Для получения информации о животных нажмите 3.");
            System.out.println("Для выхода из программы нажмите 0.");

            choice = loader.getScanner().nextInt();

            switch (choice){
                case 1 -> this.packAnimalMenu.showMenu();
                case 2 -> this.petMenu.showMenu();
                case 3 -> this.animalsMenu.showMenu();
            }

            if(choice < 0 || choice >3)
                System.out.println("Неверный выбор. Выберите еще раз.");
        }
        System.out.println("Выход");
    }
}
