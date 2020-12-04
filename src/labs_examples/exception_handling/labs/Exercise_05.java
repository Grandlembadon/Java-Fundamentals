package labs_examples.exception_handling.labs;

import java.awt.*;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
class Throw {
    public static void main(String[] args) {
        int i = getData(1);
        System.out.println(getData(0));

        try{
            i = getData(7);
        } catch (ArrayIndexOutOfBoundsException exc){

        }
        i = getData(2);
        try {
            styleGuide("blue");
        } catch (ColorException e) {
            e.printStackTrace();
        }
        try {
            styleGuide("pink");
        } catch (ColorException e) {
            e.printStackTrace();
        }
        try {
            styleGuide("green");
        } catch (ColorException e) {
            e.printStackTrace();
        }

        System.out.println("End of Program");

    }

    public static int getData(int index) throws ArrayIndexOutOfBoundsException {

        int[] nums = {1, 5, 8};
        return nums[index];
    }
    public static void styleGuide(String color) throws ColorException{
        if (color.equalsIgnoreCase("blue")){
            System.out.println("Blue is great!");
        }else if (color.equalsIgnoreCase("Green")){
            System.out.println("Green is great!");
        }else {
            throw new ColorException(color);
        }
    }
}

class ColorException extends Exception {
    String color;

    public ColorException(String color){
        this.color = color;
    }
    public String toString(){
        return "We don't like that color: " + color;
    }
}