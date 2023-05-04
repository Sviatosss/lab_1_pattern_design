package characters;

import weapons.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }



    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
