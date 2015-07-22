/** 
 * Project Name:ES 
 * File Name:JsonUtils.java 
 * Package Name:com.ly.es.util 
 * Date:2015年5月23日下午9:16:52 
 * Copyright (c) 2015, zongsj2008@163.com All Rights Reserved. 
 * 
*/  
  
package com.ly.es.util;  

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/** 
 * ClassName:JsonUtils <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年5月23日 下午9:16:52 <br/> 
 * @author   zongshoujin 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public final class JsonUtils {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);
    
    private static ObjectMapper objectMapper = null;
    
    static{
        objectMapper = new ObjectMapper();
    }
    
    public static String bean2Json(Object obj){
        if(obj == null) return null;
        
        String json = null;
        try {
            json = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error("Json 转换出错", e);
        }
        
        return json;
    }
}
  