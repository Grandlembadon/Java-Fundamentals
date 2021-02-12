package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class Attacks {

    public static boolean isAnAttack(String s){
        return s.contains("Attack!");
    }

}

class Controller {
    public static void main(String[] args) {
        String Attack = "Attack!";
        Attacks::isAnAttack
    }


}