package tk.avabin;

import java.util.Random;

public class Main {
    private Main() {
        Random rand = new Random();
        NameGenerator nameGenerator = new NameGenerator(true);
        Country country = new Country().getRandomCountry();
        String name = nameGenerator.getRandomName();
        String lastName = nameGenerator.getRandomLastname();
        System.out.println(name + lastName + " " + country.getCountryName());
    }

    public static void main(String[] args) {
        new Main();
    }
}
