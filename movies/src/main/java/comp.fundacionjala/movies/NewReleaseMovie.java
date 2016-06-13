package comp.fundacionjala.movies;

class NewReleaseMovie extends Movie implements IMovie {
    public static final double CHARGE_PER_RENTAL_DAY = 3;

    public NewReleaseMovie(String title) {
        super(title, Movie.NEW_RELEASE_MOVIE);
    }

    @Override
    public double calculateRentalCharge(int daysRented) {
        double charge = daysRented * CHARGE_PER_RENTAL_DAY;
        return charge;
    }
}
