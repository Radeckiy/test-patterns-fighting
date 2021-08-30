import interf.Item;
import interf.Weapon;
import model.hero.Hero;
import model.hero.MageHero;
import model.hero.WarriorHero;
import model.item.BaseItem;
import model.item.DragonBloodItem;
import model.item.DustSorcererStoneItem;
import model.item.MagicMushroomsItem;
import model.pet.CasterWizard;
import model.pet.MagicianBishop;
import model.weapon.BaseWeapon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Hero hero = new MageHero("Великий маг");

        Weapon weaponClassic = new BaseWeapon("*Выглядит как обычные кинжалы*", "*Вжух-вжуъ*");
        hero.setWeapon(weaponClassic);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new DragonBloodItem(new BaseItem()));
        items.add(new DustSorcererStoneItem(new BaseItem()));
        items.add(new MagicMushroomsItem(new BaseItem()));
        items.add(new DragonBloodItem(new DustSorcererStoneItem(new MagicMushroomsItem(new BaseItem()))));
        hero.setItems(items);

        System.out.println("\n");
        System.out.println("Герой " + hero.getName() + ".");

        for(Item item : hero.getItems()) {
            item.useItem(hero);
            System.out.println(hero + "\n\n");
        }

        hero.addPet(new MagicianBishop("Петя"));
        hero.setHp(hero.getHp() - 100);

        hero.addPet(new CasterWizard("Кастер"));
        hero.setTarget(new WarriorHero("Противник"));

        hero.attack();
    }
}
