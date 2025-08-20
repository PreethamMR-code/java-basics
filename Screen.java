class Screen {

    String screenNumber;
    int seatingCapacity;
    String screenType;

    Movie movie;

    Screen() {
        this.screenNumber = "Screen 4";
        this.seatingCapacity = 250;
        this.screenType = "Dolby Atmos";
    }

    void getScreenInfo() {
        System.out.println("-------Screen Details ------");
        System.out.println("Screen Number is: " + screenNumber);
        System.out.println("Seating Capacity is: " + seatingCapacity);
        System.out.println("Screen Type is: " + screenType);

        this.movie.getMovieInfo();
    }
}
