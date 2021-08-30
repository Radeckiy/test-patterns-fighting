package model.pet;

import interf.marker.PetForMage;
import model.UpdArg;
import model.hero.Hero;

import java.util.Observable;

public class CasterWizard extends BasePet implements PetForMage {
    public CasterWizard(String name) {
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
        hero.setForce(hero.getForce() - 50);
        System.out.println("Уменьшил силу противника на 50! Убиваем!");
    }
}
