package FilmPackage;

import java.util.Comparator;

public class ComparatorByRating implements Comparator<Film>{

    @Override
    public int compare(Film o1, Film o2) {
        return o1.getRating()-o2.getRating();
    }
}