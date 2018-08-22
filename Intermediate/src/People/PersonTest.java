package People;

public class PersonTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Person empOne = new  Person();
      // Invoking methods for each object created
      empOne.name= "peter";
      empOne.age=26;
      empOne.designation="Senior Software Engineer";
      
      Person empTwo = new  Person();
      empTwo.name= "Smith"; 
      empTwo.age=21;
      empTwo.designation="Software Engineer";
      
      PrintFindPeople pfp = new PrintFindPeople();
      pfp.addMethod(empOne);
      pfp.addMethod(empTwo);
      
      
      pfp.peopleList();
      pfp.nameFinder("Smith");
 
   }
}