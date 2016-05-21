package tk.avabin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Avabin on 21.05.2016.
 */
public class Util {
    public static ArrayList<String> fetchFromFile(String filepath) {
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
