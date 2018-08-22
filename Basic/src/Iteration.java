
public class Iteration {
	public static void main(String[] args) 
    {
    	
    	int b=7;
    	for(int i=0; i<10; i++) {
    	System.out.println(method(i, b));
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