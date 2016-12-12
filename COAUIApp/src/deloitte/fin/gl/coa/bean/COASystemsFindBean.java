package deloitte.fin.gl.coa.bean;

import com.oracle.ptsdemo.utils.JSFUtils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class COASystemsFindBean {
    private RichInputText findSystem;
    private String findSystemString;

    public COASystemsFindBean() {
    }

    public void setFindSystem(RichInputText findSystem) {
        this.findSystem = findSystem;
    }

    public RichInputText getFindSystem() {
        return findSystem;
    }

    public void setFindSystemString(String findSystemString) {
        this.findSystemString = findSystemString;
    }

    public String getFindSystemString() {
        return findSystemString;
    }


}
