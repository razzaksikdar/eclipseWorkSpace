
public class Conditionals2 {
	public static void main(String[] args) 
    {
    	int a=6;
    	int b=7;
    	System.out.println(method(a, b));
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