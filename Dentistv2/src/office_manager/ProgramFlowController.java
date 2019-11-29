/**
 * 
 */
package office_manager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Does everything in here
 * Just to keep main() clean
 */

public class ProgramFlowController {
	
	FeeScheduleTable feeScheduleManager;
	PatientTable patientManager;
	DoctorTable doctorManager;
	AssistantTable assistantManager;
	InvoiceForm invoice;
	ArrayList<DataStructure> invoiceArrayList;
	Scanner input = new Scanner(System.in);	
	
	
	public void DemoCreater() {
		patientManager.recordListInitiator();
		doctorManager.recordListInitiator();
		assistantManager.recordListInitiator();
		
	}
	
	public void mainPromptDisplay() {
		System.out.println("");
		System.out.println("**********************************************************************************");
		System.out.println("**************		Welcome to the Office Management System			**************");
		System.out.println("**********************************************************************************");
		System.out.println("1- To see the patients' list");
		System.out.println("2- To see the doctors' list");
		System.out.println("3- To see the assistants' list");
		System.out.println("4- To see the fee schedule");
		System.out.println("5- To add/delete/modify a patient");
		System.out.println("6- To add/delete/modify a doctor");
		System.out.println("7- To add/delete/modify a assistant");
		System.out.println("8- To add/delete/modify a fee item");
		System.out.println("9- To issue an invoice for a patient");
		System.out.println("999- To exit the program");
		System.out.println("**********************************************************************************");
		System.out.println("Please choose one of the options above:");
	}
	
	public int userIntegerReciever() {
		
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
	}
	
	public void mainPromptHandler() {
		mainPromptDisplay();
		int in = userIntegerReciever();
		switch (in) {
			case 1: 
				patientManager.recordListDisplay();
				break;
			case 2: 
				doctorManager.recordListDisplay();
				break;
			case 3: 
				assistantManager.recordListDisplay();
				break;
			case 4: 
				feeScheduleManager.recordListDisplay(); ;
				break;
			case 5: 
				patientManager.addRecord() ;
				break;
			case 6: 
				doctorManager.recordListDisplay();
				break;
			case 7: 
				assistantManager.recordListDisplay();
				break;
			case 8: 
				feeScheduleManager.recordListDisplay(); ;
				break;
			case 9: 
				assistantManager.recordListDisplay();
				break;
			case 999: 
				feeScheduleManager.recordListDisplay(); ;
				break;
			default:
				System.out.println("invalid input");
		}
	}

}
