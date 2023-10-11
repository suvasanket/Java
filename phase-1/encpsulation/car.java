package encpsulation;

public class car {
    private String name;
    private String model;
    private int year;

    car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    // copy from another object
    car(car x) {

        this.copy(x);
    }

    // seter method
    void setname(String name) {
        this.name = name;
    }

    void setmodel(String model) {
        this.model = model;
    }

    void setyear(int year) {
        this.year = year;
    }

    // getter methods
    String getName() {
        return name;
    }

    String getmodel() {
        return model;
    }

    int getyear() {
        return year;
    }

    // object copy
    void copy(car x) {
        setname(x.getName());
        setmodel(x.getmodel());
        setyear(x.getyear());
    }

}
