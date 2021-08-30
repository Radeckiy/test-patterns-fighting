package model.hero;

import interf.Item;
import interf.Weapon;
import model.UpdArg;
import model.pet.BasePet;
import model.pet.MagicianBishop;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Hero extends Observable {
    private static final int MAX_PETS_COUNT = 3;

    private String name;
    private int hp;
    private double force;
    private double speed;
    private double speedAttack;
    private boolean invulnerability;
    private Weapon weapon;
    private List<Item> items;
    private List<BasePet> pets;
    private Hero target;

    public Hero(String name) {
        this.name = name;
        this.hp = 1000;
        this.force = 80.0;
        this.speed = 10.0;
        this.speedAttack = 1.0;
        this.invulnerability = false;
        this.items = new ArrayList<>();
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        setChanged();
        notifyObservers(new UpdArg("hp", hp));
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeedAttack() {
        return speedAttack;
    }

    public void setSpeedAttack(double speedAttack) {
        this.speedAttack = speedAttack;
    }

    public boolean isInvulnerability() {
        return invulnerability;
    }

    public void setInvulnerability(boolean invulnerability) {
        this.invulnerability = invulnerability;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean addPet(BasePet pet) {
        if (this.countObservers() < MAX_PETS_COUNT) {
            this.pets.add(pet);
            this.addObserver(pet);
            return true;
        }
        return false;
    }

    public void attack() {
        weapon.firstAttack(target);
        setChanged();
        notifyObservers(new UpdArg("target", target));
    }

    public void setTarget(Hero target) {
        this.target = target;
    }

    public Hero getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "Описание героя " + name +
                "\n" +
                "Здоровье = " + hp +
                "\n" +
                "Сила = " + force +
                "\n" +
                "Скорость = " + speed +
                "\n" +
                "Скорость атак = " + speedAttack +
                "\n" +
                "Неуязвимость = " + invulnerability +
                "\n" +
                "Оружие в руках = " + weapon +
                "\n" +
                "Предметы в рюкзаке = " + items +
                "\n" +
                "Активные питомцы = " + pets;
    }
}
