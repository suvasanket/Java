import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();
        countries.put("india", "new delhi");
        countries.put("america", "washington dc");
        countries.put("pakistan", "dont know");
        System.out.println(countries);
    }
}