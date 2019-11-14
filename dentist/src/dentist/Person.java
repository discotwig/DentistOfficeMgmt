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
    
    
    // method 1 
    public void setFName(String newFname) 
    { 
        this.firstName = newFname;
    } 
}
