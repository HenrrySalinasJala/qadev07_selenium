package comp.fundacionjala.movies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RentalTest {

	@Test
	public void aRentalInstanceIsNotNull() {
		IMovie movie=new RegularMovie("title",2);
		assertNotNull(new Rental( movie, 1));
	}

	@Test
	public void aRentalInstanceCanBeCreatedWithAMovieAndDaysRented() {
		IMovie movie=new RegularMovie("title",2);
		Rental rental=new Rental(movie,2);
		assertTrue(rental instanceof Rental);
	}
	@Test 
	public void theDaysRentedCanBeUpdated(){
		IMovie movie=new RegularMovie("title",2);
		Rental rental=new Rental(movie,2);
		rental.setDaysRented(4);
		assertEquals(4,rental.getDaysRented());
	}
	@Test
	public void daysRentedCanBeExtracted() {
		IMovie movie=new RegularMovie("title",0);
		Rental rental=new Rental(movie,2);
		assertEquals(2,rental.getDaysRented());
	}
	@Test
	public void theMovieInstanceCanbeExtracted(){
		IMovie movie=new RegularMovie("title",0);
		Rental rental=new Rental(movie,2);
		assertTrue(rental.getMovie()instanceof Movie);
	}

	@Test
	public void anRentalInstanceCanCalculateTheAmountByChildrenPriceCode(){
	    IMovie movie=new ChildrenMovie("title test",2);
	    Rental rental=new Rental(movie,5);
	    assertEquals(4.5,rental.calculateRentalAmount((IMovie) rental.getMovie()),00000000001);
	    
	}

	@Test
	public void anRentalInstanceCanCalculateTheAmountByReleasePriceCode(){
	    IMovie movie=new NewReleaseMovie("title test1",1);
	    Rental rental=new Rental(movie,5);
	    assertEquals(15,rental.calculateRentalAmount((IMovie) rental.getMovie()),00000000001);

	}

	@Test
	public void anRentalInstanceCanCalculateTheAmountByRegularPriceCode(){
	    IMovie movie=new RegularMovie("title test",0);
	    Rental rental=new Rental(movie,5);
	    assertEquals(6.5,rental.calculateRentalAmount((IMovie) rental.getMovie()),00000000001);
	    
	}
	

}
