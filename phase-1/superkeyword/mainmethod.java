package superkeyword;

class mainmethod {
    public static void main(String[] args) {
        person person = new person("rocky", 19);
        superman superman = new superman("superman", 400, "fly");
        System.out.println(person.name);
        System.out.println(superman.name);
        System.out.println(superman.power);
        // System.out.println(person.power);
    }

}