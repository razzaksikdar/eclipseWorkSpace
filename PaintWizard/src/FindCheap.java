
public class FindCheap {
    
	double cheapoMax, averageJoes, duluxourousPaints;
	public FindCheap(double cm, double avj, double dlux)
	{
		this.cheapoMax=cm;
		this.averageJoes=avj;
		this.duluxourousPaints=dlux;
		
		if(cheapoMax<averageJoes && cheapoMax<duluxourousPaints)
		{
			System.out.println("CheapoMax is the cheapest");
		}
		if(averageJoes<cheapoMax && averageJoes<duluxourousPaints)
		{
			System.out.println("averageJoes is cheapest");
		}
		
		if(duluxourousPaints<cheapoMax && duluxourousPaints<averageJoes)
		{
			System.out.println("duluxourousPaints is cheapest");
		}
		
	}
}
