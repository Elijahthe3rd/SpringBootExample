package com.springweb.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Monitor extends Assets{
    private  int id;
    private  UUID serialNo;
    private  String make;
    private  String monitorType;
    private  String monitorSize;
    private  String status;
    private  boolean availability;

    public Monitor(int id, UUID serialNo,
                   String make, String monitorType,
                   String monitorSize, String status, boolean availability) {

        this.id = id;
        this.serialNo = serialNo;
        this.make = make;
        this.monitorType = monitorType;
        this.monitorSize = monitorSize;
        this.status = status;
        this.availability = availability;
        super.setCondition(this.status);
        super.setAssigned(this.availability);
        super.setCategory(this.monitorSize);
        super.setManufacturer(this.make);
    }

    public int getId() {
        return id;
    }
    public UUID getSerialNo() {
        return serialNo;
    }
    public String getMake() {
        return make;
    }
    public String getMonitorType() {
        return monitorType;
    }
    public String getMonitorSize() {
        return monitorSize;
    }
    public String getStatus() {
        return status;
    }
    public boolean getAvailability() {
        return availability;
    }
}
