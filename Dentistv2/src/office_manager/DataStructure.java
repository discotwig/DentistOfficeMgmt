package office_manager;

/*	DataManager creates multiple instances of this class, DataStructure
 *	and puts them in a list
 *	to be printed and manipulated
 *
 *
 *	A Table creates 1 instance of DataManager
 *	and uses DataManager's methods to create lists within DataManager
 *	A Table also associates ScreenPromptProvider with distinct tables
 */

public class DataStructure {
	String string1;
	String string2;
	String string3;
	String string4;
	String string5;
	double double1;
	
		/*	overloaded constructors for doctors, patents, and assistants	*/
	public DataStructure(String string1, String string2, String string3, String string4, String string5) {
        this.string1 = string1; 
        this.string2 = string2; 
        this.string3 = string3; 
        this.string4 = string4; 
        this.string4 = string4; 
        this.string5 = string5; 
	}
	
		/*	overloaded constructors for fees	*/
	public DataStructure(String string1, double double1) {
        this.string1 = string1; 
        this.double1 = double1; 
	}
	
		/*	setters */
    public void setS1(String string1) 
    { 
        this.string1 = string1;
    } 
    
    public void setS2(String string2) 
    { 
        this.string2 = string2;
    } 
    
    public void setS3(String string3) 
    { 
        this.string3 = string3;
    } 
    
    public void setS4(String string4) 
    { 
        this.string4 = string4;
    } 
    
    public void setS5(String string5) 
    { 
        this.string5 = string5;
    } 
    
    public void setD1(double double1) 
    { 
        this.double1 = double1;
    } 
    
    	/*	getters	*/   
    public String getS1() 
    {
    	return string1;
    }
    
    public String getS2() 
    {
    	return string2;
    }
    
    public String getS3() 
    {
    	return string3;
    }
    
    public String getS4() 
    {
    	return string4;
    }
    
    public String getS5() 
    {
    	return string5;
    }
    
    public double getD1() 
    {
    	return double1;
    }
    
}
