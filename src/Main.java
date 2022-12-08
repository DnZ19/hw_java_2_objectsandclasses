package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        while (true){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Which recipe would you like to print? type chocolate or apple");
            String recipe = scanner.next().toLowerCase();

            if (recipe.equals("chocolate")){
                ChocolateCakeRecipe ChocolateCake = new ChocolateCakeRecipe();
                ChocolateCake.printIngredients();
                System.out.println("");
                ChocolateCake.printRecipeSteps();

            } else if ( recipe.equals("apple")) {
                ApplePieRecipe ApplePie = new ApplePieRecipe();
                ApplePie.printIngredients();
                System.out.println("");
                ApplePie.printRecipeSteps();

            } else {
                System.out.println("this is not the right entry, please try again...");

            }

        }








    }

}
