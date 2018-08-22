
public class Conditionals 
{

    public static void main(String[] args) 
    {
    	int a=5;
    	int b=7;
    	boolean tf=false;
    	System.out.println(method(a, b, tf));
    }
 
    public static int method(int a, int b, boolean tf)
    {
    	
    	if (tf==true) 
    	{
        int c=a+b;
        return c;
        }
    	else 
    	{
        int c=a*b;
        return c;
        }
        
    }
    
}