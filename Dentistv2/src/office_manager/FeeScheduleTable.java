package office_manager;

import java.util.Scanner;

public class FeeScheduleTable {
	
	DataManager feeDataManager = new DataManager();
	ScreenPromptProvider feeScreenPrompts = new ScreenPromptProvider();
	Scanner input = new Scanner(System.in);	
	String specialField = "Phone";
	String sectionName = "Fee";
	
	/* Creates the record list */
	public void recordListInitiator() {
		feeDataManager.addStringRecord("James", "Dean", "123 Walrus Street", "888-459-7489", "Britches");
		feeDataManager.addStringRecord("Kimmy", "Tomato", "423 Beaver Drive", "828-445-4621", "Britches");
		feeDataManager.addStringRecord("Tony", "Lemon", "481 Soup Road", "888-434-8754", "Mason");
		feeDataManager.addStringRecord("Baron", "Danson", "638 Jimmy Jones Blvd", "754-571-7423", "Mason");
		feeDataManager.addStringRecord("Romeo", "Martinez", "123 Walrus Street", "548-325-3654", "Britches");
	}
	
	/* Displays the record list */
	public void recordListDisplay() {
		feeScreenPrompts.listGenerator(sectionName, specialField, feeDataManager);
		
		System.out.println("1- To add a new record to above list");
		System.out.println("2- To update an existing record to above list");
		System.out.println("3- To remove an existing record to above list");
		System.out.println("4- To go back to the main menu");
		System.out.println("What would you like to do? Please enter one of the above options:");
		
		int in = serviceSelector();
		
		switch (in) {
			case 1: 
				addRecord();
				break;
			case 2: 
				removeRecord();
				break;
			case 3: 
				modifyRecord();
				break;
			case 4: 
				break;
			default:
				System.out.println("invalid input");
		};
	}
	
	/* Adds new record to list */
	public void addRecord() {
		feeScreenPrompts.addRecordPrompt(sectionName, specialField, feeDataManager);
	}
	
	/* Removes record from list */
	public void removeRecord() {
		feeScreenPrompts.removeRecordPrompt(sectionName, feeDataManager);
	}
	
	/* Modifies record in list */
	public void modifyRecord() {
		feeScreenPrompts.modifyRecordPrompt(sectionName, specialField, feeDataManager);
	}

	/* What would you like to do? */
	public int serviceSelector() {
		return feeScreenPrompts.serviceSelectorPrompt();
	}
}
