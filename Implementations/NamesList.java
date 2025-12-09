package Implementations;
import java.util.ArrayList;
public class NamesList {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        
        names.add("Soham");
        names.add("Akash");
        names.add("Santosh");
        names.add("Sachin");
        names.add("Ram");

        for (String name : names) {
            if (name.startsWith("S")) {
                System.out.println(name);
            }
        }
    }
}

