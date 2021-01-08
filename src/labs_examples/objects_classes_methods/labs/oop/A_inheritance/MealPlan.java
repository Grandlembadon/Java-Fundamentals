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
    public String herbs;
    private String name;
    private String meat;


    Italian(String herbs, String name) {
        this.herbs = herbs;
        this.name = name;
    }
}

class FettucinneAlfredo extends Italian {


    FettucinneAlfredo(String herbs, String name) {
        super(herbs, name);
    }
}

