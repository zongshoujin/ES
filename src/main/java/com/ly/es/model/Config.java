package com.ly.es.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("config")
public class Config {

    @Value("${cluster.name}")
    private String clusterName;
    
    @Value("${node.client}")
    private boolean nodeClient;
    
    @Value("${address}")
    private String address;
    
    @Value("${port}")
    private int port;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public boolean isNodeClient() {
        return nodeClient;
    }

    public void setNodeClient(boolean nodeClient) {
        this.nodeClient = nodeClient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
