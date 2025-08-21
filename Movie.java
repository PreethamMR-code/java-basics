class Movie {
    String title;
    String director;
    int year;
    String genre;
    double rating;
    int duration;

    Movie() {
        this("Unknown", "Unknown", 2000, "Drama", 5.0, 120);
    }
    Movie(String title) {
        this(title, "Unknown", 2000, "Drama", 5.0, 120);
    }
    Movie(String title, String director) {
        this(title, director, 2000, "Drama", 5.0, 120);
    }
    Movie(String title, String director, int year) {
        this(title, director, year, "Drama", 5.0, 120);
    }
    Movie(String title, String director, int year, String genre) {
        this(title, director, year, genre, 5.0, 120);
    }
    Movie(String title, String director, int year, String genre, double rating) {
        this(title, director, year, genre, rating, 120);
    }
    Movie(String title, String director, int year, String genre, double rating, int duration) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
    }
    void display() {
        System.out.println(title + " directed by " + director + " " + year + " " + genre + " rating: " + rating + " duration: " + duration + " min");
    }
}

