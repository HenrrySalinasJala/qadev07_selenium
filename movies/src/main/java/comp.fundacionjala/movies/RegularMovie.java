package comp.fundacionjala.movies;


class RegularMovie extends Movie implements IMovie {

    public static final double CHARGE_PER_RENTAL_DAY = 1.5;
    public static final double INITIAL_CHARGE = 2;
    public static final double THRESHOLD_DAYS = 2;


    public RegularMovie(String title) {
        super(title, Movie.REGULAR_MOVIE);
    }

    @Override
    public double calculateRentalCharge(int daysRented) {
        double charge = INITIAL_CHARGE;
        if (daysRented > THRESHOLD_DAYS)
            charge += (daysRented - THRESHOLD_DAYS) * CHARGE_PER_RENTAL_DAY;
        return charge;
    }
}
