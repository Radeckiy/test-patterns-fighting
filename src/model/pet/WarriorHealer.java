package model.pet;

import interf.marker.PetForWarrior;
import model.UpdArg;
import model.hero.Hero;

import java.util.Observable;

public class WarriorHealer extends BasePet implements PetForWarrior {
    public WarriorHealer(String name) {
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
        System.out.println(getName() + " выполнил действие на противника '" + hero.getName() + "'!");
        hero.setHp(hero.getHp() + 300);
        System.out.println("Увеличил здоровье хозяина на 300!");
    }
}
