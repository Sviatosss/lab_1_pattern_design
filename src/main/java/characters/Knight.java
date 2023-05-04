package characters;

import weapons.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        setWeapon(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.print("Knight - ");
        super.fight();
    }
}