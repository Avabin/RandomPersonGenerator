package tk.avabin;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 * Abstract class for all random data providers
 */
abstract class RandomDataProvider {
    final Random rand;
    final String res_dir = Paths.get(".").toAbsolutePath().normalize().toString() + "/res/";

    RandomDataProvider() {
        rand = new Random();
    }

    String randomChoiceFromArray(ArrayList<String> arrayList) {
        return arrayList.get(rand.nextInt(arrayList.size()));
    }
}
