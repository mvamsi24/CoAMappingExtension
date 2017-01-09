package deloitte.fin.gl.coa.view;

import deloitte.fin.gl.coa.entity.CoaStringValuesEOImpl;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 12 16:45:27 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CoaStringValuesVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Attribute1 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute1();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute10 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute10();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute10((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute2();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Attribute3 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute3();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute3((String)value);
            }
        }
        ,
        Attribute4 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute4();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute4((String)value);
            }
        }
        ,
        Attribute5 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute5();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute5((String)value);
            }
        }
        ,
        Attribute6 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute6();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute6((String)value);
            }
        }
        ,
        Attribute7 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute7();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute7((String)value);
            }
        }
        ,
        Attribute8 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute8();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute8((String)value);
            }
        }
        ,
        Attribute9 {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getAttribute9();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setAttribute9((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        EnabledFlag {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getEnabledFlag();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setEnabledFlag((String)value);
            }
        }
        ,
        EndDate {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getEndDate();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedLogin {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getLastUpdatedLogin();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setLastUpdatedLogin((BigDecimal)value);
            }
        }
        ,
        SourceSystem {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getSourceSystem();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setSourceSystem((String)value);
            }
        }
        ,
        SourceValue {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getSourceValue();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setSourceValue((String)value);
            }
        }
        ,
        StartDate {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getStartDate();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        }
        ,
        StringValueId {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getStringValueId();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setStringValueId((BigDecimal)value);
            }
        }
        ,
        TargetSystem {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getTargetSystem();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setTargetSystem((String)value);
            }
        }
        ,
        TargetValue {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getTargetValue();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setTargetValue((String)value);
            }
        }
        ,
        EnabledFlagBoolean {
            public Object get(CoaStringValuesVORowImpl obj) {
                return obj.getEnabledFlagBoolean();
            }

            public void put(CoaStringValuesVORowImpl obj, Object value) {
                obj.setEnabledFlagBoolean((Boolean)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CoaStringValuesVORowImpl object);

        public abstract void put(CoaStringValuesVORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE10 = AttributesEnum.Attribute10.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int ATTRIBUTE3 = AttributesEnum.Attribute3.index();
    public static final int ATTRIBUTE4 = AttributesEnum.Attribute4.index();
    public static final int ATTRIBUTE5 = AttributesEnum.Attribute5.index();
    public static final int ATTRIBUTE6 = AttributesEnum.Attribute6.index();
    public static final int ATTRIBUTE7 = AttributesEnum.Attribute7.index();
    public static final int ATTRIBUTE8 = AttributesEnum.Attribute8.index();
    public static final int ATTRIBUTE9 = AttributesEnum.Attribute9.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int ENABLEDFLAG = AttributesEnum.EnabledFlag.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDLOGIN = AttributesEnum.LastUpdatedLogin.index();
    public static final int SOURCESYSTEM = AttributesEnum.SourceSystem.index();
    public static final int SOURCEVALUE = AttributesEnum.SourceValue.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int STRINGVALUEID = AttributesEnum.StringValueId.index();
    public static final int TARGETSYSTEM = AttributesEnum.TargetSystem.index();
    public static final int TARGETVALUE = AttributesEnum.TargetValue.index();
    public static final int ENABLEDFLAGBOOLEAN = AttributesEnum.EnabledFlagBoolean.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CoaStringValuesVORowImpl() {
    }

    /**
     * Gets CoaStringValuesEO entity object.
     * @return the CoaStringValuesEO
     */
    public CoaStringValuesEOImpl getCoaStringValuesEO() {
        return (CoaStringValuesEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @return the ATTRIBUTE1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @param value value to set the ATTRIBUTE1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @return the ATTRIBUTE10
     */
    public String getAttribute10() {
        return (String) getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @param value value to set the ATTRIBUTE10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @return the ATTRIBUTE2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @param value value to set the ATTRIBUTE2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @return the ATTRIBUTE3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @param value value to set the ATTRIBUTE3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @return the ATTRIBUTE4
     */
    public String getAttribute4() {
        return (String) getAttributeInternal(ATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @param value value to set the ATTRIBUTE4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @return the ATTRIBUTE5
     */
    public String getAttribute5() {
        return (String) getAttributeInternal(ATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @param value value to set the ATTRIBUTE5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @return the ATTRIBUTE6
     */
    public String getAttribute6() {
        return (String) getAttributeInternal(ATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @param value value to set the ATTRIBUTE6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @return the ATTRIBUTE7
     */
    public String getAttribute7() {
        return (String) getAttributeInternal(ATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @param value value to set the ATTRIBUTE7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @return the ATTRIBUTE8
     */
    public String getAttribute8() {
        return (String) getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @param value value to set the ATTRIBUTE8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @return the ATTRIBUTE9
     */
    public String getAttribute9() {
        return (String) getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @param value value to set the ATTRIBUTE9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for ENABLED_FLAG using the alias name EnabledFlag.
     * @return the ENABLED_FLAG
     */
    public String getEnabledFlag() {
        return (String) getAttributeInternal(ENABLEDFLAG);
        
    }

    /**
     * Sets <code>value</code> as attribute value for ENABLED_FLAG using the alias name EnabledFlag.
     * @param value value to set the ENABLED_FLAG
     */
    public void setEnabledFlag(String value) {
        setAttributeInternal(ENABLEDFLAG, value);
    }

    /**
     * Gets the attribute value for END_DATE using the alias name EndDate.
     * @return the END_DATE
     */
    public Date getEndDate() {
        return (Date) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate.
     * @param value value to set the END_DATE
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_LOGIN using the alias name LastUpdatedLogin.
     * @return the LAST_UPDATED_LOGIN
     */
    public BigDecimal getLastUpdatedLogin() {
        return (BigDecimal) getAttributeInternal(LASTUPDATEDLOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_LOGIN using the alias name LastUpdatedLogin.
     * @param value value to set the LAST_UPDATED_LOGIN
     */
    public void setLastUpdatedLogin(BigDecimal value) {
        setAttributeInternal(LASTUPDATEDLOGIN, value);
    }

    /**
     * Gets the attribute value for SOURCE_SYSTEM using the alias name SourceSystem.
     * @return the SOURCE_SYSTEM
     */
    public String getSourceSystem() {
        return (String) getAttributeInternal(SOURCESYSTEM);
    }

    /**
     * Sets <code>value</code> as attribute value for SOURCE_SYSTEM using the alias name SourceSystem.
     * @param value value to set the SOURCE_SYSTEM
     */
    public void setSourceSystem(String value) {
        setAttributeInternal(SOURCESYSTEM, value);
    }

    /**
     * Gets the attribute value for SOURCE_VALUE using the alias name SourceValue.
     * @return the SOURCE_VALUE
     */
    public String getSourceValue() {
        return (String) getAttributeInternal(SOURCEVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for SOURCE_VALUE using the alias name SourceValue.
     * @param value value to set the SOURCE_VALUE
     */
    public void setSourceValue(String value) {
        setAttributeInternal(SOURCEVALUE, value);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate.
     * @return the START_DATE
     */
    public Date getStartDate() {
        return (Date) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
     * @param value value to set the START_DATE
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for STRING_VALUE_ID using the alias name StringValueId.
     * @return the STRING_VALUE_ID
     */
    public BigDecimal getStringValueId() {
        return (BigDecimal) getAttributeInternal(STRINGVALUEID);
    }

    /**
     * Sets <code>value</code> as attribute value for STRING_VALUE_ID using the alias name StringValueId.
     * @param value value to set the STRING_VALUE_ID
     */
    public void setStringValueId(BigDecimal value) {
        setAttributeInternal(STRINGVALUEID, value);
    }

    /**
     * Gets the attribute value for TARGET_SYSTEM using the alias name TargetSystem.
     * @return the TARGET_SYSTEM
     */
    public String getTargetSystem() {
        return (String) getAttributeInternal(TARGETSYSTEM);
    }

    /**
     * Sets <code>value</code> as attribute value for TARGET_SYSTEM using the alias name TargetSystem.
     * @param value value to set the TARGET_SYSTEM
     */
    public void setTargetSystem(String value) {
        setAttributeInternal(TARGETSYSTEM, value);
    }

    /**
     * Gets the attribute value for TARGET_VALUE using the alias name TargetValue.
     * @return the TARGET_VALUE
     */
    public String getTargetValue() {
        return (String) getAttributeInternal(TARGETVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for TARGET_VALUE using the alias name TargetValue.
     * @param value value to set the TARGET_VALUE
     */
    public void setTargetValue(String value) {
        setAttributeInternal(TARGETVALUE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EnabledFlagBoolean.
     * @return the EnabledFlagBoolean
     */
    public Boolean getEnabledFlagBoolean() {
        //return (Boolean) getAttributeInternal(ENABLEFLAGBOOLEAN);
        System.out.println("Enabled Flag Value: "+ this.getEnabledFlag());
        if (this.getEnabledFlag() != null && 
            this.getEnabledFlag().equalsIgnoreCase("Y")){
            return true;
        }
        return false;
        
        
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EnabledFlagBoolean.
     * @param value value to set the  EnabledFlagBoolean
     */
    public void setEnabledFlagBoolean(Boolean value) {
        if (value){
            this.setEnabledFlag("Y");
        }
        else{
            this.setEnabledFlag("N");
        }
        setAttributeInternal(ENABLEDFLAGBOOLEAN, value);
        }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
    
    
    
  
    
}