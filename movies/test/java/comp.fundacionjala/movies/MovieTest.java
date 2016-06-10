package comp.fundacionjala.movies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MovieTest {

    @Test
    public void aMovieInstanceIsNotNull() {
        assertNotNull(new Movie("new movie title", 2));
    }

    @Test
    public void aMovieCanBeCreatedWithItsTitleAndPriceCode() {
        Movie movie = new Movie("new movie title", 2);
        assertTrue(movie instanceof Movie);
    }

    @Test
    public void movieTitleCanBeUpdated() {
        Movie movie = new Movie("2", 1);
        String newTitle = "new title movie";
        movie.setTitle(newTitle);
        assertEquals(newTitle, movie.getTitle());
    }
    @Test
    public void movieTitleCanBeExtracted() {
        Movie movie = new Movie("title test", 1);
        assertEquals("title test", movie.getTitle());
    }
    @Test
    public void moviePriceCodeCanBeUpdated() {
        Movie movie = new Movie("2", 0);
        int newPriceCode = 2;
        movie.setPriceCode(newPriceCode);
        assertEquals(newPriceCode, movie.getPriceCode());
    }
    @Test
    public void moviePriceCodeCanBeExtracted() {
        Movie movie = new Movie("title test", 2);
        assertEquals(2, movie.getPriceCode());
    }
    @Test(expected = IllegalArgumentException.class)
    public void movieCannotHaveAPriceCodeInvalid() {
        Movie movie = new Movie("2", 100);
    }

}
