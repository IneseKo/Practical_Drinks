package com.company;


public class Drink_calculus {
    public enum Ingredients {
        ingr1gin(85), ingr2greenStuff(10), ingr3grenadine(10), ingr4limeJuice(10), ingr5rum(65), ingr6tonicWater(20);
        private final int ingredientPrice;

        Ingredients(int ingredientPrice) {
            this.ingredientPrice = ingredientPrice;
        }

        public int getIngredientPrice() {
            return ingredientPrice;
        }
    }
    public static int computeCost(String drink, boolean student, int amount) {

                int price;
        if (drink.equals(Main.ONE_BEER)) {
            price = 74;
        }
        else if (drink.equals(Main.ONE_CIDER)) {
            price = 103;
        }
        else if (drink.equals(Main.A_PROPER_CIDER)) price = 110;

        else {
            throw new RuntimeException("No such drink exists");
        }
        if (student) {
            price = price - price/10;
        }
                return price*amount;
    }

    public static int computeCost(String cocktail, int amount) {

        if (amount > 2 && (cocktail == Main.GT || cocktail == Main.BACARDI_SPECIAL)) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
        int price;
                 if (cocktail.equals(Main.GT)) {
            price = Ingredients.ingr6tonicWater.getIngredientPrice() + Ingredients.ingr5rum.getIngredientPrice() + Ingredients.ingr4limeJuice.getIngredientPrice();
        }
        else if (cocktail.equals(Main.BACARDI_SPECIAL)) {
            price = Ingredients.ingr6tonicWater.getIngredientPrice()/2 + Ingredients.ingr1gin.getIngredientPrice() + Ingredients.ingr2greenStuff.getIngredientPrice() + Ingredients.ingr3grenadine.getIngredientPrice();
        }
        else {
            throw new RuntimeException("No such drink exists");
        }
        return price*amount;
    }

}
