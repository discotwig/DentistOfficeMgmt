package office_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {
	
	ArrayList<DataStructure> dataArrayList = new ArrayList<DataStructure>();
	Scanner input = new Scanner(System.in);	
	
	public void singleRecordDisplay(int in) {
		DataStructure record = dataArrayList.get(in);
		System.out.println(record);
	}
	
	public void singleFeeDisplay(int in) {
		DataStructure fee = dataArrayList.get(in);
		System.out.println(fee);
	}
	
	public String stringListDisplay() {
		System.out.println(dataArrayList);
		return null;
	}
	
	public void feeListDisplay() {
		
	}
	
	public void addStringRecord(String string1, String string2, String string3, String string4, String string5) {
		dataArrayList.add(new DataStructure(string1, string2, string3, string4, string5));
	}
	
	public void removeRecord(int in) {
		dataArrayList.remove(in);
	}
	
	public void modifyStringRecord() {
		
	}
	
	public void modifyFeeRecord() {
		
	}
	
}
