package characters;

import weapons.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        setWeapon(new BowAndArrowBehavior());
    }

    @Override
    public void fight() {
        System.out.print("Queen - ");
        super.fight();
    }
}