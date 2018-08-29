
import java.util.Scanner;


public class Runner {

public static void main (String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("number");
	int a=sc.nextInt();
	System.out.println("Power:");
	int b=sc.nextInt();
	
	int x= recursionPower(a,b);
	System.out.println(x);
}

public static int recursionPower(int base, int power)
{
	if(power==0) {
		return 1;
	}
	else {
		return base* (recursionPower(base, power-1));
	}
}
}
