

import java.util.*;

public class Garage {

ArrayList<Vehicle> vArr= new ArrayList<Vehicle>();


public void addVehicle(Vehicle addVehicle)
{
	vArr.add(addVehicle);
 System.out.println(vArr);
}

public void removeVehicle(Vehicle removeVehicle)
{
	vArr.remove(removeVehicle);
 System.out.println(vArr);
}



public void removeAllVehicle()
{
	vArr.clear();
}

public int vehicleBilling(String s)
{
	for(Vehicle i: vArr)
	{
		if(i.toString().contains("Private Car"))
		{
			System.out.println(" price ="+1500);
	      
		}
		else if(i.toString().contains("Motor Bike"))
		{
			System.out.println(" price ="+700);
		}
	}
	return 0;
}
}

	


