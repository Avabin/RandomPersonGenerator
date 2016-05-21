package tk.avabin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Util class for storing static methods.
 */
class Util {

    /**
     * Makes ArrayList with a string for each line in given file.
     *
     * @param filepath path to the sourcefile
     * @return string type ArrayList with all the lines in the file
     */
    static ArrayList<String> fetchFromFile(String filepath) {
        String line;
        ArrayList<String> names = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filepath)));
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }
}
