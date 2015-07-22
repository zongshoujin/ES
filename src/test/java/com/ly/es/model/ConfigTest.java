package com.ly.es.model;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:beans.xml"})
public class ConfigTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private Config config;
    
    @Test
    public void testProperty(){
        System.out.println(config.getClusterName());
        System.out.println(config.isNodeClient());
    }
}
