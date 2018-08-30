
public class StringOps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(firstTwo("aabbbcc"));
	}
	public static String firstTwo(String str) {
		  
		  String s=str;
		  if(s.length()>=2)
		  {
		  return s.substring(0, 2);
		  }
		  else if(s.length()==1)
		  {
			  return s;
		  }
		  else if(s.length()==0)
		  {
		return s;
		  }
		return s;
		
		}

}
