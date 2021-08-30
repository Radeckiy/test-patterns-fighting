package model.hero;

import interf.marker.PetForMage;
import model.hero.Hero;
import model.pet.BasePet;

public class MageHero extends Hero {
    public MageHero(String name) {
        super(name);
        setHp(600);
        setForce(140);
        setSpeedAttack(0.7);
    }

    @Override
    public void attack() {
        System.out.println("Атакую " + getTarget().getName() + "!! Урон: " + getForce());
    }

    @Override
    public boolean addPet(BasePet pet) {
        if(pet instanceof PetForMage)
            return super.addPet(pet);
        else
            return false;
    }
}
