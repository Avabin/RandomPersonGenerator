package tk.avabin;

public class Main {
    private Main() {
        NameGenerator nameGenerator = new NameGenerator(true);
        String name = nameGenerator.getRandomName();
        String lastName = nameGenerator.getRandomLastname();
        System.out.println(name + " " + lastName);

    }

    public static void main(String[] args) {
        new Main();
    }
}
