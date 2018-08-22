package People;

public class Person {

  public String name;
  public int age;
  public String designation;
   
  public String toString()
  {
	  return String.format("the persons name is %s, age is %d,d their job title is %s\n", name, age, designation);
  }
  
   
  /*
 
   // This is the constructor of the class Employee
   public Person(String name) {
      this.name = name;
   }

   // Assign the age of the Employee  to the variable age.
   public void empAge(int empAge) {
      age = empAge;
   }

   // Assign the designation to the variable designation.
   public void empDesignation(String empDesig) {
      designation = empDesig;
   }

   // Print the Employee details 
   public void printPerson() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
   }*/
}