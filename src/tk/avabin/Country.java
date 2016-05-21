package tk.avabin;

import java.util.Locale;
import java.util.Random;

/**
 * Class Country.
 */
class Country {
    private String countryName;

    /**
     * Default class constructor
     */
    Country() {
    }

    /**
     * Generating random Country class.
     *
     * @return generated class.
     */
    Country nextCountry() {
        Random rand = new Random();
        String[] locales = Locale.getISOCountries();
        Locale countryLocale = new Locale("", locales[rand.nextInt(locales.length)]);
        countryName = countryLocale.getDisplayName();
        return this;
    }

    String getCountryName() {
        return countryName;
    }
}
