package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Ingredient> ingredients = new ArrayList<>();

        ingredients.add(new Ingredient(200, "gram", "ongezouten roomboter"));
        ingredients.add(new Ingredient(200, "gram", "witte bastard suiker"));
        ingredients.add(new Ingredient(400, "gram", "zelfrijzend bakmeel"));
        ingredients.add(new Ingredient(1, "stuk(s)", "ei"));
        ingredients.add(new Ingredient(8, "gram", "vanillesuiker"));
        ingredients.add(new Ingredient(1, "snuf", "zout"));
        ingredients.add(new Ingredient(1.5, "kilo", "zoet zure appels"));
        ingredients.add(new Ingredient(75, "gram", "kristal suiker"));
        ingredients.add(new Ingredient(3, "theelepels", "kaneel"));
        ingredients.add(new Ingredient(15, "gram", "paneermeel"));

        ArrayList<ApplePieRecipe> steps = new ArrayList<>();

        steps.add(new ApplePieRecipe("- Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)"));
        steps.add(new ApplePieRecipe("- Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart."));
        steps.add(new ApplePieRecipe("- Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen."));
        steps.add(new ApplePieRecipe("- Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel."));
        steps.add(new ApplePieRecipe("- Vet de springvorm in en bestrooi deze met bloem"));
        steps.add(new ApplePieRecipe("- Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op."));
        steps.add(new ApplePieRecipe("- Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm."));
        steps.add(new ApplePieRecipe("- Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed."));
        steps.add(new ApplePieRecipe("- Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken"));
        steps.add(new ApplePieRecipe("- Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin."));


        printIngredients(ingredients);
        printRecipeSteps(steps);


    }

    public static void printIngredients(ArrayList<Ingredient> ingredients) {
        System.out.println("Ingredients: ");
        for (Ingredient ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }

    public static void printRecipeSteps(ArrayList<ApplePieRecipe> steps){
        System.out.println("Stappen: ");
        for (ApplePieRecipe step : steps){
            System.out.println(step);
        }
    }


}
