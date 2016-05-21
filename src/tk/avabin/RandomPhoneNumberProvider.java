package tk.avabin;

/**
 * Class for random phone number generating.
 */
class RandomPhoneNumberProvider extends RandomDataProvider {
    private int prefix = -1;

    /**
     * Class constructor with a prefix. That means only the rest of a number will be generated.
     *
     * @param prefix prefix for a phone number.
     */
    @SuppressWarnings("unused")
    RandomPhoneNumberProvider(int prefix) {
        this.prefix = prefix;
    }

    /**
     * In this case, prefix and phone number will be generated.
     */
    RandomPhoneNumberProvider() {
    }

    /**
     * Method for getting random generated 9-digits phone number.
     * In case, prefix is not set, new will be generated using Random().
     *
     * @return Phone number with prefix. Ex. +(22) 889 765 278
     */
    String nextPhoneNumber() {
        if (prefix == -1) {
            prefix = rand.nextInt(99);
        }
        int phone_number;

        String returnstring = "+(" + String.format("%02d", prefix) + ") ";

        for (int i = 0; i < 3; i++) {
            phone_number = rand.nextInt(999);
            returnstring += String.format("%03d ", phone_number);
        }

        return returnstring;
    }

}
