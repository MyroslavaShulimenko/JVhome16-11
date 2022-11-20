package FilmPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class mainFilm {
    public static void main(String[] args) {
        //2.      Создать класс Film и полями: название, жанр, рейтинг, год; Создать список фильмов. Программа должна спрашивать, какая //сортировка нужна пользователю (по названию, по рейтингу, по жанру или году) и выводить отсортированный список на экран. detective, melodrama, horror, adventure.
        //Prick, love, shark, bermuda triangle
        ArrayList<Film> films = new ArrayList<>();
        films.add(new Film("Prick", "detective",5,2015));
        films.add(new Film("Love", "melodrama",8,2010));
        films.add(new Film("Shark", "horror",6,2020));
        films.add(new Film("Bermuda_triangle", "adventure",10,2022));
        System.out.println(Arrays.toString(new ArrayList[]{films}));
        Scanner s = new Scanner(System.in);
        System.out.println("Выберите метод сортировки: 1- по названию фильма; 2 - по жанру; 3 - по рейтингу; 4- по году выпуска.");
       System.out.println("Введите целое число от 1 до 4. ");
        int way = s.nextInt();
        switch (way) {
            case 1:
                Collections.sort(films,new ComparatorByName());
                print(films);
                break;
            case 2:
               Collections.sort(films,new ComparatorBYGanre());
                print(films);
                break;
            case 3:
                Collections.sort(films,new ComparatorByRating());
                print(films);
                break;
            case 4:
                Collections.sort(films,new ComparatorByDate());
                print(films);
                break;
        }



    }
    public static void print(ArrayList<Film>films) {
        for (int i = 0; i < films.size(); i++) {
            System.out.println("" + films.get(i).toString());
            System.out.println(" ----------------------      ");
        }
    }

}
