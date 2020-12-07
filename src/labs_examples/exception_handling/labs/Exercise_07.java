package labs_examples.exception_handling.labs;

import java.awt.*;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
class Slushee {
    public static void main(String[] args) {
        try {
            slusheeMaster("Blue Raspberry");
        } catch (BadFlavor a){
            a.printStackTrace();
        }

        try {
            slusheeMaster("Watermelon");
        } catch (BadFlavor b){
            b.printStackTrace();
        }

        try {
            slusheeMaster("Mountain Dew");
        } catch (BadFlavor c){
            c.printStackTrace();
        }



    }
    public static void slusheeMaster(String flavor) throws BadFlavor {
        if (flavor.equalsIgnoreCase("Blue Raspberry")){
            System.out.println("The ultimate flavor, Blue Raspberry. You chose well.");
        } else if (flavor.equalsIgnoreCase("Watermelon")){
            System.out.println("Watermelon eh, not a bad flavor at all.");
        } else {
            throw new BadFlavor(flavor);
        }

    }
}
class BadFlavor extends Exception {
    String flavor;

    public BadFlavor(String flavor){
        this.flavor = flavor;
    }
    public String toString(){
        return "Yuck, " + flavor + " is the worst possible flavor.";
    }

}