package deloitte.fin.gl.coa.bean;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class COADeleteListnerBean {
    

    public COADeleteListnerBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String cb2_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void commitData(ActionEvent actionEvent) {
        // Add event code here...
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        operationBinding.execute();
        //refreshPage();
        System.out.println("Cnfirmation Dialog Message " +
                           operationBinding + "\n");
    }

    public void rollbackData(ActionEvent actionEvent) {
        // Add event code here...
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        System.out.println("Roll Back from Confirmation Dialog Event");
    }
    

}
