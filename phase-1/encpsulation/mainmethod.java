package encpsulation;

class mainmethod {
    public static void main(String[] args) {
        car car2 = new car("ford", "corvet", 1);
        car car1 = new car("ford", "corvet", 0);
        car2.setmodel("mustang");
        System.out.println(car2.getmodel());
        car1.copy(car2);
        System.out.println(car1.getmodel());
        car car3 = new car(car2);
        System.out.println(car3.getyear());
    }
}
