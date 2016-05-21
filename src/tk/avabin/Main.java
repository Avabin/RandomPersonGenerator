package tk.avabin;


class Main {
    private Main() {
        Person person = new Person().nextPerson();
        System.out.println(person.toString());
    }

    public static void main(String[] args) {
        new Main();
    }
}
