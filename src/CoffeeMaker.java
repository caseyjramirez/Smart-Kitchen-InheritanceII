public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    void brewCoffee() {
        if (hasWorkToDo) {
            hasWorkToDo = false;
            System.out.println("Coffee Brewed!");
        }
    }
}
