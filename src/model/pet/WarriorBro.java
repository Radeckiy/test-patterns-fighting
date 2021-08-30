package model.pet;

import interf.marker.PetForWarrior;
import model.UpdArg;
import model.hero.Hero;

import java.util.Observable;

public class WarriorBro extends BasePet implements PetForWarrior {
    public WarriorBro(String name) {
        super(name);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(((UpdArg) arg).getNameArg().equals("target"))
            // if(((Hero) o).getHp() < (int) ((UpdArg) arg).getArg())
            action((Hero) arg);
    }

    @Override
    public void action(Hero hero) {
        System.out.println("Атакую противника '" + hero.getName() + "'!");
        System.out.println("Бах!");
    }
}
