package dentist;

public class Assistant extends Person {

	String assignedDoctor;
	
	
	public Assistant(String firstName, String lastName, String address, String phoneNumber,  String Doctor) {
		super(firstName, lastName, address, phoneNumber);
		this.assignedDoctor = Doctor; 
	}

    // set socialSecurityNum
    public void setDoctor(String newDoctor) 
    { 
        this.assignedDoctor = newDoctor;
    } 
    
    // get socialSecurityNum
    public String getDoctor() 
    {
    	return assignedDoctor;
    }


}
