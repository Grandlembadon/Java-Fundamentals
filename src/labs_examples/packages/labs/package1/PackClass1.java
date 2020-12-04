package labs_examples.packages.labs.package1;

import labs_examples.packages.labs.package2.PackClass2;

public class PackClass1 {
    public void methodWhoo(){
        System.out.println("Whoo!");

        PackClass2 obj = new PackClass2();
        obj.macAndCheese();
    }
    public void methodWahoo(){
        System.out.println("Wahoo!!");
    }
}
