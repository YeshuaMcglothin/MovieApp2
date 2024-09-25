public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String MovieName = "Entergalatic";
        System.out.println("A good movie is " + MovieName);


        short ReleaseYear = 2022;
        String MovieGenre = "Romance/Musical";
        double RatingOfMovie = 7.3;
        boolean IsMovieASeries = false;
        char DirectorsFirstInitial = 'F';


        System.out.println("Movie Name: " + MovieName);
        System.out.println("Year Release: " + ReleaseYear);
        System.out.println("Genre: " + MovieGenre);
        System.out.println("IMDb Rating " + RatingOfMovie);
        System.out.println("Part of a series: " + IsMovieASeries);
        System.out.println("Director's Firstname initial: " + DirectorsFirstInitial);

        String[] moviesNames = {"Steven Pounds", "Interstellar", "Inception"};
        int[] movieYears = {2008, 2009, 2010};

        String[] favoriteGenres = {"Action", "Comedy", "Horror"};

        // to create an array Datatype[] name = {"text", numbers};

        System.out.println("First movie: " + moviesNames[0]); //0 = First item and starts from 0
        System.out.println("Secound movie: " + moviesNames[1]);
        //System.out.println("Third movie: " + moviesNames[2]);


    }
}