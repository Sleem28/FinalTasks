package Classes.GUI;

import Classes.Loader.BaseLoader;

public abstract class BaseGUI {
    BaseLoader loader;

    public BaseGUI(BaseLoader loader) {
        this.loader = loader;
    }

    public void showMenu(){};
}
