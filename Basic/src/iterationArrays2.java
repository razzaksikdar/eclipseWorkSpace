import java.util.Scanner;

public class iterationArrays2 
{
	
	public static void main(String[] args) 
	{

   
		Scanner s=new Scanner(System.in);

        System.out.println("Enter number of elements: ");

        int n=s.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter elements :");
        {

        for(int i=0;i<arr.length;i++){//for reading array
            arr[i]=s.nextInt();
        }
        }
        
        
        for(int i=0;i<arr.length;i++){//for multiplying with 10 and replace the value
            arr[i]=arr[i]*10;
        }

        
        
    	System.out.println("array content");
        for(int i: arr)
        { //for printing array

            System.out.println(i);
        }
    }

}
