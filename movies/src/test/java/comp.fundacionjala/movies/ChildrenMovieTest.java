package comp.fundacionjala.movies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChildrenMovieTest {
    @Test
    public void aChildrenMovieInstanceIsNotNull() {
        assertNotNull(new ChildrenMovie("new movie title"));
    }

    @Test
    public void aChildrenMovieCanBeCreatedOnlyWithItsTitle() {
        ChildrenMovie movie = new ChildrenMovie("new movie title");
        assertTrue(movie instanceof ChildrenMovie);
    }

    @Test
    public void aChildrenMovieCanCalculateItsRentalCharge() {
        IMovie movie = new ChildrenMovie("children title movie");
        assertEquals(4.5, movie.calculateRentalCharge(5), 00000000001);
    }
}
