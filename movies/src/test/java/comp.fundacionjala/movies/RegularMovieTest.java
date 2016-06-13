package comp.fundacionjala.movies;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegularMovieTest {
    @Test
    public void aRegularMovieInstanceIsNotNull() {
        assertNotNull(new RegularMovie("new movie title"));
    }

    @Test
    public void aRegularMovieCanBeCreatedOnlyWithItsTitle() {
        RegularMovie movie = new RegularMovie("new movie title");
        assertTrue(movie instanceof RegularMovie);
    }

    @Test
    public void aRegularMovieCanCalculateItsRentalCharge() {
        IMovie movie = new RegularMovie("children title movie");
        assertEquals(6.5, movie.calculateRentalCharge(5), 00000000001);
    }
}
