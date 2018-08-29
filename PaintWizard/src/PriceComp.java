
public class PriceComp extends Paint {

	double pricePerm2;
	
	public PriceComp(String name, int size, int coveragePL, double price) {
		super(name, size, coveragePL, price);
	
	}


	public double priceCal()
	{
		pricePerm2=containerPrice/(containerSize*coveragePerLiter);
		return pricePerm2;
	}
}
