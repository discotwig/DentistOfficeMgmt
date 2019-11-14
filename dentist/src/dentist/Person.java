package dentist;

public class Person {
	
	// Instance Variables 
	String firstName;
	String lastName;
	String address;
	String phoneNumber;

    // Constructor Declaration of Class 
    public Person(String firstName, String lastName, String address, String phoneNumber) 
    { 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.address = address; 
        this.phoneNumber = phoneNumber; 
    } 
    
    
    // set first name 
    public void setFName(String newFname) 
    { 
        this.firstName = newFname;
    } 
    
    // set last name 
    public void setLName(String newLname) 
    { 
        this.lastName = newLname;
    } 
    
    // set address
    public void setAdd(String newAddress) 
    { 
        this.address = newAddress;
    } 
    
    // set phone number
    public void setPhone(String newPhone) 
    { 
        this.phoneNumber = newPhone;
    } 
    
    // get first name 
    public String getFName() 
    {
    	return firstName;
    }
    
    // get last name     
    public String getLName() 
    {
    	return lastName;
    }
    
    // get address
    public String getAdd() 
    {
    	return address;
    }
    
    // get phone number
    public String getPhone() 
    {
    	return phoneNumber;
    }
}
