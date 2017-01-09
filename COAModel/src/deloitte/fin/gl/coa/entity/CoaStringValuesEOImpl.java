package deloitte.fin.gl.coa.entity;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 12 16:44:17 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CoaStringValuesEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        StringValueId {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getStringValueId();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setStringValueId((BigDecimal)value);
            }
        }
        ,
        SourceSystem {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getSourceSystem();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setSourceSystem((String)value);
            }
        }
        ,
        TargetSystem {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getTargetSystem();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setTargetSystem((String)value);
            }
        }
        ,
        SourceValue {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getSourceValue();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setSourceValue((String)value);
            }
        }
        ,
        TargetValue {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getTargetValue();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setTargetValue((String)value);
            }
        }
        ,
        StartDate {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getStartDate();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        }
        ,
        EndDate {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getEndDate();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        EnabledFlag {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getEnabledFlag();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setEnabledFlag((String)value);
            }
        }
        ,
        Attribute1 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute1();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute2();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Attribute3 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute3();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute3((String)value);
            }
        }
        ,
        Attribute4 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute4();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute4((String)value);
            }
        }
        ,
        Attribute5 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute5();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute5((String)value);
            }
        }
        ,
        Attribute6 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute6();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute6((String)value);
            }
        }
        ,
        Attribute7 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute7();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute7((String)value);
            }
        }
        ,
        Attribute8 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute8();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute8((String)value);
            }
        }
        ,
        Attribute9 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute9();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute9((String)value);
            }
        }
        ,
        Attribute10 {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getAttribute10();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setAttribute10((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LastUpdatedLogin {
            public Object get(CoaStringValuesEOImpl obj) {
                return obj.getLastUpdatedLogin();
            }

            public void put(CoaStringValuesEOImpl obj, Object value) {
                obj.setLastUpdatedLogin((BigDecimal)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CoaStringValuesEOImpl object);

        public abstract void put(CoaStringValuesEOImpl object, Object value);

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
    public static final int STRINGVALUEID = AttributesEnum.StringValueId.index();
    public static final int SOURCESYSTEM = AttributesEnum.SourceSystem.index();
    public static final int TARGETSYSTEM = AttributesEnum.TargetSystem.index();
    public static final int SOURCEVALUE = AttributesEnum.SourceValue.index();
    public static final int TARGETVALUE = AttributesEnum.TargetValue.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int ENABLEDFLAG = AttributesEnum.EnabledFlag.index();
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int ATTRIBUTE3 = AttributesEnum.Attribute3.index();
    public static final int ATTRIBUTE4 = AttributesEnum.Attribute4.index();
    public static final int ATTRIBUTE5 = AttributesEnum.Attribute5.index();
    public static final int ATTRIBUTE6 = AttributesEnum.Attribute6.index();
    public static final int ATTRIBUTE7 = AttributesEnum.Attribute7.index();
    public static final int ATTRIBUTE8 = AttributesEnum.Attribute8.index();
    public static final int ATTRIBUTE9 = AttributesEnum.Attribute9.index();
    public static final int ATTRIBUTE10 = AttributesEnum.Attribute10.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDLOGIN = AttributesEnum.LastUpdatedLogin.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CoaStringValuesEOImpl() {
    }

    /**
     * Gets the attribute value for StringValueId, using the alias name StringValueId.
     * @return the StringValueId
     */
    public BigDecimal getStringValueId() {
        return (BigDecimal)getAttributeInternal(STRINGVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StringValueId.
     * @param value value to set the StringValueId
     */
    public void setStringValueId(BigDecimal value) {
        setAttributeInternal(STRINGVALUEID, value);
    }

    /**
     * Gets the attribute value for SourceSystem, using the alias name SourceSystem.
     * @return the SourceSystem
     */
    public String getSourceSystem() {
        return (String)getAttributeInternal(SOURCESYSTEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceSystem.
     * @param value value to set the SourceSystem
     */
    public void setSourceSystem(String value) {
        setAttributeInternal(SOURCESYSTEM, value);
    }

    /**
     * Gets the attribute value for TargetSystem, using the alias name TargetSystem.
     * @return the TargetSystem
     */
    public String getTargetSystem() {
        return (String)getAttributeInternal(TARGETSYSTEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for TargetSystem.
     * @param value value to set the TargetSystem
     */
    public void setTargetSystem(String value) {
        setAttributeInternal(TARGETSYSTEM, value);
    }

    /**
     * Gets the attribute value for SourceValue, using the alias name SourceValue.
     * @return the SourceValue
     */
    public String getSourceValue() {
        return (String)getAttributeInternal(SOURCEVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceValue.
     * @param value value to set the SourceValue
     */
    public void setSourceValue(String value) {
        setAttributeInternal(SOURCEVALUE, value);
    }

    /**
     * Gets the attribute value for TargetValue, using the alias name TargetValue.
     * @return the TargetValue
     */
    public String getTargetValue() {
        return (String)getAttributeInternal(TARGETVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TargetValue.
     * @param value value to set the TargetValue
     */
    public void setTargetValue(String value) {
        setAttributeInternal(TARGETVALUE, value);
    }

    /**
     * Gets the attribute value for StartDate, using the alias name StartDate.
     * @return the StartDate
     */
    public Date getStartDate() {
        return (Date)getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartDate.
     * @param value value to set the StartDate
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for EndDate, using the alias name EndDate.
     * @return the EndDate
     */
    public Date getEndDate() {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDate.
     * @param value value to set the EndDate
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for EnabledFlag, using the alias name EnabledFlag.
     * @return the EnabledFlag
     */
    public String getEnabledFlag() {
        return (String)getAttributeInternal(ENABLEDFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnabledFlag.
     * @param value value to set the EnabledFlag
     */
    public void setEnabledFlag(String value) {
        setAttributeInternal(ENABLEDFLAG, value);
    }

    /**
     * Gets the attribute value for Attribute1, using the alias name Attribute1.
     * @return the Attribute1
     */
    public String getAttribute1() {
        return (String)getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute1.
     * @param value value to set the Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for Attribute2, using the alias name Attribute2.
     * @return the Attribute2
     */
    public String getAttribute2() {
        return (String)getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute2.
     * @param value value to set the Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for Attribute3, using the alias name Attribute3.
     * @return the Attribute3
     */
    public String getAttribute3() {
        return (String)getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute3.
     * @param value value to set the Attribute3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for Attribute4, using the alias name Attribute4.
     * @return the Attribute4
     */
    public String getAttribute4() {
        return (String)getAttributeInternal(ATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute4.
     * @param value value to set the Attribute4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for Attribute5, using the alias name Attribute5.
     * @return the Attribute5
     */
    public String getAttribute5() {
        return (String)getAttributeInternal(ATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute5.
     * @param value value to set the Attribute5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for Attribute6, using the alias name Attribute6.
     * @return the Attribute6
     */
    public String getAttribute6() {
        return (String)getAttributeInternal(ATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute6.
     * @param value value to set the Attribute6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for Attribute7, using the alias name Attribute7.
     * @return the Attribute7
     */
    public String getAttribute7() {
        return (String)getAttributeInternal(ATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute7.
     * @param value value to set the Attribute7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for Attribute8, using the alias name Attribute8.
     * @return the Attribute8
     */
    public String getAttribute8() {
        return (String)getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute8.
     * @param value value to set the Attribute8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for Attribute9, using the alias name Attribute9.
     * @return the Attribute9
     */
    public String getAttribute9() {
        return (String)getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute9.
     * @param value value to set the Attribute9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for Attribute10, using the alias name Attribute10.
     * @return the Attribute10
     */
    public String getAttribute10() {
        return (String)getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute10.
     * @param value value to set the Attribute10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedLogin, using the alias name LastUpdatedLogin.
     * @return the LastUpdatedLogin
     */
    public BigDecimal getLastUpdatedLogin() {
        return (BigDecimal)getAttributeInternal(LASTUPDATEDLOGIN);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedLogin.
     * @param value value to set the LastUpdatedLogin
     */
    public void setLastUpdatedLogin(BigDecimal value) {
        setAttributeInternal(LASTUPDATEDLOGIN, value);
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

    /**
     * @param stringValueId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal stringValueId) {
        return new Key(new Object[]{stringValueId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("deloitte.fin.gl.coa.entity.CoaStringValuesEO");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        // Added by Vamsi to generate String Value ID
        SequenceImpl s = new SequenceImpl("COA_STRING_VALUES_S",getDBTransaction());
        BigDecimal b = new BigDecimal(s.getSequenceNumber().toString());
        setStringValueId(b);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}