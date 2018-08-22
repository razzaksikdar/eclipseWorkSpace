
import java.util.Scanner;

public class uniqueSum {

		public static void main(String[] args) 
		{

	   
		  Scanner s=new Scanner(System.in);

	       int a,b,c; 
	       System.out.println("Enter first elements :");
	       a=s.nextInt();
	       System.out.println("Enter second elements :");
	       b=s.nextInt();
	       System.out.println("Enter second elements :");
	       c=s.nextInt();
	     
	    	System.out.println("After condition met");
	    	System.out.println(uniqueSum(a,b,c));
	    }
		
		public static int uniqueSum(int a, int b, int c)
		{
		if(a!=b && a!=c && b!=c)
		{
			int d=a+b+c; 
			return d;
		}
		else if(a==b && a!=c) {
		return c;
		}
		else if(a!=b && a==c) {
			return b;
			}
				
		else if(b==c && a!=b)
		{
		return a;
		}
		else 
		return 0;
		
			}
}
			
			

