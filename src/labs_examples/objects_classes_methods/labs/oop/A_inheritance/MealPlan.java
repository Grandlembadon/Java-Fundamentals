package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class MealPlan {
    private int mealnum;
    private int cost;
    String[] Ingredients;

    public MealPlan(int mealnum, int cost, String[] Ingredients){
        this.mealnum = mealnum;
        this.cost = cost;
        this.Ingredients = Ingredients;
    }

    public int getMealnum() {
        return mealnum;
    }

    public void setMealnum(int mealnum) {
        this.mealnum = mealnum;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String[] getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String[] ingredients) {
        Ingredients = ingredients;
    }
}

class Cuisine extends MealPlan {



}
class Italian extends Cuisine {


}

