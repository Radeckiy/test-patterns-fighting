package model.item;

import interf.Item;
import model.hero.Hero;

public class BaseItem implements Item {
    @Override
    public void useItem(Hero hero) {
        System.out.println("На героя '" + hero.getName() + "' применен элексир!");
    }

    @Override
    public String toString() {
        return "Стандартный элексир";
    }
}
