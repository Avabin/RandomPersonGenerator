package tk.avabin;

import java.util.Date;
import java.util.Random;

/**
 * Person object
 */
public class Person {
    private String first_name;
    private String second_name;
    private String third_name;
    private String last_name;
    private Date birthday;
    private boolean gender;
    private Date deathday;
    private Country country;
    private String email;
    private int phone_number;

    /**
     * Class constructor
     * @param first_name    First name of the Person.
     * @param second_name   Second name of the Person. (Optional)
     * @param third_name    Third name of the Person. (Optional)
     * @param last_name     Last name of the Person.
     * @param birthday      The day of birth of the Person.
     * @param gender        Gender of the Person. True for male, false for female.
     * @param deathday      The day of death of the Person. (Not set if Person is alive)
     * @param country       Actual country where the Person lives.
     * @param email         Email address of the Person.
     * @param phone_number  Actual phone_number of the Person
     */
    public Person(String first_name, String second_name, String third_name, String last_name,
                  Date birthday, boolean gender, Date  deathday, Country country,
                  String email, int phone_number) {

        this.first_name = first_name;
        this.second_name = second_name;
        this.third_name = third_name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.gender = gender;
        this.deathday = deathday;
        this.country = country;
        this.email = email;
        this.phone_number = phone_number;

    }

    /**
     * Simplified Class constructor
     * @param first_name    First name of the Person.
     * @param last_name     Last name of the Person.
     * @param birthday      The day of birth of the Person.
     * @param gender        Gender of the Person. True for male, false for female.
     * @param country       Actual country where the Person lives.
     * @param email         Email address of the Person.
     * @param phone_number  Actual phone_number of the Person
     */
    public Person(String first_name, String last_name,
                  Date birthday, boolean gender, String city,
                  Country country, String postal_code,
                  String email, int phone_number) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.email = email;
        this.phone_number = phone_number;

    }

    /**
     * Class constructor
     * Used for random Person generating
     */
    public Person() {
    }

    public Person getRandomPerson() {
        int phone_offset = 10000000;
        Country c = new Country();
        Random random = new Random();
        gender = random.nextBoolean();
        NameGenerator nameGenerator = new NameGenerator(gender);
        first_name = nameGenerator.getRandomName();
        second_name = nameGenerator.getRandomName();
        third_name = nameGenerator.getRandomName();
        last_name = nameGenerator.getRandomLastname();
        // birthday = TODO
        // deathday = TODO
        country = c.getRandomCountry();
        //email = TODO
        phone_number = random.nextInt(999999999 - phone_offset) + phone_offset;
        return this;
    }

}
