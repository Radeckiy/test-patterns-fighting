package model.weapon;

import interf.Weapon;
import model.hero.Hero;

public class BaseWeapon extends model.weapon.Weapon implements Weapon {

    public BaseWeapon(String skin, String animation) {
        super(skin, animation);
    }

    @Override
    public void firstAttack(Hero target) {
        System.out.println("Была выполнена базовая атака на противника '" + target.getName() + "' !");
    }

    @Override
    public void secondAttack(Hero target) {
        System.out.println("Была выполнена супер атака на противника '" + target.getName() + "' !");
    }

    public void printSkin() {
        System.out.println(getSkin());
    }

    public void printaAimation() {
        System.out.println(getAnimation());
    }
}
