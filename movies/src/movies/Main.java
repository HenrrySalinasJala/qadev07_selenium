package movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Henrry");
        customer.addRental(new Rental(new Movie("Resident Evil I", 0), 2));
        customer.addRental(new Rental(new Movie("Resident Evil II", 2), 2));
        customer.addRental(new Rental(new Movie("Resident Evil III", 1), 2));
        
        System.out.println(customer.statement());
    }
}
