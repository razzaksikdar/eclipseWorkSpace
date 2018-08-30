package Reverse;

public class StringReverse {
public static void main() {
	String s="I love England";
	String sr=reverseString(s);
	System.out.println("reverse:"+sr);
		
}

public static String reverseString(String S)
{

 String str=S;
 if(str.isEmpty())
 
	 return str;
 

 else 
	 return reverseString(str.substring(1)+str.charAt(0));

 

}

}
