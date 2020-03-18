package com.springweb.Entity;

import java.util.UUID;

public class Electronics extends Assets {

    private int id;
    private UUID serialNo;
    private String make;
    private String type;
    private String status;
    private boolean available;

    private String model;
    public Electronics(int id, UUID serialNo, String make,
                       String type, String status,
                       boolean available, String model) {
        this.id = id;
        this.serialNo = serialNo;
        this.make = make;
        this.type = type;
        this.status = status;
        this.available = available;
        this.model = model;
        super.setCondition(this.status);
        super.setCategory(this.type);
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
    public String getType() {
        return type;
    }
    public String getStatus() {
        return this.status;
    }
    public boolean isAvailable() {
        return available;
    }
    public String getModel() {
        return model;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setSerialNo(UUID serialNo) {
        this.serialNo = serialNo;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
