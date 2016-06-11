package comp.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Henrry");
        customer.addRental(new Rental(new ChildrenMovie("Resident Evil I"), 2));
        customer.addRental(new Rental(new RegularMovie("Resident Evil II"), 2));
        customer.addRental(new Rental(new NewReleaseMovie("Resident Evil III"), 2));
        System.out.println(customer.statement());
    }
}
