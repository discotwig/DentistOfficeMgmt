package dentist;

public class Patient extends Person {

	String socialSecurityNum;
	
	
	public Patient(String firstName, String lastName, String address, String phoneNumber,  String social) {
		super(firstName, lastName, address, phoneNumber);
		this.socialSecurityNum = social; 
	}

    // set socialSecurityNum
    public void setSocial(String newSocial) 
    { 
        this.socialSecurityNum = newSocial;
    } 
    
    // get socialSecurityNum
    public String getSocial() 
    {
    	return socialSecurityNum;
    }

}
