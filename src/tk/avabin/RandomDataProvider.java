package tk.avabin;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Avabin on 21.05.2016.
 */
public abstract class RandomDataProvider {
    final Random rand;
    String res_dir = Paths.get(".").toAbsolutePath().normalize().toString() + "/res/";

    protected RandomDataProvider() {
        rand = new Random();
    }

    public String randomChoiceFromArray(ArrayList<String> arrayList) {
        return arrayList.get(rand.nextInt(arrayList.size()));
    }
}
