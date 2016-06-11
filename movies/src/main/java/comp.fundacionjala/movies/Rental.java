package comp.fundacionjala.movies;

class Rental {
    private IMovie movie;
    private int daysRented;


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
        if (movie instanceof NewReleaseMovie && daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
    
}