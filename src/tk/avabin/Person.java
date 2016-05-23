package tk.avabin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Person object
 */
@SuppressWarnings("unused")
class Person {
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
    @SuppressWarnings("unused")
    public Person(String first_name, String last_name,
                  Date birthday, boolean gender,
                  Country country,
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
    Person() {
    }

    /**
     * Random person generating.
     *
     * @return person with totally random credentials,
     * no matter if you set something before with constructors or not.
     */


    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        String returnstring = "";

        returnstring += "First Name: " + first_name + "\n";

        if (second_name != null) {
            returnstring += "Second Name: " + second_name + "\n";
        }
        if (third_name != null) {
            returnstring += "Third Name: " + third_name + "\n";
        }

        returnstring += "Last Name: " + last_name + "\n";

        if (gender) returnstring += "Gender: Male \n";
        else returnstring += "Gender: Female \n";
        returnstring += "" +
                "Birthday: " + df.format(birthday) + "\n";

        if (deathday != null) {
            returnstring += "Death Day: " + df.format(deathday) + "\n";
        }

        returnstring += "Country: " + country.getCountryName() + "\n" + "Email: " + email + "\n" + "Phone number: " + phone_number;

        return returnstring;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getSecondName() {
        return second_name;
    }

    public String getThirdName() {
        return third_name;
    }

    public String getLastName() {
        return last_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDeathday() {
        return deathday;
    }

    public void setDeathday(Date deathday) {
        this.deathday = deathday;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public boolean isDead() {
        return deathday != null;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setThird_name(String third_name) {
        this.third_name = third_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
