package src;
import java.util.ArrayList;

public class ApplePieRecipe {

    ArrayList<Ingredient> ingredients = new ArrayList<>();
    ArrayList<CookingDirection> steps = new ArrayList<>();

    Ingredient ongezoutenBoter;
    Ingredient witteBastardSuiker;
    Ingredient zelfRijzendBakmeel;
    Ingredient ei;
    Ingredient vanilleSuiker;
    Ingredient zout;
    Ingredient zoetZureAppels;
    Ingredient kristalSuiker;
    Ingredient kaneel;
    Ingredient paneerMeel;

    CookingDirection step1;
    CookingDirection step2;
    CookingDirection step3;
    CookingDirection step4;
    CookingDirection step5;
    CookingDirection step6;
    CookingDirection step7;
    CookingDirection step8;
    CookingDirection step9;
    CookingDirection step10;

    //Constructor

    public ApplePieRecipe() {
       ingredients.add(ongezoutenBoter = new Ingredient(200, " gram", "ongezouten roomboter"));
       ingredients.add(witteBastardSuiker = new Ingredient(200, " gram", "witte bastard suiker"));
       ingredients.add(zelfRijzendBakmeel = new Ingredient(400, " gram", "zelfrijzend bakmeel"));
       ingredients.add(ei = new Ingredient(1, " stuk(s)", "ei"));
       ingredients.add(vanilleSuiker = new Ingredient(8, " gram", "vanillesuiker"));
       ingredients.add(zout = new Ingredient(1, " snuf", "zout"));
       ingredients.add(zoetZureAppels = new Ingredient(1.5, " kilo", "zoet zure appels"));
       ingredients.add(kristalSuiker = new Ingredient(75, " gram", "kristal suiker"));
       ingredients.add(kaneel = new Ingredient(3, " theelepels", "kaneel"));
       ingredients.add(paneerMeel = new Ingredient(15, " gram", "paneermeel"));

       steps.add(step1 = new CookingDirection("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)"));
       steps.add(step2 = new CookingDirection("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart."));
       steps.add(step3 = new CookingDirection("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen."));
       steps.add(step4 = new CookingDirection("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel."));
       steps.add(step5 = new CookingDirection("Vet de springvorm in en bestrooi deze met bloem"));
       steps.add(step6 = new CookingDirection("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op."));
       steps.add(step7 = new CookingDirection("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm."));
       steps.add(step8 = new CookingDirection("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed."));
       steps.add(step9 = new CookingDirection("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken"));
       steps.add(step10 = new CookingDirection("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin."));

    }

    public void printIngredients() {
        System.out.println("Ingredients: ");
        for (Ingredient ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }

    public void printRecipeSteps() {
        System.out.println("Stappen: ");
        for (CookingDirection step : steps) {
            System.out.println("- " + step);
        }
    }




}
