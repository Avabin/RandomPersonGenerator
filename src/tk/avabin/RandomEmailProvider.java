package tk.avabin;

import java.util.ArrayList;

/**
 * Created by Avabin on 21.05.2016.
 */
public class RandomEmailProvider extends RandomDataProvider {
    private String name, lastname;
    private ArrayList<String> email_tails;

    public RandomEmailProvider(String name, String lastname) {
        this.name = name.toLowerCase().replace("  ", "");
        this.lastname = lastname.toLowerCase();
        email_tails = Util.fetchFromFile(res_dir + "email.txt");
    }

    public String nextEmail() {
        return name + "." + lastname + rand.nextInt(99) + "@" + randomChoiceFromArray(email_tails);
    }
}
