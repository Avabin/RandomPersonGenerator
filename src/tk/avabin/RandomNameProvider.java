package tk.avabin;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class for random name generator
 */
public class RandomNameProvider extends RandomDataProvider {
    private ArrayList<String> namesArray;
    private ArrayList<String> lastNamesArray;
    private boolean gender;
    private String source_filename_names;

    private Random rand = new Random();

    /**
     * Class constructor
     * @param gender    Gender for name generating. True if male, false if female.
     */
    public RandomNameProvider(boolean gender) {
        this.gender = gender;
        if (this.gender) {
            source_filename_names = "male_firstnames.txt";
        } else {
            source_filename_names = "female_firstnames.txt";
        }
        namesArray = Util.fetchFromFile(res_dir + source_filename_names);
        lastNamesArray = Util.fetchFromFile(res_dir + "lastnames.txt");

    }

    /**
     * Random name choice from file
     *
     * @return random name from file
     */
    public String nextName() {
        return randomChoiceFromArray(namesArray);
    }

    /**
     * Random lastname choice from file
     * @return random lastname from file
     */
    public String nextLastname() {
        return randomChoiceFromArray(lastNamesArray);
    }

}
