package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import labs_examples.objects_classes_methods.labs.oop.A_inheritance.MealPlan;

import java.util.Arrays;

public class MealController {
    public static void main(String[] args) {
        MealPlan mp = new MealPlan("basic");
        BBQ bbq = new BBQ();
        Sushi sushi = new Sushi();

        System.out.println(Arrays.toString(mp.getIngredients()));
        System.out.println(Arrays.toString(bbq.getIngredients()));
        System.out.println(Arrays.toString(sushi.getIngredients()));
        bbq.prepareIngredients();
        bbq.prepareWorkStation();
        sushi.prepareIngredients();
        sushi.prepareWorkStation();
    }
}
