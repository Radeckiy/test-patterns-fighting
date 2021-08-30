package model.item;

import interf.Item;
import model.hero.Hero;

public class DustSorcererStoneItem extends DecoreItem {
    public DustSorcererStoneItem(Item wrappedItem) {
        super(wrappedItem);
    }

    @Override
    public void useItem(Hero hero) {
        wrappedItem.useItem(hero);
        hero.setHp(hero.getHp() + 300);
    }

    @Override
    public String toString() {
        return super.toString() + " + волшебная пыль философского камня";
    }
}
