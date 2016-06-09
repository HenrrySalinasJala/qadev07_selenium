package movies;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Vector;

class Customer {
    private String _name;
    private double _totalAmount;
    private int _frequentRenterPoints;
    private Set<Rental> rentList=new HashSet<Rental>();
    
    public Customer(String name) {
	_name = name;
	_totalAmount = 0;
	_frequentRenterPoints = 0;
    }

    public void addRental(Rental arg) {
	rentList.add(arg);
    }

    public String getName() {
	return _name;
    }

    public Set getRentals() {
	return	rentList;
    }
    public double geTotalRentMount() {
	return	_totalAmount;
    }
    public String statement() {
	String result = "Rental Record for " + getName() + "\n";
	result = rent(result);
	result += "Amount owed is " + String.valueOf(_totalAmount) + "\n";
	result += "You earned " + String.valueOf(_frequentRenterPoints) + " frequent renter points";
	return result;
    }

    public String rent(String result) {
	double partialAmount = 0;
	_frequentRenterPoints = 0;
	for (Rental rent  : rentList) {
	    partialAmount = rent.calculateRentalAmount();
	    _frequentRenterPoints = calculateRenterPoints(_frequentRenterPoints, rent);
	    result += "\t" + rent.getMovie().getTitle() + "\t" + String.valueOf(partialAmount) + "\n";
	    _totalAmount += partialAmount; 
	}
	return result;
    }

    public int calculateRenterPoints(int frequentRenterPoints, Rental renter) {
	frequentRenterPoints++;
	if ((renter.getMovie().getPriceCode() == Movie.NEW_RELEASE) && renter.getDaysRented() > 1)
	    frequentRenterPoints++;
	return frequentRenterPoints;
    }
}
