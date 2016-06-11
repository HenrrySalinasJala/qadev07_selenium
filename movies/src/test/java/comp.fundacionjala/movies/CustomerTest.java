package comp.fundacionjala.movies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void aCustomerInstanceIsNotNull() {
        Customer customer=new Customer("Juan");
        assertNotNull(customer);
    }
    @Test
    public void aCustomerInstanceCanBeCreatedGivenACustomerName(){
        Customer customer=new Customer("Juan");
        assertTrue(customer instanceof Customer);
    }
    @Test
    public void theNameOfCustomerCanBeExtracted(){
        Customer customer=new Customer("Juan");
        assertEquals("Juan",customer.getName());
    }
    @Test
    public void moreThanTwoRentalInstancesCanBeAddedToCustomerShoppingCart(){
        IMovie movie=new RegularMovie("example");
        IMovie movie2=new ChildrenMovie("example2");
        Rental rental=new Rental(movie,7);
        Rental rental2=new Rental(movie2,4);
        Customer customer=new Customer("Juan");
        customer.addRental(rental);
        customer.addRental(rental2);
        assertEquals(2,customer.getRentals().size());
    }
    @Test
    public void aDuplicateRentalInstanceCannotBeAddedToCustomerShoppingCart(){
        IMovie movie=new RegularMovie("example");
        Rental rental=new Rental(movie,7);
        Customer customer=new Customer("Juan");
        customer.addRental(rental);
        customer.addRental(rental);
        assertEquals(1,customer.getRentals().size());
    }

    @Test
    public void aCustomerCanCalculateTheTotalCharge(){
        IMovie movie1=new ChildrenMovie("Resident Evil I");
        IMovie movie2=new RegularMovie("Resident Evil II");
        IMovie movie3=new NewReleaseMovie("Resident Evil III");
        Rental rental=new Rental(movie1,2);
        Rental rental2=new Rental(movie2,2);
        Rental rental3=new Rental(movie3,2);
        Customer customer=new Customer("Juan");
        customer.addRental(rental);
        customer.addRental(rental2);
        customer.addRental(rental3);
        assertEquals(9.5,customer.calculateTotalCharge(),0000000001);
    }
}
