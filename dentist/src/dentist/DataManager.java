import java.util.Scanner;
package dentist;

public class DataManager {
	Scanner DataManager = new Scanner(System.in); 
	public DataManager() {
		// TODO Auto-generated constructor stub
		    ArrayList<String> DataManager = new ArrayList<String>();
		    DataManager.singleRecordDisplay();
		    DataManager.recordListDisplay();
		    DataManager.add();
		    DataManager.remove();
		    DataManager.modify();
		    DataManager.serviceSelector();
		    DataManager.recordListInitiator();
		    

	}
	}

}
