package comp.fundacionjala.movies;

public class ChildrenMovie extends Movie implements IMovie {
	public static final double CHARGE = 1.5;
	public static final double INITIAL_CHARGE = 1.5;
	public static final double THRESHOLD_DAYS = 3;
	public  ChildrenMovie(String title, int priceCode ){
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
