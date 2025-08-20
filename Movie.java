class Movie {

    String movieTitle;
    String genre;
    double durationHours;

    Movie() {
        this.movieTitle = "Action Thriller";
        this.genre = "Action";
        this.durationHours = 2.5;
    }

    void getMovieInfo() {
        System.out.println("-----Movie Details------");
        System.out.println("Movie Title is: " + movieTitle);
        System.out.println("Genre is: " + genre);
        System.out.println("Duration is: " + durationHours + " hours");
    }
}
