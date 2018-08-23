
public class Car extends Vehicle{
 
	String bodyType;
	boolean sunRoof;
	String brand;
	
	public Car(String bodyType, boolean sunRoof, String brand,String vehicleType, int numberOfWheel, int numberOfSeat, int engineSize, String regNo)
	{
		super(vehicleType,numberOfWheel,numberOfSeat, engineSize, regNo);
		this.bodyType = bodyType;
		this.sunRoof = sunRoof;
		this.brand = brand;
	}
	
	public String toString() {
		return "Car {"+" bodyType= "+bodyType+" sunRoof?= "+sunRoof+" Car Brand= "+brand+"vehicleType"+vehicleType+" numberOfWheel="+numberOfWheel+" numberOfSeat="+numberOfSeat+" EngineSize ="+engineSize+" regNo="+regNo+"}";
	}
	
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public boolean isSunRoof() {
		return sunRoof;
	}
	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
