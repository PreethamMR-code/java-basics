
class RecipeScaler {
    public static void main(String[] args) {
        scaleIngredients(2, 150);
        scaleIngredients(3, 200);
        scaleIngredients(1, 100);
    }

    public static void scaleIngredients(int servings, int baseAmount) {
        System.out.println("Adjusted Quantity: " + (servings * baseAmount) + "g");
    }
}