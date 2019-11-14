package dentist;

public class FeeSchedule {

	// Instance Variables 
	String feeDescription;
	double feeAmount;
	
	
	public FeeSchedule(String desc, double amount) {
        this.feeDescription = desc; 
        this.feeAmount = amount; 
	}

    // set feeDescription
    public void setDoctor(String newDoctor) 
    { 
        this.feeDescription = newDoctor;
    } 
    
    // get feeDescription
    public String getDoctor() 
    {
    	return feeDescription;
    }
    
    // set feeAmount
    public void setAmount(double newAmount) 
    { 
        this.feeAmount = newAmount;
    } 
    
    // get feeAmount
    public double getAmount() 
    {
    	return feeAmount;
    }
}
