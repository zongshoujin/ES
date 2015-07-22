/** 
 * Project Name:ES 
 * File Name:JsonUtilsTest.java 
 * Package Name:com.ly.es.util 
 * Date:2015年5月23日下午9:22:42 
 * Copyright (c) 2015, zongsj2008@163.com All Rights Reserved. 
 * 
*/  
  
package com.ly.es.util;  

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ly.es.entity.Hotel;

/** 
 * ClassName:JsonUtilsTest <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年5月23日 下午9:22:42 <br/> 
 * @author   zongshoujin 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class JsonUtilsTest {

    private Hotel hotel = null;
    
    @Before
    public void setUp(){
        hotel =  new Hotel(1,"苏州全季大酒店",588,"苏州人民路88号","226");
    }
    
    @After
    public void tearDown(){
        hotel = null;
    }
    
    @Test
    public void testBean2Json(){
        String json = JsonUtils.bean2Json(hotel);
        if(StringUtils.isNotBlank(json)){
            System.out.println(json);
        }
    }
}
  