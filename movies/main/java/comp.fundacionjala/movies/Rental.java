package comp.fundacionjala.movies;

class Rental {
    private IMovie movie;
    private int daysRented;
    private double charge;

    public Rental(IMovie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
        charge =0;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public void setDaysRented(int daysRented){
    	this.daysRented =daysRented;
    }
    public Movie getMovie() {
        return (Movie) movie;
    }
    public double getRentalAmount(){
		return charge;
    }

    public double calculateRentalAmount( IMovie movie) {
		return movie.calculateRentalAmount(daysRented);
	}
    
}