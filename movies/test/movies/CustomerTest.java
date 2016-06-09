package movies;

import static org.junit.Assert.*;

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
	    Movie movie=new Movie("example",0);
	    Movie movie2=new Movie("example2",1);
	    Rental rental=new Rental(movie,7);
	    Rental rental2=new Rental(movie2,4);
	    Customer customer=new Customer("Juan");
	    customer.addRental(rental);
	    customer.addRental(rental2);
	    assertEquals(2,customer.getRentals().size());
		
	}
	@Test
	public void aDuplicateRentalInstanceCannotBeAddedToCustomerShoppingCart(){
	    Movie movie=new Movie("example",0);
	    Movie movie2=new Movie("example2",1);
	    Rental rental=new Rental(movie,7);
	    Customer customer=new Customer("Juan");
	    customer.addRental(rental);
	    customer.addRental(rental);
	    assertEquals(1,customer.getRentals().size());
		
	}
	@Test 
	public void aCustomerInstanceCanCalculateRenterPointsWhenPriceCodeIsRelease(){
	    Movie movie=new Movie("title",1);
	    Rental rental=new Rental(movie,10);
	    Customer customer=new Customer("Juan");
	    assertEquals(2,customer.calculateRenterPoints(0, rental));
	    
	}
	@Test
	public void aCustomerInstanceCanCalculateRenterPointsWhenCodePriceIsChildrens(){
	    Movie movie=new Movie("title",2);
	    Rental rental=new Rental(movie,10);
	    Customer customer=new Customer("Juan");
	    assertEquals(1,customer.calculateRenterPoints(0, rental));
	    
	}
	@Test
	public void aCustomerInstanceCanCalculateRenterPointsWhenCodePriceIsRegular(){
	    Movie movie=new Movie("title",0);
	    Rental rental=new Rental(movie,10);
	    Customer customer=new Customer("Juan");
	    assertEquals(1,customer.calculateRenterPoints(0, rental));
	    
	}
	@Test
	public void aCustomerCanRentMovies(){
	    Movie movie1=new Movie("Resident Evil I",0);
	    Movie movie2=new Movie("Resident Evil II",2);
	    Movie movie3=new Movie("Resident Evil III",1);
	    Rental rental=new Rental(movie1,2);
	    Rental rental2=new Rental(movie2,2);
	    Rental rental3=new Rental(movie3,2);
	    Customer customer=new Customer("Juan");
	    customer.addRental(rental);
	    customer.addRental(rental2);
	    customer.addRental(rental3);
	    customer.rent("");
	    assertEquals(9.5,customer.geTotalRentMount(),0000000001);
	    
	}
}
