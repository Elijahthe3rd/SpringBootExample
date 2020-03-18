package com.springweb.Entity;

import java.util.UUID;
public class Mouse extends Assets{
    //local attribute or variables
    private  int id;
    private  UUID serialNo;
    private  String make;
    private  String type;
    private  String status;
    private  boolean availability;

    //constructors
    public Mouse(int id, UUID serialNo, String make, String type, String status, boolean availability) {

        this.id = id;
        this.serialNo = serialNo;
        this.make = make;
        this.type=type;
        this.status = status;
        this.availability = availability;

        super.setCondition(this.status);
        super.setCategory(this.type);
        super.setManufacturer(this.make);
    }

    //getter methods
    public int getId() { return id;
    }
    public String getMake() { return make;
    }
    public UUID getSerialNo() { return serialNo;
    }
    public String getType() { return type;
    }
    public String getStatus() { return status;
    }
    public boolean isAvailability() { return availability;
    }

    //setter methods
    public void setSerialNo(UUID serialNo) { this.serialNo = serialNo;
    }
    public void setId(int id) { this.id = id;
    }
    public void setMake(String make) { this.make = make;
    }
    public void setType(String type) { this.type = type;
    }
    public void setStatus(String status) { this.status = status;
    }
    public void setAvailability(boolean availability) { this.availability = availability;
    }
}
