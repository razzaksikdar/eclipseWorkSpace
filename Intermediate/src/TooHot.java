
public class TooHot {
	
	public static void main(String[] args) 
	{
	boolean isSummer=true;
	int temp=91;
	System.out.println(tempTest(temp,isSummer));
	
	}
	public static boolean tempTest(int temp, boolean isSummer)
	{
    if(isSummer && 60 <= temp && temp <= 100)
        return true;
          
    if(!isSummer && 60 <= temp && temp <= 90)
        return true;
                    
    return false;
    }


}