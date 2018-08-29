
public class FindCheap {
    
	double cheapoMax, averageJoes, duluxourousPaints;
	public FindCheap(double cm, double avj, double dlux)
	{
		this.cheapoMax=cm;
		this.averageJoes=avj;
		this.duluxourousPaints=dlux;
		
		if(cheapoMax<averageJoes && cheapoMax<duluxourousPaints)
		{
			System.out.println("CheapoMax is cheaper");
		}
		if(averageJoes<cheapoMax && averageJoes<duluxourousPaints)
		{
			System.out.println("averageJoes is cheaper");
		}
		
		if(duluxourousPaints<cheapoMax && duluxourousPaints<averageJoes)
		{
			System.out.println("duluxourousPaints is cheaper");
		}
		
	}
}
