
public class Paint {

	String paintBrand;
	int containerSize;
	int coveragePerLiter;
	double containerPrice;
	
	public Paint(String name, int size, int coveragePL, double price)
	{
		this.paintBrand=name;
		this.containerSize=size;
		this.coveragePerLiter=coveragePL;
		this.containerPrice=price;
	}

	public String getPaintBrand() {
		return paintBrand;
	}

	public void setPaintBrand(String paintBrand) {
		this.paintBrand = paintBrand;
	}

	public int getContainerSize() {
		return containerSize;
	}

	public void setContainerSize(int containerSize) {
		this.containerSize = containerSize;
	}

	public int getCoveragePerLiter() {
		return coveragePerLiter;
	}

	public void setCoveragePerLiter(int coveragePerLiter) {
		this.coveragePerLiter = coveragePerLiter;
	}

	public double getContainerPrice() {
		return containerPrice;
	}

	public void setContainerPrice(double containerPrice) {
		this.containerPrice = containerPrice;
	}


	
	
}
