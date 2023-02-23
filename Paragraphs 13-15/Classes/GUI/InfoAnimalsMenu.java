package Classes.GUI;

import Classes.Loader.BaseLoader;

public class InfoAnimalsMenu extends BaseGUI{
    InfoPackAnimalsMenu packAnimalsMenu;
    InfoPetsMenu petMenu;
    /**
     * Класс меню для информации о животных
     * @param loader загрузчик доп классов
     */
    public InfoAnimalsMenu(BaseLoader loader) {
        super(loader);
        this.packAnimalsMenu = new InfoPackAnimalsMenu(loader);
        this.petMenu = new InfoPetsMenu(loader);
    }
    /**
     * Метод показывает рабочее меню
     */
    @Override
    public void showMenu() {
        int choice = -1;
        while (choice != 0){
            System.out.println("Информация о животных:");
            System.out.println("Для получения информации о вьючных животных нажмите 1.");
            System.out.println("Для получения информации о домашних животных нажмите 2.");
            System.out.println("Для выхода в главное меню нажмите 0.");

            choice = loader.getScanner().nextInt();

            switch (choice){
                case 1 -> packAnimalsMenu.showMenu();
                case 2 -> petMenu.showMenu();
            }
            if(choice < 0 || choice >2)
                System.out.println("Неверный выбор. Выберите еще раз.");
        }
        System.out.println("Выход");
    }
}
