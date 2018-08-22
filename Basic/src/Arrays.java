
public class Arrays {

	public static void main(String[] args) 
    {
		int[] arrayOfInts = new int[10];
		arrayOfInts[0]=5;
		arrayOfInts[1]=6;
		arrayOfInts[2]=13;
		arrayOfInts[3]=85;
		arrayOfInts[4]=44;
		arrayOfInts[5]=78;
		arrayOfInts[6]=7;
		arrayOfInts[7]=9;
		arrayOfInts[8]=32;
		arrayOfInts[9]=95;
	    
    	for (int i = 0; i < arrayOfInts.length-1; i++) {
    
    			System.out.println(method(arrayOfInts[i], arrayOfInts[i+1]));
    	}
    }
 
    public static int method(int a, int b)
    {
    	
    	if (a==0) 
    	{
             return b;
        }
      	if (b==0) 
    	{
             return a;
        }
    	else 
    	{
        int c=a+b;
        return c;
        }
        
    }
    
}