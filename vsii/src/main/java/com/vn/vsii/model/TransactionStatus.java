package com.vn.vsii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long status_id;
    private String name;

    public TransactionStatus(String name) {
        this.name = name;
    }

    public TransactionStatus() {
    }

    public long getStatus_id() {
        return status_id;
    }

    public void setStatus_id(long status_id) {
        this.status_id = status_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
