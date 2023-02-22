package Classes.Zoo;

import Classes.Animal.*;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseZoo {
    protected List<BaseAnimal> cats;
    protected List<BaseAnimal> dogs;
    protected List<BaseAnimal> humsters;
    protected List<BaseAnimal> camels;
    protected List<BaseAnimal> donkeys;
    protected List<BaseAnimal> horses;

    public BaseZoo() {
        this.cats = new ArrayList<>();
        this.dogs = new ArrayList<>();
        this.humsters = new ArrayList<>();
        this.camels = new ArrayList<>();
        this.donkeys = new ArrayList<>();
        this.horses = new ArrayList<>();
    }

    public List<BaseAnimal> getCats() {
        return cats;
    }

    public List<BaseAnimal> getDogs() {
        return dogs;
    }

    public List<BaseAnimal> getHumsters() {
        return humsters;
    }

    public List<BaseAnimal> getCamels() {
        return camels;
    }

    public List<BaseAnimal> getDonkeys() {
        return donkeys;
    }

    public List<BaseAnimal> getHorses() {
        return horses;
    }
}
