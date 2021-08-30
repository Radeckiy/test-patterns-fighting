package model.item;

import interf.Item;
import model.hero.Hero;

public class DragonBloodItem extends DecoreItem {
    public DragonBloodItem(Item item) {
        super(item);
    }

    @Override
    public void useItem(Hero hero) {
        wrappedItem.useItem(hero);
        hero.setForce(hero.getForce() + 50);
        System.out.println("Сила атаки героя увеличина на 50");
    }

    @Override
    public String toString() {
        return super.toString() + " + кровь дракона";
    }
}
