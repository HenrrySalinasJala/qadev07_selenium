package comp.fundacionjala.movies;

public class Movie {
    
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
    	validatePriceCode(priceCode);
    	this.priceCode =priceCode;
    	this.title = title;
        
    }
    public void validatePriceCode(int priceCode){
    	if(!(priceCode>=REGULAR && priceCode<=CHILDRENS)){
    		throw new IllegalArgumentException(priceCode+ " is an invalid price code.");
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
    public void setTitle(String title){
    	this.title =title;
    }
    
}
