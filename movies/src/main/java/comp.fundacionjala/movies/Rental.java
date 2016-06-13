package comp.fundacionjala.movies;

class Rental {
    private IMovie movie;
    private int daysRented;
    public static final int MINIMUM_RENTAL_DAYS =1;

    public Rental(IMovie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;

    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return (Movie) movie;
    }



    public double calculateRentalCharge(IMovie movie) {
        return movie.calculateRentalCharge(daysRented);
    }
    public int calculateRenterFrequentPoints() {
        int frequentRenterPoints=1;
        if (movie instanceof NewReleaseMovie && daysRented > MINIMUM_RENTAL_DAYS)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
    
}