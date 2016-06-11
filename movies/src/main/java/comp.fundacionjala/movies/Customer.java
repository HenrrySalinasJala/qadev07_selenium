package comp.fundacionjala.movies;

import java.util.HashSet;
import java.util.Set;

class Customer {
    private static final String BREAK_LINE = "\n";
    private static final String TABULATION = "\t";
    private String name;
    private Set<Rental> rentalSet = new HashSet<>();
    
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentalSet.add(arg);
    }

    public String getName() {
        return name;
    }

    public Set getRentals() {
        return rentalSet;
    }

    public int calculateTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentalSet) {
            frequentRenterPoints += rental.calculateRenterFrequentPoints();
        }
        return frequentRenterPoints;
    }

    public double calculateTotalCharge() {
        double totalCharge = 0;
        for (Rental rental : rentalSet) {
            totalCharge += rental.calculateRentalCharge((IMovie) rental.getMovie());
        }
        return totalCharge;
    }

    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ");
        result.append(getName());
        result.append(BREAK_LINE);
        for (Rental rental : rentalSet) {
            double charge = rental.calculateRentalCharge((IMovie) rental.getMovie());
            result.append(TABULATION);
            result.append(rental.getMovie().getTitle());
            result.append(TABULATION);
            result.append(charge);
            result.append(BREAK_LINE);
        }
        result.append("Amount owed is ");
        result.append(calculateTotalCharge());
        result.append(BREAK_LINE);
        result.append("You earned ");
        result.append(calculateTotalFrequentRenterPoints());
        result.append(" frequent renter points");
        return result.toString();
    }


}
