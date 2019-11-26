package office_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientTable {
	
	DataManager patientDataManager = new DataManager();
	ScreenPromptProvider patientScreenPrompts = new ScreenPromptProvider();
	Scanner input = new Scanner(System.in);	
	String specialField = "Phone";
	String sectionName = "Patient";
	
	/* Creates the record list */
	public void recordListInitiator() {
		patientDataManager.addStringRecord("James", "Dean", "123 Walrus Street", "888-459-7489", "Britches");
	}
	
	/* Displays the record list */
	public void recordListDisplay() {
		patientScreenPrompts.listGenerator(sectionName, specialField, patientDataManager);
	}
	
	/* Adds new record to list */
	public void addRecord() {
		patientScreenPrompts.addRecordPrompt(sectionName, specialField, patientDataManager);
	}
	
	/* Removes record from list */
	public void removeRecord() {
		patientScreenPrompts.removeRecordPrompt(sectionName, patientDataManager);
	}
	
	/* Modifies record in list */
	public void modifyRecord() {
		patientScreenPrompts.modifyRecordPrompt(sectionName, specialField, patientDataManager);
	}

	/* What would you like to do? */
	public int serviceSelector() {
		return patientScreenPrompts.serviceSelectorPrompt();
	}
	
	/* Returns list of patients */
	public ArrayList<DataStructure> getCurrentPatientList () {
		return null;
		
	}
}
