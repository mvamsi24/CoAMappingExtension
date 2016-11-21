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

Create or replace package XXCOA_PLSQL_UTILS IS
 
 procedure insert_rule_config(p_source_sys varchar2, p_target_sys varchar2, p_rule_name varchar2, p_desc varchar2 ,
  p_seq number,p_source_seg_array COA_SEGMENT_NUM_T, p_target_seg_array COA_SEGMENT_NUM_T ,      x_return_status   OUT NOCOPY      VARCHAR2,
      x_message         OUT NOCOPY      VARCHAR2) ; 
  
end;   