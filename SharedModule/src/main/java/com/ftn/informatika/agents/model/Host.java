package com.ftn.informatika.agents.model;

import java.io.Serializable;

/**
 * @author - Srđan Milaković
 */
public class Host implements Serializable {
    private String address;
    private String alias;

    public Host() {
    }

    public Host(String address, String alias) {
        this.address = address;
        this.alias = alias;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Host{" +
                "address='" + address + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}