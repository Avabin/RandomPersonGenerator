package tk.avabin;

/**
 * Created by Avabin on 21.05.2016.
 */
public class RandomPhoneNumberProvider extends RandomDataProvider {
    private final int PHONE_OFFSET = 10000000;
    private int prefix = -1;
    private int phone_number;

    RandomPhoneNumberProvider(int prefix) {
        this.prefix = prefix;
    }

    RandomPhoneNumberProvider() {
    }

    public String nextPhoneNumber() {
        if (prefix == -1) {
            prefix = rand.nextInt(99);
        }
        phone_number = rand.nextInt(999999999 - PHONE_OFFSET) + PHONE_OFFSET;

        return "+(" + prefix + ") " + phone_number;
    }

}
