
public class MotorCycle extends Vehicle {

	boolean sports;
	int wheelSize;
	
	public MotorCycle(boolean sports, int wheelSize, String vehicleType, int numberOfWheel, int numberOfSeat, int engineSize, String regNo)
	{
		super(vehicleType,numberOfWheel,numberOfSeat, engineSize, regNo);
		this.sports = sports;
		this.wheelSize = wheelSize;
	}
	
	public String toString() {
		return "Motor Cycle {"+"Sports bike? "+sports+"wheelSize: "+wheelSize+"vehicleType"+vehicleType+" numberOfWheel="+numberOfWheel+" numberOfSeat="+numberOfSeat+" EngineSize ="+engineSize+" regNo="+regNo+"}";
	}
	
	
	public boolean isSports() {
		return sports;
	}
	public void setSports(boolean sports) {
		this.sports = sports;
	}
	public int getWheelSize() {
		return wheelSize;
	}
	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}
	
	
	
}
