package Classes.GUI;

import Classes.Loader.BaseLoader;

public abstract class BaseGUI {
    BaseLoader loader;

    /**
     * Базовый класс для всех меню
     * @param loader загрузчик доп классов
     */
    public BaseGUI(BaseLoader loader) {
        this.loader = loader;
    }

    public void showMenu(){};
}
