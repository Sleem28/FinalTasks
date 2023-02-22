package Classes.GUI;

import Classes.Loader.BaseLoader;

public class InfoPetsMenu extends BaseGUI{
    WorkWithPetMenu catInfoMenu;
    WorkWithPetMenu dogInfoMenu;
    WorkWithPetMenu humsterInfoMenu;
    public InfoPetsMenu(BaseLoader loader) {
        super(loader);
        catInfoMenu = new WorkWithPetMenu(loader,"Cat");
        dogInfoMenu = new WorkWithPetMenu(loader,"Dog");
        humsterInfoMenu = new WorkWithPetMenu(loader,"Humster");
    }

    @Override
    public void showMenu() {
        int choice = -1;
        while (choice != 0){
            System.out.println("Информация о домашних животных:");
            System.out.println("Для получения информации о котах нажмите 1.");
            System.out.println("Для получения информации о собаках нажмите 2.");
            System.out.println("Для получения информации о хомяках нажмите 3.");
            System.out.println("Для выхода в предыдущее меню нажмите 0.");

            choice = loader.getScanner().nextInt();

            switch (choice){
                case 1 -> catInfoMenu.showMenu();
                case 2 -> dogInfoMenu.showMenu();
                case 3 -> humsterInfoMenu.showMenu();
            }
            if(choice < 0 || choice >3)
                System.out.println("Неверный выбор. Выберите еще раз.");
        }
        System.out.println("Выход");
    }
}
