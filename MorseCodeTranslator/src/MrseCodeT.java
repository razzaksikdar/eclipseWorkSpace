import java.awt.Toolkit;
import java.util.HashMap;


public class MrseCodeT {
		HashMap<String, String> map=new HashMap<>();
		public void add() {
			map.put(".-", "A");
			map.put("-...", "B");
			map.put("-.-.", "C");
			map.put("-..", "D");
			map.put(".", "E");
			map.put("..-.", "F");
			map.put("--.", "G");
			map.put("....", "H");
			map.put("..", "I");
			map.put(".---", "J");
			map.put("-.-", "K");
			map.put(".-..", "L");
			map.put("--", "M");
			map.put("-.", "N");
			map.put("---", "O");
			map.put(".--.", "P");
			map.put("--.-", "Q");
			map.put(".-.", "R");
			map.put("...", "S");
			map.put("-", "T");
			map.put("..-", "U");
			map.put("...-", "V");
			map.put(".--", "W");
			map.put("-..-", "X");
			map.put("-.--", "Y");
			map.put("--..", "Z");
			map.put("/", " ");
		}
			 
  public void mcFinder(String input) {
	  
	  String output="";
	  String temp = "";
	  
	  for(int i=0; i<=input.length()-1; i++)
	  {
		  if(input.charAt(i)!=' ')
		  {
			  temp=temp + input.charAt(i);
		  }
		  else if(input.charAt(i)==' ') {
			  output=output + map.get(temp);
			  temp="";
		  }  
		  if(i==input.length()-1) {
			  output=output + map.get(temp);
			  
		  }  
	  }
	  System.out.println(output);
	  Toolkit.getDefaultToolkit().beep();
  }
}
