package Classes.Loader;

import Classes.AnimalCreator.AnimalCreator;
import Classes.AnimalCreator.ParamsGetter;
import Classes.AnimalProcessor.AnimalProcessor;
import Classes.GUI.AddPackAnimalMenu;
import Classes.Zoo.BaseZoo;

import java.util.Scanner;

public abstract class BaseLoader {
    Scanner scanner;
    BaseZoo zoo;
    AnimalProcessor animalProcessor;
    AnimalCreator animalCreator;
    ParamsGetter paramsGetter;

    public AnimalCreator getAnimalCreator() {
        return animalCreator;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public BaseZoo getZoo() {
        return zoo;
    }

    public AnimalProcessor getAnimalProcessor() {
        return animalProcessor;
    }
}
