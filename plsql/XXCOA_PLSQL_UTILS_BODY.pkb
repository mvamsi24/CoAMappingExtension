/*===========================================================================+
|   Copyright (c) 2016                                                      |
|                                                                           |
+===========================================================================+
|                                                                           |
|  XXCOA_PLSQL_UTILS                                                        |
|                                                                           |
|  HISTORY                                                                  |
|                                                                           |
| Version     Name       Issue         Description                          |
|---------------------------------------------------------------------------|
|  1.0        sriyerram   N.A          First release                        |
|                                                                           |
+===========================================================================*/

  Create or replace package body XXCOA_PLSQL_UTILS IS
 
 procedure insert_rule_config(p_source_sys varchar2, p_target_sys varchar2, p_rule_name varchar2, p_desc varchar2 ,
  p_seq number,p_source_seg_array COA_SEGMENT_NUM_T, p_target_seg_array COA_SEGMENT_NUM_T ,
        x_return_status   OUT NOCOPY      VARCHAR2,
      x_message         OUT NOCOPY      VARCHAR2
  ) 
  is
  
  l_source_seg_count number;
  l_target_seg_count number ; 
  l_rule_id number ; 
  
  l_target_segment_id number; 
  
  begin
   
  l_rule_id := coa_mapping_rules_rule_id_s.NEXTVAL ; 
  insert into coa_plsql_log values (coa_plsql_log_sno_s.nextval, 'Entered The Pro insert_rule_config' , sysdate) ;
  
    insert into coa_plsql_log values (coa_plsql_log_sno_s.nextval, 'Inserting Data to coa_mapping_rules' , sysdate) ;
    
  INSERT INTO coa_mapping_rules (rule_id,
                               rule_name,
                               description,
                               source_system,
                               target_system,
                               start_date,
                               end_date,
                               enabled_flag,
							   attribute1)
     VALUES (l_rule_id,
              p_rule_name,
              p_desc,
              p_source_sys,
              p_target_sys,
             SYSDATE,
             SYSDATE + 720,
             'Y',
			 p_seq);                
        
commit;  

  insert into coa_plsql_log values (coa_plsql_log_sno_s.nextval, 'Source Segment List ' , sysdate) ;
  
           FOR i IN p_source_seg_array.FIRST .. p_source_seg_array.LAST
         LOOP
            insert into coa_plsql_log values (coa_plsql_log_sno_s.nextval, 'p_source_seg_array-->' || p_source_seg_array(i) , sysdate) ;
         END LOOP;
         
      insert into coa_plsql_log values (coa_plsql_log_sno_s.nextval, 'Target Segment List ' , sysdate) ;
  
           FOR i IN p_target_seg_array.FIRST .. p_target_seg_array.LAST
         LOOP
            insert into coa_plsql_log values (coa_plsql_log_sno_s.nextval, 'p_target_seg_array-->' || p_target_seg_array(i) , sysdate) ;
         END LOOP;     
            
         
         l_source_seg_count :=p_source_seg_array.LAST ; 
         l_target_seg_count := p_target_seg_array.LAST; 
         
         
      FOR i IN p_source_seg_array.FIRST .. p_source_seg_array.LAST
         LOOP
         
            insert into coa_plsql_log values (coa_plsql_log_sno_s.nextval, 'p_source_seg_array-->' || p_source_seg_array(i) , sysdate) ;
          
         if(i > l_target_seg_count) THEN 
            l_target_segment_id :=  -1;
            else
           l_target_segment_id   :=p_target_seg_array(i); 
            END IF ; 
            
            
            insert into coa_segment_mappings(mapping_id,  rule_id,  source_segment_id, target_segment_id, enabled_flag, start_date, end_date) 
                      values(coa_segment_mapping_rule_id_s.nextval ,l_rule_id,
                        p_source_seg_array(i),
                         l_target_segment_id ,
                         'Y',SYSDATE, SYSDATE+720);
                      
                      
       END LOOP;
         
         
         
         commit; 
         
  end insert_rule_config;  
  
end;   