package src;

import java.util.ArrayList;

public class ChocolateCakeRecipe {

    ArrayList<Ingredient> ingredients = new ArrayList<>();
    ArrayList<CookingDirection> steps = new ArrayList<>();

    Ingredient flour, butter, sugar, cacao, egg;

    CookingDirection step1, step2, step3;

    public ChocolateCakeRecipe(){
        ingredients.add(flour = new Ingredient(500, "gram", "flour"));
        ingredients.add(butter = new Ingredient(400, "gram", "butter"));
        ingredients.add(sugar = new Ingredient(400, "gram", "sugar"));
        ingredients.add(cacao = new Ingredient(50, "gram", "cacoa"));
        ingredients.add(egg = new Ingredient(4, "pieces", "eggz"));

        steps.add(step1 = new CookingDirection("dingen"));
        steps.add(step2 = new CookingDirection("dingen nog eens"));
        steps.add(step3 = new CookingDirection("dingen nog een keer"));

        System.out.println("Chocolate Cake Recipe:");
        System.out.println("----------------------");

    }

    public void printIngredients() {
        System.out.println("Ingredients: ");
        for (Ingredient ingredient : ingredients) {
            System.out.println("- " + Math.round(ingredient.getAmount()) + " " + ingredient.getUnits() + " " + ingredient.getIngredientName());
        }
    }

    public void printRecipeSteps() {
        System.out.println("Stappen: ");
        for (CookingDirection step : steps) {
            System.out.println("- " + step);
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
    }

}
