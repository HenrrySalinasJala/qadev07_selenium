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
        IMovie movie=new RegularMovie("example",0);
        IMovie movie2=new ChildrenMovie("example2",1);
        Rental rental=new Rental(movie,7);
        Rental rental2=new Rental(movie2,4);
        Customer customer=new Customer("Juan");
        customer.addRental(rental);
        customer.addRental(rental2);
        assertEquals(2,customer.getRentals().size());
    }
    @Test
    public void aDuplicateRentalInstanceCannotBeAddedToCustomerShoppingCart(){
        IMovie movie=new RegularMovie("example",0);
        Rental rental=new Rental(movie,7);
        Customer customer=new Customer("Juan");
        customer.addRental(rental);
        customer.addRental(rental);
        assertEquals(1,customer.getRentals().size());
    }

    @Test
    public void aCustomerInstanceCanCalculateRenterPointsWhenPriceCodeIsRelease(){
        IMovie movie=new NewReleaseMovie("title",1);
        Rental rental=new Rental(movie,10);
        Customer customer=new Customer("Juan");
        assertEquals(2,customer.calculateRenterFrequentPoints(0, rental));
    }

    @Test
    public void aCustomerInstanceCanCalculateRenterPointsWhenCodePriceIsChildrens(){
        IMovie movie=new ChildrenMovie("title",2);
        Rental rental=new Rental(movie,10);
        Customer customer=new Customer("Juan");
        assertEquals(1,customer.calculateRenterFrequentPoints(0, rental));
    }

    @Test
    public void aCustomerInstanceCanCalculateRenterPointsWhenCodePriceIsRegular(){
        IMovie movie=new RegularMovie("title",0);
        Rental rental=new Rental(movie,10);
        Customer customer=new Customer("Juan");
        assertEquals(1,customer.calculateRenterFrequentPoints(0, rental));
    }
    @Test
    public void aCustomerCanCalculateTheTotalCharge(){
        IMovie movie1=new ChildrenMovie("Resident Evil I",0);
        IMovie movie2=new RegularMovie("Resident Evil II",2);
        IMovie movie3=new NewReleaseMovie("Resident Evil III",1);
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
