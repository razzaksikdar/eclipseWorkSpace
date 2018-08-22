


import java.util.Scanner;

public class scannerTest {


public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("What is your name?");

String name = s.nextLine();
System.out.println("What is your age");

int age = s.nextInt();
System.out.println("Hi " + name + ", next year you will be" + (age + 1));
}

}
