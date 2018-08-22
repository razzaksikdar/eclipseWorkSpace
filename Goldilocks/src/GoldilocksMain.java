
public class GoldilocksMain {
	
	int[][] seatTemp;

	public static void main(String[] args) {

		Goldilocks gl = new Goldilocks(100,80);
	
		
	   int gWeight=gl.weight;
	   int gTempLimit=gl.tempLimit;
		
		int[][] seatTemp = {{30, 50},{130, 60},{90, 60},{150, 85},{120, 70},{200, 200},{110, 100}};
		

		for(int i = 0; i<seatTemp.length; i++)
		{
		    for(int j = 0; j<1; j++)
		    {
		         
		    	if (seatTemp[i][j]>=gWeight && seatTemp[i][j+1]<=gTempLimit)
		    	{
		    		System.out.print("Chair Number: "+(i+1));
		    	System.out.print(" Weight Capacity: "+seatTemp[i][j] +" Temp Tolerence: "+seatTemp[i][j+1]);
		    	}
		       
		    }
		    System.out.println();
		}
		
	}
}
	
