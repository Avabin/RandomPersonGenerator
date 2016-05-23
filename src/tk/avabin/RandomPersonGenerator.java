package tk.avabin;

import java.util.Date;
import java.util.Random;

/**
 * Random Person object generating class
 */
class RandomPersonGenerator {
    private final Person person;
    private final Random random;

    public RandomPersonGenerator(long seed) {
        person = new Person();
        random = new Random(seed);
    }

    public RandomPersonGenerator() {
        person = new Person();
        random = new Random();
    }

    Person nextPerson() {
        RandomEmailProvider emailProvider;
        RandomNameProvider nameProvider;
        RandomDateProvider dateProvider;
        RandomPhoneNumberProvider phoneNumberProvider;
        Country c = new Country();
        dateProvider = new RandomDateProvider(new Date(System.currentTimeMillis() - (100L * 365 * 24 * 60 * 60 * 1000)),
                new Date(System.currentTimeMillis()));
        phoneNumberProvider = new RandomPhoneNumberProvider();


        person.setGender(random.nextBoolean());
        nameProvider = new RandomNameProvider(person.getGender());

        person.setFirst_name(nameProvider.nextName());
        person.setSecond_name(nameProvider.nextName());
        while (person.getSecondName().equals(person.getFirstName())) {
            person.setSecond_name(nameProvider.nextName());
        }
        person.setThird_name(nameProvider.nextName());
        while (person.getThirdName().equals(person.getFirstName()) || person.getThirdName().equals(person.getSecondName())) {
            person.setThird_name(nameProvider.nextName());
        }
        person.setLast_name(nameProvider.nextLastname());
        emailProvider = new RandomEmailProvider(person.getFirstName(), person.getLastName());

        person.setBirthday(dateProvider.nextDate());
        dateProvider.setMin(person.getBirthday());
        if (random.nextBoolean()) person.setDeathday(dateProvider.nextDate());

        person.setCountry(c.nextCountry());
        person.setEmail(emailProvider.nextEmail());
        person.setPhone_number(phoneNumberProvider.nextPhoneNumber());
        return person;
    }
}
