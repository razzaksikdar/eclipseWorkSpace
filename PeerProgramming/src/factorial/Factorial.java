package factorial;
import java.util.Scanner;
//RAZZAK SIKDAR CODE
// ZIN INTERROGATE

public class Factorial {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

        System.out.println("Enter the number to get the factorial root: ");

        int n=s.nextInt();
        
        
     reverseFactorial(n);
        

	}
	
	public static void reverseFactorial(int fact)
	{
	int sum=1;
	int i=1;
	while (sum<fact) {
	i++;

	sum=sum*i;
	} 

	if(sum==fact)
	{
		System.out.println(i+"!");
	}
	else
	{
		System.out.println("NONE");
	}


	}
	

}
