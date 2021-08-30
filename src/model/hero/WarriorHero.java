package model.hero;

import interf.marker.PetForWarrior;
import model.pet.BasePet;

public class WarriorHero extends Hero {
    public WarriorHero(String name) {
        super(name);
        setHp(1400);
        setForce(90);
        setSpeedAttack(0.9);
    }

    @Override
    public void attack() {
        System.out.println("Атакую " + getTarget().getName() + "!! Урон: " + getForce());
    }

    @Override
    public boolean addPet(BasePet pet) {
        if(pet instanceof PetForWarrior)
            return super.addPet(pet);
        else
            return false;
    }
}
