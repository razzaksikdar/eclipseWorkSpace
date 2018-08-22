package dogoCompetition;

import java.util.Scanner;

public class DogoCompetition {
	
	public static void main(String[] args)
    {
		Scanner s=new Scanner(System.in);

        System.out.println("Enter wining pup number: ");

        int n=s.nextInt();
        
		PrintOtherDogList(n);
    }

    static void PrintOtherDogList(int dogResult)
    {
        String standingsList = "";
        for (int i = 0; i <= 100; i++)
        {
            if (i != dogResult)
            {
                String number = NumberWithSuffix(Integer.toString(i));
                standingsList += String.format(number + ",");
            }
            if (i == dogResult)
            {
                standingsList += "X,";
            }
        }
        System.out.println(standingsList);
    }

    static String NumberWithSuffix(String number)
    {
        String returnString = number;
        int serialNumber = Integer.parseInt(number);
        if (serialNumber >= 20)
        {
            int finalDigit = Integer.parseInt(number.substring(number.length() - 1));
            if (finalDigit == 1)
            {
                returnString += "st";
            }
           else if (finalDigit == 2)
            {
                returnString += "nd";
            }
            else if (finalDigit == 3)
            {
                returnString += "rd";
            }
            else
            {
                returnString += "th";
            }
        }
        else if (serialNumber >= 10 && serialNumber < 20)
        {
            returnString += "th";
        }
        else if (serialNumber >= 0 && serialNumber <= 9)
        {
            if (serialNumber >= 4 && serialNumber <= 9)
            {
                returnString += "th";
            }
            else if (serialNumber == 0)
            {
                returnString += "th";
            }
            else if (serialNumber == 1)
            {
                returnString += "st";
            }
            else if (serialNumber == 2)
            {
                returnString += "nd";
            }
            else if (serialNumber == 3)
            {
                returnString += "rd";
            }
        }
        return returnString;
    }
}
	

