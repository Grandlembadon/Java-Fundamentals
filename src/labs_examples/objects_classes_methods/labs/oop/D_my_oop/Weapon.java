package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Weapon {
    int [] damageRange;
    String damageType;
    int durability;
    int critChance;

    public Weapon(int[] damageRange, String damageType, int durability, int critChance) {
        this.damageRange = damageRange;
        this.damageType = damageType;
        this.durability = durability;
        this.critChance = critChance;
    }

    public Weapon() {

    }

    public void strike(){
        
    }
    public void parry(){
        System.out.println("You have Parried the enemy attack!");

    }
    public void extraAttack(){
        System.out.println("Double Strike!");

    }


}
