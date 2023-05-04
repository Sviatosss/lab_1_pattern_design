import characters.Knight;
import weapons.BowAndArrowBehavior;

public class Main {

    public static void main(String[] args) {
        // створення персонажа - рицар
        Knight knight = new Knight();
        // дефолтна зброя рицаря - меч (тому буде реалізація удару мечем)
        knight.fight();

        //зміна зброї під час гри на лук
        knight.setWeapon(new BowAndArrowBehavior());
        // нова атака
        knight.fight();
    }


}