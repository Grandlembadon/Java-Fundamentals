package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class MealPlan {
    int mealnum;
    int cost;
    String[] Ingredients;

    public Ingredients(int mealnum, int cost, String[] Ingredients){
        this.mealnum = mealnum;
        this.cost = cost;
        this.Ingredients = Ingredients;
    }

}

class Cuisine extends MealPlan {



}
class Italian extends Cuisine {


}

