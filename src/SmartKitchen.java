public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen() {
        this.coffeeMaker = new CoffeeMaker(false);
        this.dishWasher = new DishWasher(false);
        this.refrigerator = new Refrigerator(false);
    }

    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    public void setKitchenState(boolean coffeeMakerFlag,
                                boolean dishWasherFlag,
                                boolean refrigeratorFlag
    ) {
        coffeeMaker.setHasWorkToDo(coffeeMakerFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        refrigerator.setHasWorkToDo(refrigeratorFlag);
    }

    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
        refrigerator.orderFood();
    }

    @Override
    public String toString() {
        return "SmartKitchen{" +
                "coffeeMaker=" + coffeeMaker +
                ", dishWasher=" + dishWasher +
                ", refrigerator=" + refrigerator +
                '}';
    }
}
