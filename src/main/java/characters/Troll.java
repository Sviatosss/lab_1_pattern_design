package characters;

import weapons.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        setWeapon(new AxeBehavior());
    }

    @Override
    public void fight() {
        System.out.print("Troll - ");
        super.fight();
    }
}