import java.util.HashMap;

public class hashmap2 {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<String, String>();

        countries.put("India", "delhi");
        //             ^key    ^value

        System.out.println(countries);              // India=delhi
        System.out.println(countries.get("India")); // India=delhi

        System.out.println(countries.replace("India", "mumbai"));
        System.out.println(countries.get("india")); // India=mumbai

        countries.put("USA", "washington");
        countries.put("UK", "london");
        countries.put("France", "paris");
        for (String key : countries.keySet()) {
            System.out.println(key + " = " + countries.get(key));
        }
    }
}
