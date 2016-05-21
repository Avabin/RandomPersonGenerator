package tk.avabin;

import java.util.ArrayList;


/**
 * Class for random email generating.
 */
class RandomEmailProvider extends RandomDataProvider {
    private final String name;
    private final String lastname;
    private final ArrayList<String> email_tails;

    /**
     * Class constructor
     *
     * @param name     First part of email address
     * @param lastname second part of email address
     */
    RandomEmailProvider(String name, String lastname) {
        this.name = name.toLowerCase();
        this.lastname = lastname.toLowerCase();
        email_tails = Utility.getInstance().fetchFromFile(res_dir + "email.txt");
    }

    /**
     * @return email address with name, lastname, randomly generated two digits and randomly choosed email domain.
     * Ex. "teddy.novakov56@mail.ru"
     */
    String nextEmail() {
        return name + "." + lastname + rand.nextInt(99) + "@" + randomChoiceFromArray(email_tails);
    }
}
