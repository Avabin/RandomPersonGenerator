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
    private String phone_number;

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
                  String email, String phone_number) {

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
                  String email, String phone_number) {

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

    /**
     * Random person generating.
     *
     * @return person with totally random credencials,
     * no matter if you set something before with constructors or not.
     */
    public Person nextPerson() {
        RandomEmailProvider emailProvider;
        RandomNameProvider nameProvider;
        RandomDateProvider dateProvider;
        RandomPhoneNumberProvider phoneNumberProvider;
        Country c = new Country();
        Random random = new Random();
        dateProvider = new RandomDateProvider(new Date(System.currentTimeMillis() - (100L * 365 * 24 * 60 * 60 * 1000)),
                new Date(System.currentTimeMillis()));
        phoneNumberProvider = new RandomPhoneNumberProvider();


        gender = random.nextBoolean();
        nameProvider = new RandomNameProvider(gender);

        first_name = nameProvider.nextName();
        second_name = nameProvider.nextName();
        third_name = nameProvider.nextName();
        last_name = nameProvider.nextLastname();
        emailProvider = new RandomEmailProvider(first_name, last_name);

        birthday = dateProvider.nextDate();
        dateProvider.setMin(birthday);
        deathday = dateProvider.nextDate();

        country = c.nextCountry();
        email = emailProvider.nextEmail();
        phone_number = phoneNumberProvider.nextPhoneNumber();
        return this;
    }

    @Override
    public String toString() {
        String returnstring = "";

        returnstring += "First Name: " + first_name + "\n";

        if (second_name != null) {
            returnstring += "Second Name: " + second_name + "\n";
        }
        if (third_name != null) {
            returnstring += "Third Name: " + third_name + "\n";
        }

        returnstring += "Last Name: " + last_name + "\n" +
                "Birthday: " + birthday.toString() + "\n";

        if (deathday != null) {
            returnstring += "Death Day: " + deathday.toString() + "\n";
        }

        returnstring += "Country: " + country.getCountryName() + "\n" + "Email: " + email + "\n" + "Phone number: " + phone_number;

        return returnstring;
    }

}
