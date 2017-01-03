package deloitte.fin.gl.coa.bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class COAStringUtilityBean {
    public COAStringUtilityBean() {
        super();
    } 
    
    
    public BindingContainer getBindings()
    {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String saveChanges(ActionEvent ae) {
        try{
        BindingContainer bindings = getBindings();
       System.out.println("Save Changes ");
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
             Object result = operationBinding.execute();
       
        FacesMessage message = new FacesMessage("Changes saved Successfully");
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, message); }
        catch(Exception e)
        { e.printStackTrace();
            }
            return null;
            
    }
    
} //class
