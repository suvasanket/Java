package vehicleinterface;

public class mainmethod {

    public static void main(String[] args) {
        car car = new car();
        bike bike = new bike();
        airplane plane = new airplane();
    vehicle [] array= {car,bike,plane};
    for(vehicle vehicle : array){
    vehicle.driver();
    }
    }
}

class car implements vehicle {
    @Override
    public void driver() {
        System.out.println("driver");
    }

}

class bike implements vehicle {
    public void driver() {
        System.out.println("rider");
    }
}

class airplane implements vehicle {
    public void driver() {
        System.out.println("pilot");
    }
}