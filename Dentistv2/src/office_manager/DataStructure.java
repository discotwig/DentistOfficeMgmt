package office_manager;

public class DataStructure {
	String string1;
	String string2;
	String string3;
	String string4;
	String string5;
	double double1;
	
		/*	overloaded constructors */
	public DataStructure(String string1, String string2, String string3, String string4, String string5) {
        this.string1 = string1; 
        this.string2 = string2; 
        this.string3 = string3; 
        this.string4 = string4; 
        this.string4 = string4; 
        this.string5 = string5; 
	}
	
	public DataStructure(String string1, double double1) {
        this.string1 = string1; 
        this.double1 = double1; 
	}
	
		/*	setters */
    public void setString1(String string1) 
    { 
        this.string1 = string1;
    } 
    
    public void setString2(String string2) 
    { 
        this.string2 = string2;
    } 
    
    public void setString3(String string3) 
    { 
        this.string3 = string3;
    } 
    
    public void setString4(String string4) 
    { 
        this.string4 = string4;
    } 
    
    public void setString5(String string5) 
    { 
        this.string5 = string5;
    } 
    
    public void setDouble1(double double1) 
    { 
        this.double1 = double1;
    } 
    
    	/*	getters	*/   
    public String getString1() 
    {
    	return string1;
    }
    
    public String getString2() 
    {
    	return string2;
    }
    
    public String getString3() 
    {
    	return string3;
    }
    
    public String getString4() 
    {
    	return string4;
    }
    
    public String getString5() 
    {
    	return string5;
    }
    
    public double getDouble1() 
    {
    	return double1;
    }

}
