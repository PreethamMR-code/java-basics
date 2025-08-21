class MovieRunner {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.display();
        Movie m2 = new Movie("Inception");
        m2.display();
        Movie m3 = new Movie("Titanic", "James Cameron");
        m3.display();
        Movie m4 = new Movie("Interstellar", "Christopher Nolan", 2014);
        m4.display();
        Movie m5 = new Movie("Avatar", "James Cameron", 2009, "Sci-Fi");
        m5.display();
        Movie m6 = new Movie("Joker", "Todd Phillips", 2019, "Thriller", 8.5);
        m6.display();
        Movie m7 = new Movie("The Matrix", "Wachowski", 1999, "Action", 9.0, 136);
        m7.display();
    }
}
