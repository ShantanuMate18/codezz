package ArrayList;

import java.util.ArrayList;

public class FavoriteMovies {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Dhamaal");
        movies.add("Golmaal");
        movies.add("3 idiots");
        movies.add("Stree");
        movies.add("Survansham");


        movies.add("Malamaal weekly");
        movies.add("Pathan");


        movies.remove(2);


        movies.set(0, "Munjyaa");

        System.out.println("List of movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nTotal number of movies: " + movies.size());
    }
}
