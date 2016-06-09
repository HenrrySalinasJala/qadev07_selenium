package movies;

import static org.junit.Assert.*;

import org.junit.Test;

public class RentalTest {

	@Test
	public void aRentalInstanceIsNotNull() {
		Movie movie=new Movie("title",2);
		assertNotNull(new Rental(movie, 1));
	}
	@Test
	public void aRentalInstanceCanBeCreatedWithAMovieAndDaysRented() {
		Movie movie=new Movie("title",2);
		Rental rental=new Rental(movie,2);
		assertTrue(rental instanceof Rental);
	}
	@Test 
	public void theDaysRentedCanBeUpdated(){
		Movie movie=new Movie("title",2);
		Rental rental=new Rental(movie,2);
		rental.setDaysRented(4);
		assertEquals(4,rental.getDaysRented());
	}
	@Test
	public void daysRentedCanBeExtracted() {
		Movie movie=new Movie("title",0);
		Rental rental=new Rental(movie,2);
		assertEquals(2,rental.getDaysRented());
	}
	@Test
	public void theMovieInstanceCanbeExtracted(){
		Movie movie=new Movie("title",0);
		Rental rental=new Rental(movie,2);
		assertTrue(rental.getMovie()instanceof Movie);
	}
	@Test
	public void anRentalInstanceCanCalculateTheAmountByChildrenPriceCode(){
	    Movie movie=new Movie("title test",2);
	    Rental rental=new Rental(movie,5);
	    assertEquals(4.5,rental.calculateRentalAmount(),00000000001);
	    
	}
	@Test
	public void anRentalInstanceCanCalculateTheAmountByReleasePriceCode(){
	    Movie movie=new Movie("title test",1);
	    Rental rental=new Rental(movie,5);
	    assertEquals(15,rental.calculateRentalAmount(),00000000001);
	    
	}
	@Test
	public void anRentalInstanceCanCalculateTheAmountByRegularPriceCode(){
	    Movie movie=new Movie("title test",0);
	    Rental rental=new Rental(movie,5);
	    assertEquals(6.5,rental.calculateRentalAmount(),00000000001);
	    
	}
	

}
