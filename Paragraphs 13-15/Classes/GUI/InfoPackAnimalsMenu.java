package Classes.GUI;

import Classes.Loader.BaseLoader;

public class InfoPackAnimalsMenu extends BaseGUI{
    WorkWithPackAnimalMenu donkeyInfoMenu;
    WorkWithPackAnimalMenu camelInfoMenu;
    WorkWithPackAnimalMenu horseInfoMenu;
    /**
     * Класс меню для получения информации о вьючных животных
     * @param loader загрузчик доп классов
     */
    public InfoPackAnimalsMenu(BaseLoader loader) {
        super(loader);
        this.donkeyInfoMenu = new WorkWithPackAnimalMenu(loader, "Donkey");
        this.camelInfoMenu = new WorkWithPackAnimalMenu(loader, "Camel");
        this.horseInfoMenu = new WorkWithPackAnimalMenu(loader, "Horse");
    }
    /**
     * Метод показывает рабочее меню
     */
    @Override
    public void showMenu() {
        int choice = -1;
        while (choice != 0){
            System.out.println("Информация о вьючных животных:");
            System.out.println("Для получения информации об ослах нажмите 1.");
            System.out.println("Для получения информации о верблюдах нажмите 2.");
            System.out.println("Для получения информации о лошадях нажмите 3.");
            System.out.println("Для выхода в предыдущее меню нажмите 0.");

            choice = loader.getScanner().nextInt();

            switch (choice){
                case 1 -> this.donkeyInfoMenu.showMenu();
                case 2 -> this.camelInfoMenu.showMenu();
                case 3 -> this.horseInfoMenu.showMenu();
            }
            if(choice < 0 || choice >2)
                System.out.println("Неверный выбор. Выберите еще раз.");
        }
        System.out.println("Выход");
    }
}
