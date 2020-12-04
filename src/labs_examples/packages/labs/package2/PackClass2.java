package labs_examples.packages.labs.package2;

import labs_examples.packages.labs.package1.PackClass1;

public class PackClass2 {
    public void sandwiches(){
        System.out.println("I love sandwiches!");

        PackClass1 obj = new PackClass1();
        obj.methodWahoo();
    }
    public void macAndCheese(){
        System.out.println("I love Mac and Cheese!");
    }
}
