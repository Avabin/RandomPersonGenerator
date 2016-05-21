package tk.avabin;

import java.util.Locale;
import java.util.Random;

/**
 * Created by Avabin on 21.05.2016.
 */
public class Country {
    private String countryName;
    private Locale countryLocale;

    /**
     *
     */
    public Country() {}

    public Country getRandomCountry() {
        Random rand = new Random();
        String[] locales = Locale.getISOCountries();
        countryLocale = new Locale("", locales[rand.nextInt(locales.length)]);
        countryName = countryLocale.getDisplayName();
        return this;
    }

    public String getCountryName(){
        return countryName;
    }
}
