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
		int ans = input.nextInt();
		return ans;
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
		};
	}

}
