package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class MealPlan {
    private String name;
    private int mealnum;
    private int cost;
    String[] ingredients;

    public MealPlan(String... ingredients) {
        this.ingredients = ingredients;
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
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}

class Cuisine extends MealPlan {



}
class Italian extends Cuisine {
    private String Herbs;
    private String name;


}

class FettucinneAlfredo extends Italian {

}

