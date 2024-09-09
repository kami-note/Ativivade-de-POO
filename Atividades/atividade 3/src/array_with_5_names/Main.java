package array_with_5_names;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();

        names.add("Erick");
        names.add("Kaic");
        names.add("Sabrina");
        names.add("Kelvin");
        names.add("Maykon");

        for (String name : names) {
            System.out.println(name);
        }

        names.remove("Kaic");

        System.out.println("----------------");

        for (String name : names) {
            System.out.println(name);
        }

        names.remove("Sabrina");

        System.out.println("----------------");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
