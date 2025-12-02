class PvrRunner {

    public static void main(String args[]) {

        Pvr pvr = new Pvr();

        Screen screen = new Screen();

        Movie movie = new Movie();

        pvr.screen = screen;
        screen.movie = movie;

        pvr.getPvrInfo();
    }
}