
public class Runner {

	public static void main(String[] args) {
		
		MotorCycle mc1= new MotorCycle(true, 30, "Motor Bike", 2, 2, 2000, "FR12FFD");
		Car car1= new Car("Jeep", true, "Toyota", "Private Car", 4, 5, 3200, "RAZ12MAX");
		Car car2= new Car("Jeep", true, "Toyota", "Private45 Car", 4, 5, 3200, "RAZ12MAX");
		
	Garage g=new Garage();
	g.addVehicle(mc1);
	g.addVehicle(car1);
	g.addVehicle(car2);
	
	g.vehicleBilling("Private Car");
		
		
	}
	
}
