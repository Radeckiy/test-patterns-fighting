package model.item;

import interf.Item;
import model.hero.Hero;

public class MagicMushroomsItem extends DecoreItem {
    public MagicMushroomsItem(Item item) {
        super(item);
    }

    @Override
    public void useItem(Hero hero) {
        wrappedItem.useItem(hero);
        hero.setSpeed(hero.getSpeed() + 3);
    }

    @Override
    public String toString() {
        return super.toString() + " + волшебные грибы";
    }
}
