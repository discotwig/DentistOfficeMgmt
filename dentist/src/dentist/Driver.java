package dentist;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{		
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Welcome to your Office Management System \n Please select aone of these options:");
		
	    int dec1 = input.nextInt();  // Read user input
	    
	    options(dec1);
		
		

	}
	
	
	public static void options(int input) 
	{
		switch(input) {
		case 0:
			
			break;
		}
	}

}
