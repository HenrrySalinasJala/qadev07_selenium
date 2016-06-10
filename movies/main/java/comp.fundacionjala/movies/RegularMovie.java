package comp.fundacionjala.movies;


public class RegularMovie extends Movie implements IMovie{

	public static final double CHARGE = 1.5;
	public static final double INITIAL_CHARGE = 2;
	public static final double THRESHOLD_DAYS = 2;
	public  RegularMovie(String title, int priceCode ){
		super(title,priceCode);
	}
	@Override
	public double calculateRentalAmount(int daysRented){
		double partialAmount = INITIAL_CHARGE;
		if (daysRented > THRESHOLD_DAYS)
			partialAmount += (daysRented - THRESHOLD_DAYS) * CHARGE;
		return partialAmount;
	}
}
