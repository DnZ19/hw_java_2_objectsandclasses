package src;

public class Ingredient {

    private double amount;
    private String units;
    private String ingredientName;

    //constructor

    public Ingredient(){}

    public Ingredient(double amount, String units, String ingredientName) {
        this.amount = amount;
        this.units = units;
        this.ingredientName = ingredientName;

    }

    //getters:

    public double getAmount() {
        return amount;
    }

    public String getUnits() {
        return units;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    //setters

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @Override
    public String toString() {
        return amount + units + ingredientName;
    }

}
