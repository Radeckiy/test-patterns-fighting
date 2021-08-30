package model.pet;

import interf.marker.PetForMage;
import model.UpdArg;
import model.hero.Hero;

import java.util.Observable;

public class MagicianBishop extends BasePet implements PetForMage {
    public MagicianBishop(String name) {
        super(name);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(((UpdArg) arg).getNameArg().equals("hp"))
            // if(((Hero) o).getHp() < (int) ((UpdArg) arg).getArg())
            action((Hero) o);
    }

    @Override
    public void action(Hero hero) {
        System.out.println(getName() + " выполнил действие на героя '" + hero.getName() + "'!");
        hero.setForce(hero.getForce() + 50);
        System.out.println("Увеличил силу хозяина на 50! Убиваем!");
    }
}
