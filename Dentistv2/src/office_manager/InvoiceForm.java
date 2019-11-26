package office_manager;

import java.util.ArrayList;

public class InvoiceForm {
	
	String invoiceHeader;
	ArrayList<DataStructure> invoiceBodyArrayList;
	
		/*	getters	*/ 
    public void setInvoiceHeader(String invoiceHeader) 
    { 
        this.invoiceHeader = invoiceHeader;
    } 
    
    	/*	getters	*/   
    public String getInvoiceHeader() 
    {
    	return invoiceHeader;
    }

    
}
