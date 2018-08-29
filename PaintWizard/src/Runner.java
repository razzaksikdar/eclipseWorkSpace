
/*Create a paint requirement wizard that will calculate which of the following three
products, would be the cheapest to buy, for the room you are painting.
1) CheapoMax (20Litre) £19.99
• This tin of paint will cover 10m2 per Litre
2) AverageJoes (15 Litre) £17.99
• This tin of paint will cover 11m2 per Litre
3) DuluxourousPaints (10 Litre) £25
• This tin of paint will cover 20m2 per Litre
Work out which one wastes the least.
Work out which is the cheapest paint brand to buy for any room.*/


public class Runner {

	public static void main(String[] args) {
		//public Paint(String name, int size, int coveragePL, double price)
		PriceComp p1=new PriceComp("CheapoMax", 20,10,19.99);
		PriceComp p2=new PriceComp("AverageJoes", 15,11,17.99);
		PriceComp p3=new PriceComp("DuluxourousPaints", 10,20,25.00);
		
		System.out.println(p1.paintBrand+" pricePerm2 "+p1.priceCal());
		System.out.println(p2.paintBrand+"pricePerm2"+p2.priceCal());
		System.out.println(p3.paintBrand+"pricePerm2 "+p3.priceCal());
		
        double perm2CostforCheapoMax=p1.priceCal();
        double perm2CostforAverageJoes=p2.priceCal();
        double perm2CostforDuluxourousPaints=p3.priceCal();
        		
        FindCheap fc=new FindCheap(perm2CostforCheapoMax,perm2CostforAverageJoes,perm2CostforDuluxourousPaints );
        
	}

}
