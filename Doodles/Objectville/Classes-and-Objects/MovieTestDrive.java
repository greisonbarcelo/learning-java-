class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie: " + this.title + "\nGenre: " + this.genre + "\nRating: " + this.rating);
    }
}

public class MovieTestDrive {
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "How to lose a guy in 10 days";
        one.genre = "Romcom";
        one.rating = 8;
        Movie two = new Movie();
        two.title = "Interstellar";
        two.genre = "Scifi";
        two.rating = 9;
        Movie three = new Movie();
        three.title = "Exes and whys";
        three.genre = "Love story";
        three.rating = 8;
        three.playIt();
    }
}r