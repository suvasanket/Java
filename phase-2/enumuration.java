public class enumuration {
    public static void main(String[] args) {
        food foody = food.BHATA;
        System.out.println(foody);
        System.out.println(food.BHATA.ingredient);
    }
}

enum food {
    BHATA("rice"
          + "water"),
    TARKARI(""),
    BHAJA("");
    String ingredient;

    food(String ingredient) { this.ingredient = ingredient; }
}
