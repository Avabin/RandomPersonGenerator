package tk.avabin;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Avabin on 21.05.2016.
 */
public class NameGenerator {
    private ArrayList<String> namesArray;
    private ArrayList<String> lastNamesArray;
    private boolean gender;
    private String source_filename_names;
    private String cur_dir = Paths.get(".").toAbsolutePath().normalize().toString();
    private Random rand = new Random();

    /**
     * Class constructor
     * @param gender    Gender for name generating. True if male, false if female.
     */
    public NameGenerator(boolean gender) {
        this.gender = gender;
        if (this.gender) {
            source_filename_names = "male_firstnames.txt";
        } else {
            source_filename_names = "female_firstnames.txt";
        }
        namesArray = fetchNames(new File(cur_dir+"/src/tk/avabin/res/"+source_filename_names));
        lastNamesArray = fetchNames(new File(cur_dir+"/src/tk/avabin/res/lastnames.txt"));

    }

    private ArrayList<String> fetchNames(File file) {
        String line;
        ArrayList<String> names = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    public String getRandomName() {
        return this.namesArray.get(rand.nextInt(namesArray.size()));
    }

    public String getRandomLastname() {
        return this.lastNamesArray.get(rand.nextInt(lastNamesArray.size()));
    }

}
