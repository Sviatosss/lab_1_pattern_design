package characters;

import weapons.KnifeBehavior;

public class King extends Character {
    public King() {
        setWeapon(new KnifeBehavior());
    }

    @Override
    public void fight() {
        System.out.print("King - ");
        super.fight();
    }
}