package dentist;

public class Doctor extends Person {

	String specialization;
	
	public Doctor(String firstName, String lastName, String address, String phoneNumber, String special) {
		super(firstName, lastName, address, phoneNumber);
		this.specialization = special; 
	}
	
    // set specialization
    public void setSpecial(String newSpecial) 
    { 
        this.specialization = newSpecial;
    } 
    
    // get specialization
    public String getSpecial() 
    {
    	return specialization;
    }

}
