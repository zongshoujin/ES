/** 
 * Project Name:ES 
 * File Name:ElasticSearchUtil.java 
 * Package Name:com.ly.es.util 
 * Date:2015年7月22日下午9:28:58 
 * Copyright (c) 2015, zongsj2008@163.com All Rights Reserved. 
 * 
*/  
  
package com.ly.es.util;  

import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequestBuilder;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;

/** 
 * ClassName:ElasticSearchUtil <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年7月22日 下午9:28:58 <br/> 
 * @author   zongshoujin 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ElasticSearchUtil {

    /**
     * 索引库是否存在
     * @param client
     *          客户端
     * @param index
     *          索引库名
     * @return
     */
    public static boolean indexExist(Client client, String index){
        IndicesExistsRequest request = new IndicesExistsRequestBuilder(client.admin().indices(), index).request();
        IndicesExistsResponse response = client.admin().indices().exists(request).actionGet();
        return response.isExists();
    }
    
    /**
     * 生成客户端
     * @return
     */
    public static Client createClient(){
        NodeBuilder builder = NodeBuilder.nodeBuilder();
        
        String clusterName = PropertyManagerUtil.getCfgProperty(WebConstant.CLUSTER_NAME_PROP);
        builder.clusterName(clusterName);
        
        Boolean isClient = Boolean.valueOf(PropertyManagerUtil.getCfgProperty(WebConstant.CLIENT_PROP));
        builder.client(isClient);
        
        Node node = builder.node();
        return node.client();
    }
}
  