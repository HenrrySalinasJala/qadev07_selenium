package movies;

public class Movie {
    
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
    	validatePriceCode(priceCode);
    	_priceCode=priceCode;
    	_title = title;
        
    }
    public void validatePriceCode(int priceCode){
    	if(!(priceCode>=REGULAR && priceCode<=CHILDRENS)){
    		throw new IllegalArgumentException(priceCode+ " is an invalid price code.");
    	}
    	
    }
    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }
    public void setTitle(String title){
    	_title=title;
    }
    
}
