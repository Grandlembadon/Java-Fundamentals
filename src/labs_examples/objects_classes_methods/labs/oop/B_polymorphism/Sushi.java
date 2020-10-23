package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import labs_examples.objects_classes_methods.labs.oop.A_inheritance.MealPlan;

public class Sushi extends MealPlan implements MealPreparation  {

    public Sushi() {
        super("Rice", "Nori", "Eel");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Sourcing Fresh Fish...");
    }

    @Override
    public void prepareWorkStation() {
        System.out.println("Sharpen Knives...");

    }
}
