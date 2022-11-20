package FilmPackage;

import java.util.Comparator;

public class ComparatorByDate implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
            return o1.getYear()-o2.getYear();

    }
}
