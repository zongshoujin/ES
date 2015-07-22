package com.ly.es.demo;

import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ESClientTest {

	private NodeBuilder nodeBuider = null;
	
	@Before
	public void setUp(){
		nodeBuider = new NodeBuilder();
	}
	
	@After
	public void tearDown(){
		nodeBuider = null;
	}
	
	@Test
	public void testESClient(){
		
		Node node = nodeBuider.clusterName("elasticsearch").node();
		Client client = node.client();
	}
	
	@Test
	public void testBuilder(){
	}
}
