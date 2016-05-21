package tk.avabin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Utility singleton class
 */
class Utility {
    private static final Utility INSTANCE = new Utility();

    private Utility() {
    }

    static Utility getInstance() {
        return INSTANCE;
    }

    /**
     * Makes ArrayList with a string for each line in given file.
     *
     * @param filepath path to the sourcefile
     * @return string type ArrayList with all the lines in the file
     */
    ArrayList<String> fetchFromFile(String filepath) {
        InputStream in = getClass().getClassLoader().getResourceAsStream(filepath);
        BufferedReader reader;
        String line;
        ArrayList<String> names = new ArrayList<>();
        try {
            reader = new BufferedReader(new InputStreamReader(in));
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }
}
