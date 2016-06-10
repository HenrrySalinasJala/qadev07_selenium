package comp.fundacionjala.movies;

public class NewReleaseMovie extends Movie implements IMovie {
	public static final double CHARGE = 3;
	public  NewReleaseMovie(String title, int priceCode ){
		super(title,priceCode);
	}
	@Override
	public double calculateRentalAmount(int daysRented){
		double partialAmount = daysRented * CHARGE;
		return partialAmount;
	}
}
