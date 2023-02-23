import Classes.GUI.MainMenu;
import Classes.Loader.BaseLoader;
import Classes.Loader.Loader;

public class Main {
    public static void main(String[] args) {
        BaseLoader loader = new Loader();

        MainMenu menu = new MainMenu(loader);
        menu.showMenu();
    }
}
