package office_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {
	
	ArrayList<DataStructure> dataArrayList = new ArrayList<DataStructure>();
	Scanner input = new Scanner(System.in);	
	
	public void singleRecordDisplay() {
		
		
		System.out.println(dataArrayList[0].getString1());
		
	}
	
	public void singleFeeDisplay() {
		
	}
	
	public void stringListDisplay() {
		
	}
	
	public void feeListDisplay() {
		
	}
	
	public void addStringRecord(String string1, String string2, String string3, String string4, String string5) {
		dataArrayList.add(new DataStructure(string1, string2, string3, string4, string5));
	}
	
	public void removeRecord() {
		
	}
	
	public void modifyStringRecord() {
		modifyRecordPrompt
	}
	
	public void modifyFeeRecord() {
		
	}
	
}
