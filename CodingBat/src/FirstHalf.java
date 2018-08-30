
public class FirstHalf {
public static void main(String[] args) {
	
System.out.println(firstHalf("aabb"));
}
public static String firstHalf(String str) {
	
	String s=str;
	int l=s.length();
	String output=s.substring(0, l/2);
	
	return output;
}

}
