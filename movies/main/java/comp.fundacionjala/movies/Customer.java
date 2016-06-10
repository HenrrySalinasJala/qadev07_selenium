package comp.fundacionjala.movies;

import java.util.HashSet;
import java.util.Set;

class Customer {
    private String name;
    private int frequentRenterPoints;
    private Set<Rental> rentList= new HashSet<>();
    
    public Customer(String name) {
		this.name = name;
		frequentRenterPoints = 0;
    }

    public void addRental(Rental arg) {
	rentList.add(arg);
    }

    public String getName() {
	return name;
    }

    public Set getRentals() {
	return	rentList;
    }

	public int calculateTotalFrequentRenterPoints() {
		frequentRenterPoints = 0;
		for (Rental rent  : rentList) {
			frequentRenterPoints = calculateRenterFrequentPoints(frequentRenterPoints, rent);
		}
		return frequentRenterPoints;
	}

    public double calculateTotalCharge() {
		double totalCharge=0;
		for (Rental rent  : rentList) {
			totalCharge += rent.calculateRentalAmount((IMovie)rent.getMovie());
		}
		return totalCharge;
    }

	public String statement() {
		String result = "Rental Record for " + getName() + "\n";
		for (Rental rent  : rentList) {
			double charge =rent.calculateRentalAmount((IMovie)rent.getMovie());
			result += "\t" + rent.getMovie().getTitle() + "\t" +
					String.valueOf(charge) + "\n";
		}
		result += "Amount owed is " + String.valueOf(calculateTotalCharge()) +
				"\n";
		result += "You earned " + String.valueOf(calculateTotalFrequentRenterPoints())
				+
				" frequent renter points";
		return result;
	}
    public int calculateRenterFrequentPoints(int frequentRenterPoints, Rental renter) {
		frequentRenterPoints++;
		if ((renter.getMovie().getPriceCode() == Movie.NEW_RELEASE) && renter.getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
    }
}
