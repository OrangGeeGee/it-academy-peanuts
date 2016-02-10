package lt.asinica.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by p998snc on 2016.02.10.
 */
public class PeanutList {
    List<Peanut> peanuts = new ArrayList<Peanut>();
    long i = 0;

    public List<Peanut> getPeanuts() {
        return peanuts;
    }

    public void addPeanut(Peanut peanut) {
        peanut.setId(i);
        peanuts.add(peanut);
        i++;
    }
}
