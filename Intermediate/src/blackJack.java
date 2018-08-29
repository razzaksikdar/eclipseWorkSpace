
import java.util.Scanner;
import java.lang.Math;

public class blackJack {

	public static void main(String[] args) 
	{

   
		Scanner s=new Scanner(System.in);

       int a,b; 
       System.out.println("Enter first elements :");
       a=s.nextInt();
       System.out.println("Enter second elements :");
       b=s.nextInt();
       
     
    	System.out.println("After condition met");
    	System.out.println(play(a,b));
    }
	
	public static int play(int a, int b) {
		  if (a>21){
		    if (b>21){ 
		    	return 0;
		    }
		  return b;
		  }

		  if (b>21){
			    if (a>21){ 
			     return 0;
			   }
			   return a;
		 }
		 if (a==b) {
			 return 0;
		 }
		 return Math.max(a,b);
		}
}
