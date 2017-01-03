package deloitte.fin.gl.coa.bean;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class COAStringValuesBean {
    public COAStringValuesBean() {
        super();
    }

    private RichInputText SourceSystemItm;
    private RichInputText SourceValueItm;
    private RichInputText TargetSystemItm;
    private RichInputText TargetValueItm;


    private String SourceSystem;
    private String SourceValue;
    private String TargetSystem;
    private String TargetValue;


    public void setSourceSystemItm(RichInputText SourceSystemItm) {
        this.SourceSystemItm = SourceSystemItm;
    }

    public RichInputText getSourceSystemItm() {
        return SourceSystemItm;
    }

    public void setSourceValueItm(RichInputText SourceValueItm) {
        this.SourceValueItm = SourceValueItm;
    }

    public RichInputText getSourceValueItm() {
        return SourceValueItm;
    }

    public void setTargetSystemItm(RichInputText TargetSystemItm) {
        this.TargetSystemItm = TargetSystemItm;
    }

    public RichInputText getTargetSystemItm() {
        return TargetSystemItm;
    }

    public void setTargetValueItm(RichInputText TargetValueItm) {
        this.TargetValueItm = TargetValueItm;
    }

    public RichInputText getTargetValueItm() {
        return TargetValueItm;
    }

    public void setSourceSystem(String SourceSystem) {
        this.SourceSystem = SourceSystem;
    }

    public String getSourceSystem() {
        return SourceSystem;
    }

    public void setSourceValue(String SourceValue) {
        this.SourceValue = SourceValue;
    }

    public String getSourceValue() {
        return SourceValue;
    }

    public void setTargetSystem(String TargetSystem) {
        this.TargetSystem = TargetSystem;
    }

    public String getTargetSystem() {
        return TargetSystem;
    }

    public void setTargetValue(String TargetValue) {
        this.TargetValue = TargetValue;
    }

    public String getTargetValue() {
        return TargetValue;
    }
}
