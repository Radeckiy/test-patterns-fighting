package model.pet;

import interf.marker.PetForWarrior;
import model.UpdArg;
import model.hero.Hero;

import java.util.Observable;

public class WarriorGuard extends BasePet implements PetForWarrior {
    public WarriorGuard(String name) {
        super(name);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(((UpdArg) arg).getNameArg().equals("hp"))
            // if(((Hero) o).getHp() < (int) ((UpdArg) arg).getArg())
            action((Hero) arg);
    }

    @Override
    public void action(Hero hero) {
        System.out.println(getName() + " выполнил действие на противника '" + hero.getName() + "'!");
        System.out.println("Сделайте вид, что все оглушены! Тсссс..");
    }
}
