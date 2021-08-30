package model.item;

import interf.Item;
import model.hero.Hero;

public class DecoreItem implements Item {
    protected Item wrappedItem;

    public DecoreItem(Item wrappedItem) {
        this.wrappedItem = wrappedItem;
    }

    @Override
    public void useItem(Hero hero) {
        wrappedItem.useItem(hero);
    }

    @Override
    public String toString() {
        return wrappedItem.toString();
    }
}
