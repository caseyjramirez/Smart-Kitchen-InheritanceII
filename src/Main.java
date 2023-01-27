public class Main {
    public static void main(String[] args) {
        SmartKitchen caseysKitchen = new SmartKitchen();

        caseysKitchen.setKitchenState(true, false, true);
        caseysKitchen.doKitchenWork();
    }
}