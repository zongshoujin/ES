/** 
 * Project Name:ES 
 * File Name:PropertyManagerUtil.java 
 * Package Name:com.ly.es.util 
 * Date:2015年7月22日下午9:34:25 
 * Copyright (c) 2015, zongsj2008@163.com All Rights Reserved. 
 * 
*/  
  
package com.ly.es.util;  

import java.io.File;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * ClassName:PropertyManagerUtil <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年7月22日 下午9:34:25 <br/> 
 * @author   zongshoujin 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class PropertyManagerUtil {

    private static final Logger logger = LoggerFactory.getLogger(PropertyManagerUtil.class);
    
    private static Map<String, String> propertyMap = null;
    
    static{
        try{
            propertyMap = new HashMap<String, String>();
            
            String cfgPath = PropertyManagerUtil.class.getResource("/config").getPath();
            File dic = new File(cfgPath);
            for(File file : dic.listFiles()){
                if(file.getName().endsWith(WebConstant.SUFFIX)){
                    Properties prop = new Properties();
                    prop.load(new FileInputStream(file));
                    
                    Enumeration<Object> keys = prop.keys();
                    while(keys.hasMoreElements()){
                        String key = keys.nextElement().toString();
                        String value = (String)prop.get(key);
                        
                        propertyMap.put(key, value);
                    }
                }
            }
        }catch(Exception e){
            logger.error("读取config.properties文件异常");
        }
    }
    
    /**
     * 根据名称获取对应的值
     * @param name
     *          配置文件的名称
     * @return
     *          配置文件的值
     */
    public static String getCfgProperty(String name){
        if(StringUtils.isBlank(name)) return "";
        
        return propertyMap.get(name);
    }
}
  