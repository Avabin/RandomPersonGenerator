package tk.avabin;

import java.util.ArrayList;
import java.util.Random;

/**
 * Abstract class for all random data providers
 */
abstract class RandomDataProvider {
    final Random rand;
    final String res_dir = "tk/avabin/res/";

    RandomDataProvider() {
        rand = new Random();
    }

    String randomChoiceFromArray(ArrayList<String> arrayList) {
        return arrayList.get(rand.nextInt(arrayList.size()));
    }
}
