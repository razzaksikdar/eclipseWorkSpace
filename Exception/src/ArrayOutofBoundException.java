
public class ArrayOutofBoundException {
	   public static void main(String args[])
	   {
		   try {
			   int array[]=new int[10];
			   System.out.println(11+"th element"+array[11]);
		   }
		   catch(ArrayIndexOutOfBoundsException e) {
			   System.out.println("Exception thrown"+e);
		   }
		   finally
		   {
			   System.out.println("you should know your array size dude!");
		   }
	   }
}
