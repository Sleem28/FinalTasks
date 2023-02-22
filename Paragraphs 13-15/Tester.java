import Classes.Animal.Cat;
import Classes.Animal.Dog;
import Classes.Animal.Horse;
import Classes.AnimalProcessor.AnimalProcessor;
import Classes.GUI.BaseGUI;
import Classes.GUI.MainMenu;
import Classes.Loader.BaseLoader;
import Classes.Loader.Loader;
import Classes.Zoo.BaseZoo;
import Classes.Zoo.Zoo;

public class Tester {
    public static void main(String[] args) {

        BaseLoader loader = new Loader();

        MainMenu menu = new MainMenu(loader);
        menu.showMenu();


    }
}
