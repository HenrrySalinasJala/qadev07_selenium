package comp.fundacionjala.movies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RentalTest {

    @Test
    public void aRentalInstanceIsNotNull() {
        IMovie movie = new RegularMovie("title");
        assertNotNull(new Rental(movie, 1));
    }

    @Test
    public void aRentalInstanceCanBeCreatedWithAMovieAndDaysRented() {
        IMovie movie = new RegularMovie("title");
        Rental rental = new Rental(movie, 2);
        assertTrue(rental instanceof Rental);
    }

    @Test
    public void theDaysRentedCanBeUpdated() {
        IMovie movie = new RegularMovie("title");
        Rental rental = new Rental(movie, 2);
        rental.setDaysRented(4);
        assertEquals(4, rental.getDaysRented());
    }

    @Test
    public void daysRentedCanBeExtracted() {
        IMovie movie = new RegularMovie("title");
        Rental rental = new Rental(movie, 2);
        assertEquals(2, rental.getDaysRented());
    }

    @Test
    public void theMovieInstanceCanbeExtracted() {
        IMovie movie = new RegularMovie("title");
        Rental rental = new Rental(movie, 2);
        assertTrue(rental.getMovie() instanceof Movie);
    }

    @Test
    public void aCustomerInstanceCanCalculateRenterPointsWhenPriceCodeIsRelease() {
        IMovie movie = new NewReleaseMovie("title");
        Rental rental = new Rental(movie, 10);
        assertEquals(2, rental.calculateRenterFrequentPoints());
    }

    @Test
    public void aCustomerInstanceCanCalculateRenterPointsWhenCodePriceIsChildren() {
        IMovie movie = new ChildrenMovie("title");
        Rental rental = new Rental(movie, 10);
        assertEquals(1, rental.calculateRenterFrequentPoints());
    }

    @Test
    public void aCustomerInstanceCanCalculateRenterPointsWhenCodePriceIsRegular() {
        IMovie movie = new RegularMovie("title");
        Rental rental = new Rental(movie, 10);
        assertEquals(1, rental.calculateRenterFrequentPoints());
    }


}
