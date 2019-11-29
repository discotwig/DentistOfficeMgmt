package office_manager;

import java.util.Scanner;

public class ScreenPromptProvider {
	
	
	Scanner input = new Scanner(System.in);
	
	public void listGenerator (String sectionName, String specialField, DataManager sectionDataManager) {
		
		System.out.println("");
		System.out.printf("**********************         The %s List           ************************** \n", sectionName);
		System.out.println("**********************************************************************************");
		System.out.printf("ID \t FName \t LName \t Address \t\t Phone \t\t %s \n", specialField);
		System.out.println("**********************************************************************************");
		
		sectionDataManager.stringListDisplay();
	}
	
	
	//to add records to current list/tables 
	public void addRecordPrompt(String sectionName, String specialField, DataManager sectionDataManager) {
		
		
		boolean endOfLoop = false; // end-of-loop condition variable 
		
		do
		{
		System.out.printf("Please enter the new %s First Name: \n", sectionName);
		String fName=input.nextLine();
		System.out.printf("Please enter the new %s Last Name: \n", sectionName);
		String lName=input.nextLine();
		System.out.printf("Please enter the new %s Street Address: \n", sectionName);
		String address=input.nextLine();
		System.out.printf("Please enter the new %s Phone Number (555-55-5555): \n", sectionName);
		String phone=input.nextLine();
		System.out.printf("Please enter the new %s %s: \n", sectionName, specialField);
		String spcf=input.nextLine();
		
		sectionDataManager.addStringRecord(fName, lName, address, phone, spcf); // creating record object within arraylist
		
		//confirming the addition of new record
		System.out.println(" ");
		System.out.printf("The following %s has successfully been added to the list %s \t %s \n", sectionName, fName, lName);
		
		// asks if the user wants to add one more records (this can be a separate method)
		System.out.printf("Do you want to add more %s to the list? (Yes or No) \n", sectionName);
		String userInput = input.nextLine().toLowerCase();
		
		if (userInput.equals("y") || userInput.equals("ye") || userInput.equals("yes"))
			endOfLoop = true;
		else
			endOfLoop = false;
		}//end do
		while(endOfLoop);
	}
	
	// to remove a record from list/table
	public void removeRecordPrompt(String sectionName, DataManager sectionDataManager){
		
		boolean endOfLoop = false; // end-of-loop condition variable 
		
		do
		{
		System.out.printf("Please enter the %s number (P#) that you want to remove:", sectionName);
		int pNumber=input.nextInt();
		
		input.nextLine(); //firing a blank to resolve nextLine() skip problem. 
		
		// verifying the removal request is not due to a user error
		System.out.printf("Are you sure you want to delete %s number %d? (Yes or No) \n",sectionName, pNumber);
		String userWarningInput = input.nextLine().toLowerCase();
		
		if (userWarningInput.equals("y") || userWarningInput.equals("ye") || userWarningInput.equals("yes"))
		{
			sectionDataManager.dataArrayList.remove(pNumber-1);
			System.out.printf("The %s number %d has been successfully removed. \n\n", sectionName, pNumber);
		}
		
		
		// asks if the user wants to remove one more item (this can be a separate method)
		System.out.printf("Do you want to remove another %s from the list? (Yes or No) \n", sectionName);
		String userInput = input.nextLine().toLowerCase();
		
		if (userInput.equals("y") || userInput.equals("ye") || userInput.equals("yes"))
			endOfLoop = true;
		else
			endOfLoop = false;
		}//end do
		while(endOfLoop);
		
	}// end removeRecordPrompt
	
	public int serviceSelectorPrompt(){
		
		int selector = 0;		
		//Handling exceptions that may arise due to user input mismatch
				do
				  { 
				      try {
				          String s = input.nextLine();
				          selector = Integer.parseInt(s);
				          break;
				      }
				      catch (Exception e)
				      {
				          System.out.println("Couldn't understand your input, please try again, select one of the above options:");
				      }
				  }
				  while (true);
				
				if (selector < 1 || selector > 4) {
					
					System.out.println(" ");
					System.out.println("Couldn't understand your input, I am sending you back to the main menu, please start over");
				}
				
				return selector;
				
	}// end serviceSelector

	
	//This methods modifies a selected record 
	public void modifyRecordPrompt(String sectionName,  String specialField, DataManager sectionDataManager){
		
		System.out.printf("please enter the %s ID that you want to update: \n", sectionName);
		int recordId=input.nextInt();
		
		input.nextLine();//firing a blank to resolve nextLine() skip problem. 
		
		//confirming the modification request
		System.out.printf("please confirm the following %s is the one you want to update (Yes or No): %d \t %s \t %s \n", 
				sectionName,
				recordId, 
				sectionDataManager.dataArrayList.get(recordId-1).getS1(),
				sectionDataManager.dataArrayList.get(recordId-1).getS2() 
				);
		
		String userWarningInput = input.nextLine().toLowerCase();
		
		if (userWarningInput.equals("y") || userWarningInput.equals("ye") || userWarningInput.equals("yes"))
		{
			//getting user input for values to be updated
			System.out.printf("please enter updated %s first name: \n", sectionName);
			String newFName = input.nextLine();
			System.out.printf("please enter updated %s last name: \n", sectionName);
			String newLName = input.nextLine();
			System.out.printf("please enter updated %s address: \n", sectionName);
			String newAdd = input.nextLine();
			System.out.printf("please enter updated %s phone number: \n", sectionName);
			String newPNumber = input.nextLine();
			System.out.printf("please enter updated %s %s: \n", sectionName, specialField);
			String newAss = input.nextLine();
			
			//setting the updated values into record
			sectionDataManager.dataArrayList.get(recordId-1).setS1(newFName);
			sectionDataManager.dataArrayList.get(recordId-1).setS2(newLName);
			sectionDataManager.dataArrayList.get(recordId-1).setS3(newAdd);
			sectionDataManager.dataArrayList.get(recordId-1).setS4(newPNumber);
			sectionDataManager.dataArrayList.get(recordId-1).setS5(newAss);
			
			
			System.out.printf("The %s information has been successfully updated, thank you. \n", sectionName);
		}
		else
		{
			System.out.printf("No changes have been made to the %s list \n", sectionName);
		}
		
	}// end modifyrecord

}
