package tk.avabin;

class Main {
    private Main() {
        RandomPersonGenerator personGenerator = new RandomPersonGenerator();
        Person person = personGenerator.nextPerson();
        while ((!person.getGender() && (person.isDead()))) person = personGenerator.nextPerson();
        System.out.println(person.toString());
    }

    public static void main(String[] args) {
        new Main();
    }
}
