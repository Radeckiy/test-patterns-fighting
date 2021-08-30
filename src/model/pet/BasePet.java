package model.pet;

import interf.Pet;
import model.hero.Hero;

import java.util.Observable;
import java.util.Observer;

public class BasePet implements Observer, Pet {
    private String name;

    public BasePet(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {}

    @Override
    public void action(Hero hero) {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Я питомец по имени - " + name + ":3 Привет!";
    }
}
