import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	
	public static void main(String[] args) throws IOException  {
		int riddleNumber = -1; 
		System.out.println("Welcome to Playable Reading V 1.0 \n"
		+"Riddles: \n"
		+"Riddle NO.1 \n");
		boolean shopBoolean  = true;
	int coins = 0;
		do {
			
			System.out.println("Please enter the NO. of the riddle you want to solve \n");//Start menu
			System.out.println("Or type 100 for shop.\n ");
		    riddleNumber = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
		    if(riddleNumber==1) {
			    System.out.println("A rich man was killed at 6 p.m. The maid said she did the washing. \n"
			    		         + "The chef said he made breakfast. The gardener said he had planted flowers.\n"
			    		         + "Who's the killer? \n" + 
			                       "1) The maid. 2) The chef 3) The gardener");
			    int awnser = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
			    if (awnser == 2 ) { System.out.println(" Correct, because why would you make breakfast at 6 p.m.?");
			    coins = coins + 10;}
			    else {System.out.println("Incorrect try again.");}}
		    
		    else {
		    	System.out.println("This riddle is not yet available.");
		    }
		    if (riddleNumber == 100 ) {
		    shopBoolean = true;
		    }
		    
		    if ( shopBoolean == true) {
		    	System.out.println("Welcome to the shop what would you want to buy? \n"
		    			+ " Riddle NO.2 for free\n"
		    			+ " Riddle NO.3 for 10 coins \n"
		    			+ " Riddle No.4 for 20 coins");
		    	
		    }
		   
		} while (riddleNumber != 0);
    }
}
