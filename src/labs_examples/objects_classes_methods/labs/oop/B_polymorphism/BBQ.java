package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import labs_examples.objects_classes_methods.labs.oop.A_inheritance.MealPlan;

public class BBQ extends MealPlan implements MealPreparation {

    public BBQ() {
        super("Brisket", "Dry Rub", "BBQ Sauce");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing BBQ Ingredients");
    }

    @Override
    public void prepareWorkStation() {
        System.out.println("Wire Brushing BBQ");

    }

}
