package comp.fundacionjala.movies;

public class Movie {

    private String title;
    private int priceCode;
    public static final int REGULAR_MOVIE = 0;
    public static final int NEW_RELEASE_MOVIE = 1;
    public static final int CHILDREN_MOVIE = 2;

    public Movie(String title, int priceCode) {
        validatePriceCode(priceCode);
        this.priceCode = priceCode;
        this.title = title;
        
    }

    public void validatePriceCode(int priceCode) {
        if (!(priceCode >= REGULAR_MOVIE && priceCode <= CHILDREN_MOVIE)) {
            throw new IllegalArgumentException(priceCode + " is an invalid price code value.");
        }
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
