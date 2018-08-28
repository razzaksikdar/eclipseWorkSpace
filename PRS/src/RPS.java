import java.util.*;
import java.math.*;
public class RPS {
	
	int totalGames = 0;
	int compWins = 0;
	int playerWins = 0;
	int ties = 0;
	int rockCount = 0;
	int paperCount = 0;
	int scissorCount = 0;
	int compInput;
	String compMove;
	int pInput;
	boolean gameState = true;
	Scanner s = new Scanner(System.in);
	
	public void getInput() {
		
		while(gameState) {
			System.out.println("Choose Rock, Paper or Scissors or Type 'Exit' to exit the game:");
			String playerInput = s.nextLine();
			
			
			Random rand = new Random();
			int randNum = rand.nextInt(3);
			if(randNum == 0) {
				compMove = "Rock";
				rockCount++;
			}
			else if(randNum == 1) {
				compMove = "Paper";
				paperCount++;
			}
			else if (randNum == 2) {
				compMove = "Scissors";
				scissorCount++;
			}
			System.out.println(compMove);
			
			
			
			
			if(playerInput.equals("Exit"))
			{
				
				System.out.println("Thanks for playing");
				gameState=false;
				System.out.println("Total games played:"+totalGames);
				System.out.println("Computer wins:"+compWins);
				System.out.println("Player wins:"+playerWins);
				System.out.println("Total Ties:"+ties);
				int max = getMax(rockCount, paperCount, scissorCount);
				if(max == rockCount) System.out.println("Most common: Rock - "+max);
				if(max == paperCount) System.out.println("Most common: Paper - "+max);
				if(max == scissorCount) System.out.println("Most common: Scissors - "+max);
				
			    break;
			}
			
			if(playerInput.equals(compMove))
			{
				System.out.println("Tie");
				ties++;
				totalGames++;
				if(playerInput.equals("Rock")) {
					rockCount ++;
				}
				if (playerInput.equals("Scissors")) {
					scissorCount++;
				}
				if(playerInput.equals("Paper")) {
					paperCount++;
				}
			}
			
	
			if(playerInput.equals("Rock")  && compMove.equals("Paper"))
			{
				System.out.println("Computer Wins!");
				compWins++;
				totalGames++;
			}
			
			if(playerInput.equals("Scissors")  && compMove.equals("Paper"))
			{
				System.out.println("Player Wins");
				playerWins++;
				totalGames++;
			}
			
			if(playerInput.equals("Paper")  && compMove.equals("Rock"))
			{
				System.out.println("Player Wins");
				playerWins++;
				totalGames++;
			}
			
			
			if(playerInput.equals("Scissors")  && compMove.equals("Rock"))
			{
				System.out.println("Computer Wins!");
				compWins++;
				totalGames++;
			}
			
			
			if(playerInput.equals("Paper")  && compMove.equals("Scissors"))
			{
				System.out.println("Computer Wins!");
				compWins++;
				totalGames++;
			}
			
			
			if(playerInput.equals("Rock")  && compMove.equals("Scissors"))
			{
				System.out.println("Player Wins");
				playerWins++;
				totalGames++;
			}
			
			else {
				System.out.println("Please choose Rock, Paper or Scissors");
				
			}
		}
		
		}
	public int getMax(int a, int b, int c) {
		int max1 = Math.max(a, b);
		int max = Math.max(max1, c);
		return max;
	}


}

