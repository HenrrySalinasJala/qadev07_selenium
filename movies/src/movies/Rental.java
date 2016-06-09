package movies;

import java.io.Console;

class Rental {
    private Movie _movie;
    private int _daysRented;
    private double _thisAmount;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
        _thisAmount=0;
    }
    public int getDaysRented() {
        return _daysRented;
    }
    public void setDaysRented(int daysRented){
    	_daysRented=daysRented;
    }
    public Movie getMovie() {
        return _movie;
    }
    public double getRentalAmount(){
	return _thisAmount;
    }
    /***
     * Determine amounts for by movie code price 
     * @param _thisAmount
     * @return
     */
    public double calculateRentalAmount() {
		switch (_movie.getPriceCode()) {
		    case Movie.REGULAR:
		        _thisAmount += 2;
		        if (_daysRented > 2)
		            _thisAmount += (_daysRented - 2) * 1.5;
		        break;
		    case Movie.NEW_RELEASE:
		        _thisAmount += _daysRented * 3;
		        break;
		    case Movie.CHILDRENS:
		        _thisAmount += 1.5;
		        if (_daysRented > 3)
		            _thisAmount += (_daysRented - 3) * 1.5;
		        break;
		}
		return _thisAmount;
	}
    
}