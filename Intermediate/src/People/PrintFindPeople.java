package People;
import java.util.ArrayList;
public class PrintFindPeople {
	ArrayList<Person> p=new ArrayList<Person>();
	public void addMethod(Person addPeople)
	{
		p.add(addPeople);
	}
	
	public void peopleList()
	{
		for (Person i: p)
		{
			System.out.println(i);
		}
	}
	
	public void nameFinder(String s)
	{
		for(Person i: p)
		{
			if(i.name==s)
			{
				System.out.println(i);
			}
			else
			{
				
			}
		}
	}

}
