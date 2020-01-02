import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	
	public static void main(String[] args) throws IOException  {
		int riddleNumber = -1; 
		System.out.println("Welcome to Playable Reading V 1.1 \n"
		+"Riddles: \n"
		+"Riddle NO.1 \n");
		
	
		do {
			
			System.out.println("Please enter the NO. of the riddle you want to solve \n");//Start menu
			System.out.println("Or type 100 for shop. ");
		    riddleNumber = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
		    if(riddleNumber==1) {
			    System.out.println("A rich man was killed at 6 p.m. The maid said she did the washing. \n"
			    		         + "The chef said he made breakfast. The gardener said he had planted flowers.\n"
			    		         + "Who's the killer? \n" + 
			                       "1) The servant. 2) The chef 3) The gardener");
			    int awnser = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
			    if (awnser == 2 ) { System.out.println(" Correct, because why would you make breakfast at 6 p.m.?");}
			    else {System.out.println("Incorrect try again.");}}
		    
		    else {
		    	System.out.println("This riddle is not yet available.");
		    }
		    if (riddleNumber == 100 ) {
		    	boolean shopBoolean = true;
		    }
		    else {boolean shopBoolean = false;}
		    
		    if ( shopBoolean == true);
		   
		} while (riddleNumber != 0);
    }
}
