
public class Vehicle {
	String vehicleType;
	int numberOfWheel;
	int numberOfSeat;
	int engineSize;
	String regNo;


	public Vehicle(String vehicleType,int numberOfWheel, int numberOfSeat, int engineSize, String regNo) {
		this.vehicleType = vehicleType;
		this.numberOfWheel = numberOfWheel;
		this.numberOfSeat = numberOfSeat;
		this.engineSize = engineSize;
		this.regNo = regNo;
	}
	
	public String toString() {
		return "Vehicle {" +"vehicleType"+vehicleType+" numberOfWheel= "+numberOfWheel+" numberOfSeat= "+numberOfSeat+" engineSize= "+engineSize+" regNo= "+regNo+"}";
	}
	
	public void setNumberOfWheel(int numberOfWheel)
	{
		this.numberOfWheel = numberOfWheel;
	}
	
	public int getNumberOfWheel()
	{
		return numberOfWheel;
	}

	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public void setEngineSize(int engineSize)
	{
		this.engineSize = engineSize;
	}
	
	public int getEngineSize()
	{
		return engineSize;
	}


	public void setRegNo(String regNo) 
	{
		this.regNo = regNo;
	}
	
	public String getRegNo() 
	{
		return regNo;
	}	

	
}
