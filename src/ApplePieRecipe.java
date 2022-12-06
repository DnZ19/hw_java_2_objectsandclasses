package src;

import java.util.ArrayList;

public class ApplePieRecipe {

    private String step;

    //Constructor

    public ApplePieRecipe(String step){
        this.step = step;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    @Override
    public String toString(){
        return step;
    }




}
