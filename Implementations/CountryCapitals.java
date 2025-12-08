import java.util.HashMap;
import java.util.Map;

public class CountryCapitals {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");

        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
