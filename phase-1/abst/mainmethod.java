package abst;

public class mainmethod {
    public static void main(String[] args) {
        // vehicle vehicle = new vehicle();
        car car = new car();
        bike bike = new bike();
        vehicle[] array = { car, bike };
        for (vehicle i : array) {
            i.drive();
        }
    }
}
