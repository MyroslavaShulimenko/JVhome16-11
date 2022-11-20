package FilmPackage;

import java.util.Comparator;

public class Film  {
    private     String name;
    private     String  genre;
    private int rating;
    private int year;

    public Film(String name, String genre, int rating, int year) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Film - " +
                "name - '" + name + '\'' +
                ", genre - '" + genre + '\'' +
                ", rating=" + rating +
                ", year - " + year
                ;
    }
}
