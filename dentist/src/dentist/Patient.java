package dentist;

public class Patient extends Person {

	String socialSecurityNum;
	
	
	public Patient(String firstName, String lastName, String address, String phoneNumber,  String social) {
		super(firstName, lastName, address, phoneNumber);
		this.socialSecurityNum = social; 
	}

    // set specialization
    public void setSocial(String newSocial) 
    { 
        this.socialSecurityNum = newSocial;
    } 
    
    // get specialization
    public String getSocial() 
    {
    	return socialSecurityNum;
    }

}
