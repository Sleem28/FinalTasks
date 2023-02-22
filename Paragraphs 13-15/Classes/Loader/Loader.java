package Classes.Loader;

import Classes.AnimalCreator.AnimalCreator;
import Classes.AnimalCreator.ParamsGetter;
import Classes.AnimalProcessor.AnimalProcessor;
import Classes.Zoo.Zoo;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Loader extends BaseLoader{
    public Loader() {
        super.scanner = new Scanner(new InputStreamReader(System.in));
        super.zoo = new Zoo();
        super.animalProcessor = new AnimalProcessor(super.zoo);
        super.paramsGetter = new ParamsGetter(scanner);
        super.animalCreator = new AnimalCreator(paramsGetter);
    }
}
