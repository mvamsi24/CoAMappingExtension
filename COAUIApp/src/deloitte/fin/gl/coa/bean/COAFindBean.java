package deloitte.fin.gl.coa.bean;

import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;

public class COAFindBean {
    private RichInputText findSourceSystem;
    private RichInputText findTargetSystem;
    private RichInputText findMappingRule;
    private RichInputText findSourceSegment;
    private RichInputText findTargetSegment;
    private RichInputText findSourceSegmentValue;
    private RichInputText findTargetSegmentValue;
    
    private String findSourceSystemString;
    private String findTargetSystemString;
    private String findMappingRuleString;
    private String findSourceSegmentString;
    private String findTargetSegmentString;
    private String findSourceSegmentValueString;
    private String findTargetSegmentValueString;
    private RichInputListOfValues findInputListValue;

    public COAFindBean() {
    }

    public void setFindSourceSystem(RichInputText findSourceSystem) {
        this.findSourceSystem = findSourceSystem;
    }

    public RichInputText getFindSourceSystem() {
        return findSourceSystem;
    }

    public void setFindTargetSystem(RichInputText findTargetSystem) {
        this.findTargetSystem = findTargetSystem;
    }

    public RichInputText getFindTargetSystem() {
        return findTargetSystem;
    }

    public void setFindMappingRule(RichInputText findMappingRule) {
        this.findMappingRule = findMappingRule;
    }

    public RichInputText getFindMappingRule() {
        return findMappingRule;
    }

    public void setFindSourceSegment(RichInputText findSourceSegment) {
        this.findSourceSegment = findSourceSegment;
    }

    public RichInputText getFindSourceSegment() {
        return findSourceSegment;
    }

    public void setFindTargetSegment(RichInputText findTargetSegment) {
        this.findTargetSegment = findTargetSegment;
    }

    public RichInputText getFindTargetSegment() {
        return findTargetSegment;
    }

    public void setFindSourceSegmentValue(RichInputText findSourceSegmentValue) {
        this.findSourceSegmentValue = findSourceSegmentValue;
    }

    public RichInputText getFindSourceSegmentValue() {
        return findSourceSegmentValue;
    }

    public void setFindTargetSegmentValue(RichInputText findTargetSegmentValue) {
        this.findTargetSegmentValue = findTargetSegmentValue;
    }

    public RichInputText getFindTargetSegmentValue() {
        return findTargetSegmentValue;
    }

    public void setFindSourceSystemString(String findSourceSystemString) {
        this.findSourceSystemString = findSourceSystemString;
    }

    public String getFindSourceSystemString() {
        return findSourceSystemString;
    }

    public void setFindTargetSystemString(String findTargetSystemString) {
        this.findTargetSystemString = findTargetSystemString;
    }

    public String getFindTargetSystemString() {
        return findTargetSystemString;
    }

    public void setFindMappingRuleString(String findMappingRuleString) {
        this.findMappingRuleString = findMappingRuleString;
    }

    public String getFindMappingRuleString() {
        return findMappingRuleString;
    }

    public void setFindSourceSegmentString(String findSourceSegmentString) {
        this.findSourceSegmentString = findSourceSegmentString;
    }

    public String getFindSourceSegmentString() {
        return findSourceSegmentString;
    }

    public void setFindTargetSegmentString(String findTargetSegmentString) {
        this.findTargetSegmentString = findTargetSegmentString;
    }

    public String getFindTargetSegmentString() {
        return findTargetSegmentString;
    }

    public void setFindSourceSegmentValueString(String findSourceSegmentValueString) {
        this.findSourceSegmentValueString = findSourceSegmentValueString;
    }

    public String getFindSourceSegmentValueString() {
        return findSourceSegmentValueString;
    }

    public void setFindTargetSegmentValueString(String findTargetSegmentValueString) {
        this.findTargetSegmentValueString = findTargetSegmentValueString;
    }

    public String getFindTargetSegmentValueString() {
        return findTargetSegmentValueString;
    }

    public void setFindInputListValue(RichInputListOfValues findInputListValue) {
        this.findInputListValue = findInputListValue;
    }

    public RichInputListOfValues getFindInputListValue() {
        return findInputListValue;
    }
}
