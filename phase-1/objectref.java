public class objectref {
    String name;
    int age;

    /**
     * @param name
     * @param age
     */
    objectref(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return name + " " + age;
    }

    void changeDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
