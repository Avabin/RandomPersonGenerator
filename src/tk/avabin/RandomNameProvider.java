package tk.avabin;

import java.util.ArrayList;

/**
 * Class for random name generator
 */
class RandomNameProvider extends RandomDataProvider {
    private final ArrayList<String> namesArray;
    private final ArrayList<String> lastNamesArray;

    /**
     * Class constructor
     * @param gender    Gender for name generating. True if male, false if female.
     */
    RandomNameProvider(boolean gender) {
        String source_filename_names;
        if (gender) {
            source_filename_names = "male_firstnames.txt";
        } else {
            source_filename_names = "female_firstnames.txt";
        }
        namesArray = Utility.getInstance().fetchFromFile(res_dir + source_filename_names);
        lastNamesArray = Utility.getInstance().fetchFromFile(res_dir + "lastnames.txt");

    }

    /**
     * Random name choice from file
     *
     * @return random name from file
     */
    String nextName() {
        return randomChoiceFromArray(namesArray).replace("  ", "");
    }

    /**
     * Random lastname choice from file
     * @return random lastname from file
     */
    String nextLastname() {
        return randomChoiceFromArray(lastNamesArray).replace("  ", "");
    }

}
