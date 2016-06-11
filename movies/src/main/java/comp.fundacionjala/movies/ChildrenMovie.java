package comp.fundacionjala.movies;

class ChildrenMovie extends Movie implements IMovie {
    public static final double CHARGE_PER_RENTAL_DAY = 1.5;
    public static final double INITIAL_CHARGE = 1.5;
    public static final double THRESHOLD_DAYS = 3;


    public ChildrenMovie(String title) {
        super(title, CHILDREN_MOVIE);
    }


    @Override
    public double calculateRentalCharge(int daysRented) {
        double charge = INITIAL_CHARGE;
        if (daysRented > THRESHOLD_DAYS)
            charge += (daysRented - THRESHOLD_DAYS) * CHARGE_PER_RENTAL_DAY;
        return charge;
    }
}
