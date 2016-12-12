package deloitte.fin.gl.coa.module;

import deloitte.fin.gl.coa.module.common.COAAM;

import deloitte.fin.gl.coa.view.COAMappingRulesVOImpl;
import deloitte.fin.gl.coa.view.COASearchVOImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.ViewCriteria;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.DBTransactionImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;

import oracle.jdbc.OracleCallableStatement;

import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 02 00:12:33 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class COAAMImpl extends ApplicationModuleImpl implements COAAM {
    /**
     * This is the default constructor (do not remove).
     */
    public COAAMImpl() {
    }

 public void executeCOAMappingRuleVO(String ruleStr, String descStr, String seqStr, String sourceStr, String targetSystemStr)
 {
     String whereClauseStr= " 1=1 " ;
     
    System.out.println("Inside the method executeCOAMappingRuleVO");
      COAMappingRulesVOImpl vo = (COAMappingRulesVOImpl)getCOAMappingRulesVO1(); 
      
      vo.clearCache();
      vo.setWhereClause(null);
     // vo.setWhereClauseParams(null);      
     
       if(ruleStr!=null  && !"".equals(ruleStr))
           whereClauseStr += "AND RULE_NAME = '"+ruleStr +"'" ;
         
         if(descStr!=null&& !"".equals(descStr))
             whereClauseStr += "AND DESCRIPTION = '"+descStr +"'";
         
         if(seqStr!=null&& !"".equals(seqStr))
              whereClauseStr +=  "AND ATTRIBUTE1 = '"+seqStr +"'";
         
         if(sourceStr!=null&& !"".equals(sourceStr))
              whereClauseStr +=  "AND SOURCE_SYSTEM = '"+sourceStr +"'";
    
         if(targetSystemStr!=null&& !"".equals(targetSystemStr))
               whereClauseStr += "AND TARGET_SYSTEM = '"+targetSystemStr +"'";
         
         vo.setWhereClause(whereClauseStr);
        System.out.println("Total QUery --"+ vo.getQuery()); 
      vo.executeQuery();
     
     }
 
    /**
     * /method to call PLSQL Stored Procedure to save the  COA GL Config Data
     */     
       public void callCOACreatingMappingRuleProc(String sourceSystemStr,String targetSystemStr, String ruleNameStr,String descStr, String seqStr
                                             ,  oracle.jbo.domain.Number sourceSegArray [], oracle.jbo.domain.Number targetSeqArray[]
                                             )
       {
           
           //procedure insert_rule_config(p_source_sys varchar2, p_target_sys varchar2, p_rule_name varchar2, p_desc varchar2 ,
           //  p_seq number,p_source_seg_array COA_SEGMENT_NUM_T, p_target_seg_array COA_SEGMENT_NUM_T) 
              String returnStatus = null, message  = null; 
               DBTransactionImpl dbti = (DBTransactionImpl)getDBTransaction();         
               String sql = "BEGIN  XXCOA_PLSQL_UTILS.insert_rule_config("

                        +"p_source_sys       =>:1,"
                        +"p_target_sys        =>:2,"
                        +"p_rule_name        => :3 , "
                        +"p_desc          =>:4 ,"
                        +"p_seq              =>:5 ," 
                        +"p_source_seg_array      =>:6,"
                        +"p_target_seg_array    => :7,"
                       +"x_return_status    => :8,"                         
                       +"x_message => :9); END;";
               
               
                  CallableStatement statement =
                    dbti.createCallableStatement(sql, 0);
                  try {
                      statement.setString(1, sourceSystemStr);
                      statement.setString(2, targetSystemStr);
                      statement.setString(3, ruleNameStr);
                      statement.setString(4, descStr);                   
                      statement.setString(5, seqStr);                    
                      
                      ArrayDescriptor desc = ArrayDescriptor.createDescriptor("COA_SEGMENT_NUM_T", statement.getConnection());
                      ARRAY sourceSeqArrayValue = new ARRAY (desc, statement.getConnection(), sourceSegArray); 
                      ((OracleCallableStatement)statement).setArray(6, sourceSeqArrayValue);
        
                       ARRAY targetSeqArrayValue = new ARRAY (desc, statement.getConnection(), targetSeqArray); 
                      ((OracleCallableStatement)statement).setArray(7, targetSeqArrayValue);
                      
                      
                      statement.registerOutParameter(8, Types.VARCHAR);
                      statement.registerOutParameter(9, Types.VARCHAR);                   
                      statement.execute();
                      dbti.commit();
                      
                      returnStatus = statement.getString(8);  
                      message = statement.getString(9);
                      
                  } catch (SQLException sqlerr) {
                      throw new JboException(sqlerr);
                  } finally {
                      try {
                          if (statement != null) {
                              statement.close();
                          }
                      } catch (SQLException closeerr) {
                          throw new JboException(closeerr);
                      }
                  }
           
             
           }
       
    /**
     * Container's getter for COAMappingRulesVO1.
     * @return COAMappingRulesVO1
     */
    public ViewObjectImpl getCOAMappingRulesVO1() {
        return (ViewObjectImpl)findViewObject("COAMappingRulesVO1");
    }

    /**
     * Container's getter for COASegmentDefinitionsVO1.
     * @return COASegmentDefinitionsVO1
     */
    public ViewObjectImpl getCOASegmentDefinitionsVO1() {
        return (ViewObjectImpl)findViewObject("COASegmentDefinitionsVO1");
    }

    /**
     * Container's getter for COASegmentMappingsVO1.
     * @return COASegmentMappingsVO1
     */
    public ViewObjectImpl getCOASegmentMappingsVO1() {
        return (ViewObjectImpl)findViewObject("COASegmentMappingsVO1");
    }

    /**
     * Container's getter for COASegmentValuesVO1.
     * @return COASegmentValuesVO1
     */
    public ViewObjectImpl getCOASegmentValuesVO1() {
        return (ViewObjectImpl)findViewObject("COASegmentValuesVO1");
    }

    /**
     * Container's getter for COASegmentMappingsVO2.
     * @return COASegmentMappingsVO2
     */
    public ViewObjectImpl getCOASegmentMappingsVO2() {
        return (ViewObjectImpl)findViewObject("COASegmentMappingsVO2");
    }

    /**
     * Container's getter for COASegmentValuesVO2.
     * @return COASegmentValuesVO2
     */
    public ViewObjectImpl getCOASegmentValuesVO2() {
        return (ViewObjectImpl)findViewObject("COASegmentValuesVO2");
    }

    /**
     * Container's getter for COASegmentMappingsVO3.
     * @return COASegmentMappingsVO3
     */
    public ViewObjectImpl getCOASegmentMappingsVO3() {
        return (ViewObjectImpl)findViewObject("COASegmentMappingsVO3");
    }

    /**
     * Container's getter for COASegmentMappingsVO4.
     * @return COASegmentMappingsVO4
     */
    public ViewObjectImpl getCOASegmentMappingsVO4() {
        return (ViewObjectImpl)findViewObject("COASegmentMappingsVO4");
    }


    public void findCOAValues(String sourceSystem,String targetSystem,String mappingRule,String sourceSegment,String targetSegemnt,String sourceValue,String targetValue){
            System.out.println("Source System:"+sourceSystem+
                               "Tatget: "+targetSystem+
                               "Mapping: "+mappingRule+
                               "SourceSegment: "+sourceSegment+
                               "TargetSegemnt: "+targetSegemnt+
                               "SourceValue: "+sourceValue+
                               "TargetValue "+targetValue+"\n");
            
            ViewObjectImpl COAValuesVO = getCOASearchVO1();
        //        tableName = "TableA";
            if (sourceSystem != null||targetSystem !=null||mappingRule !=null||sourceSegment != null||targetSegemnt!=null||sourceValue!=null||targetValue!=null){
            System.out.println("Inside IF Start");
                ViewCriteria vc =
                    COAValuesVO.getViewCriteria("COASearchVOCriteria");
                COAValuesVO.applyViewCriteria(vc);
                COAValuesVO.setNamedWhereClauseParam("p_SourceSystem", sourceSystem);
                COAValuesVO.setNamedWhereClauseParam("p_TargetSystem", targetSystem);
                COAValuesVO.setNamedWhereClauseParam("p_MappingRule", mappingRule);
                COAValuesVO.setNamedWhereClauseParam("p_SourceSegment", sourceSegment);
                COAValuesVO.setNamedWhereClauseParam("p_TargetSegment", targetSegemnt);
                COAValuesVO.setNamedWhereClauseParam("p_SourceSegmentValue", sourceValue);
                COAValuesVO.setNamedWhereClauseParam("p_TargetSegmentValue", targetValue);
        //            ciaVO.executeQuery();
        System.out.println("Inside IF END");
            }
            else{
                System.out.println("Inside Else Start");
                ViewCriteria vc = COAValuesVO.getViewCriteria("COASearchVOCriteria");
                COAValuesVO.removeViewCriteria("COASearchVOCriteria");
                vc.resetCriteria();
                COAValuesVO.applyViewCriteria(vc);
        //            ciaVO.executeQuery();
        System.out.println("Inside Else Start");
            }
            
        }


    /**
     * Container's getter for SysC007381Link1.
     * @return SysC007381Link1
     */
    public ViewLinkImpl getSysC007381Link1() {
        return (ViewLinkImpl)findViewLink("SysC007381Link1");
    }

    /**
     * Container's getter for SysC007382Link1.
     * @return SysC007382Link1
     */
    public ViewLinkImpl getSysC007382Link1() {
        return (ViewLinkImpl)findViewLink("SysC007382Link1");
    }

    /**
     * Container's getter for SysC007380Link1.
     * @return SysC007380Link1
     */
    public ViewLinkImpl getSysC007380Link1() {
        return (ViewLinkImpl)findViewLink("SysC007380Link1");
    }

    /**
     * Container's getter for SysC007379Link1.
     * @return SysC007379Link1
     */
    public ViewLinkImpl getSysC007379Link1() {
        return (ViewLinkImpl)findViewLink("SysC007379Link1");
    }

    /**
     * Container's getter for COASearchVO1.
     * @return COASearchVO1
     */
    public COASearchVOImpl getCOASearchVO1() {
        return (COASearchVOImpl)findViewObject("COASearchVO1");
    }

    /**
     * Container's getter for COAFindFieldLOVVO1.
     * @return COAFindFieldLOVVO1
     */
    public ViewObjectImpl getCOAFindFieldLOVVO1() {
        return (ViewObjectImpl)findViewObject("COAFindFieldLOVVO1");
    }
    protected Object invokeStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
            CallableStatement cst = null;
            try {
                //Creating sql statement
                cst = this.getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
                //Register dataType for return value
                cst.registerOutParameter(1, sqlReturnType);
                //Pass input parameters value
                if (bindVars != null) {
                    for (int z = 0; z < bindVars.length; z++) {
                        cst.setObject(z + 2, bindVars[z]);
                    }
                }
                cst.executeUpdate();
                //Finally get returned value
                return cst.getObject(1);
            } catch (SQLException e) {
                throw new JboException(e.getMessage());
            } finally {
                if (cst != null) {
                    try {
                        cst.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    
    public String getCOASegments(String sourceSystem, String targetSystem, String sourceString){
        String returnValue = "Return Value is null";
        Object outString = invokeStoredFunction(Types.VARCHAR, "GET_TARGET_COA_STRING(?,?,?)", new Object[]{sourceSystem,targetSystem,sourceString});
        if (outString!= null){
                returnValue=outString.toString();
            }
        return returnValue;
        }
    /*END*/

    /**
     * Container's getter for COASourceSystemLOVVO1.
     * @return COASourceSystemLOVVO1
     */
    public ViewObjectImpl getCOASourceSystemLOVVO1() {
        return (ViewObjectImpl)findViewObject("COASourceSystemLOVVO1");
    }

    /**
     * Container's getter for COATargetSystemLOVVO1.
     * @return COATargetSystemLOVVO1
     */
    public ViewObjectImpl getCOATargetSystemLOVVO1() {
        return (ViewObjectImpl)findViewObject("COATargetSystemLOVVO1");
    }

    /**
     * Container's getter for COASourceSegmentLOVVO1.
     * @return COASourceSegmentLOVVO1
     */
    public ViewObjectImpl getCOASourceSegmentLOVVO1() {
        return (ViewObjectImpl)findViewObject("COASourceSegmentLOVVO1");
    }

    /**
     * Container's getter for COATargetSegmentLOVVO1.
     * @return COATargetSegmentLOVVO1
     */
    public ViewObjectImpl getCOATargetSegmentLOVVO1() {
        return (ViewObjectImpl)findViewObject("COATargetSegmentLOVVO1");
    }
    
    public String getTargetString(String pSourceSystem, String pTargetSystem, String pSourceString)
    {
        String pTargetString = "";    
        Connection conn = null;
        System.out.println("In getMappings Method");
        try{
            
            PreparedStatement st =  getDBTransaction().createPreparedStatement("commit", 1);
             conn = st.getConnection();
            System.out.println("Getting Target Mapping for : Source - "+ pSourceSystem + " Target - "+ pTargetSystem + " Source String: "+ pSourceString);                                                              
            CallableStatement cstmt = conn.prepareCall("begin :1 := COA_UTIL_PKG.GET_TARGET_COA_STRING(:2,:3,:4); end;");
            
            cstmt.registerOutParameter(1, Types.VARCHAR);
            cstmt.setString(2,pSourceSystem);
            cstmt.setString(3,pTargetSystem);
            cstmt.setString(4,pSourceString);
            cstmt.execute();
            pTargetString = cstmt.getString(1);
            System.out.println("Target String: "+ pTargetString);
        } //try
        catch(Exception e)
        {
            System.out.println("Exception: " + e.getMessage());    
            pTargetString = e.getMessage();
            e.printStackTrace();            
        }
        finally{
                if(conn!=null)
                    try {
                        conn.close(); }
                catch(Exception e)
                    {
                        e.printStackTrace();
                        }
            } //finally
        
        return pTargetString;
    } //getMapping String
    
    
}
