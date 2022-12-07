package src;

public class CookingDirection {

    private String step;

    public CookingDirection(String step) {
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
