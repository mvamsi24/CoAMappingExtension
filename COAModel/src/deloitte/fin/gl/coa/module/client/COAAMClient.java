package deloitte.fin.gl.coa.module.client;

import deloitte.fin.gl.coa.module.common.COAAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 02 00:35:54 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class COAAMClient extends ApplicationModuleImpl implements COAAM {
    /**
     * This is the default constructor (do not remove).
     */
    public COAAMClient() {
    }


    public void findCOAValues(String sourceSystem, String targetSystem,
                              String mappingRule, String sourceSegment,
                              String targetSegemnt, String sourceValue,
                              String targetValue) {
        Object _ret =
            this.riInvokeExportedMethod(this,"findCOAValues",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {sourceSystem, targetSystem, mappingRule, sourceSegment, targetSegemnt, sourceValue, targetValue});
        return;
    }

    public String getCOASegments(String sourceSystem, String targetSystem,
                                 String sourceString) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getCOASegments",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {sourceSystem, targetSystem, sourceString});
        return (String)_ret;
    }

    public void callCOACreatingMappingRuleProc(String sourceSystemStr,
                                               String targetSystemStr,
                                               String ruleNameStr,
                                               String descStr, String seqStr,
                                               Number[] sourceSegArray,
                                               Number[] targetSeqArray) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callCOACreatingMappingRuleProc",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","[Loracle.jbo.domain.Number;","[Loracle.jbo.domain.Number;"},new Object[] {sourceSystemStr, targetSystemStr, ruleNameStr, descStr, seqStr, sourceSegArray, targetSeqArray});
        return;
    }

    public void executeCOAMappingRuleVO(String ruleStr, String descStr,
                                        String seqStr, String sourceStr,
                                        String targetSystemStr) {
        Object _ret =
            this.riInvokeExportedMethod(this,"executeCOAMappingRuleVO",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {ruleStr, descStr, seqStr, sourceStr, targetSystemStr});
        return;
    }

    public String getTargetString(String pSourceSystem, String pTargetSystem,
                                  String pSourceString) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getTargetString",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {pSourceSystem, pTargetSystem, pSourceString});
        return (String)_ret;
    }
}
