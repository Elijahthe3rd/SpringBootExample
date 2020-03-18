package com.springweb.Entity;


import java.util.UUID;

public class Keyboard extends Assets{

    private  int id;
    private  UUID serialNo;
    private  String make;
    private  String type;
    private  String status;
    private  boolean availability;

    public Keyboard(int id,
                    UUID serialNo,
                    String make,
                    String type,
                    String status,
                    boolean availability){
        this.id=id;
        this.serialNo = serialNo;
        this.make=make;
        this.type=type;
        this.status = status;
        this.availability = availability;

        super.setCondition(this.status);
        super.setCategory(this.type);
        super.setManufacturer(this.make);
    }

    //getters
    public int getId() { return id; }
    public UUID getSerialNo() { return serialNo; }
    public String getMake(){ return make; }
    public String getType(){ return type; }
    public String getStatus() { return status; }
    public boolean getAvailability() { return availability; }

    //setters
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
    public void setStatus(String condition) {
        this.status = status;
    }
    public void setAvailable(boolean available) {
        this.availability = available;
    }

}
