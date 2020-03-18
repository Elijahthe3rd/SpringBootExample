package com.springweb.Entity;

import java.util.UUID;

public class Tower extends Assets {

    //local attributes / variants
    private  int    id;
    private  UUID   serialNo;
    private  String make;
    private  String type;
    private  String disk_type;
    private  String disk_size;
    private  String status;
    private  boolean availability;

    //constructor to build/assign passes args to local variants
    public Tower(int id, UUID serialNo, String make, String type,
                 String disk_type, String disk_size, String status,
                 boolean availability) { this.id = id;this.serialNo = serialNo;this.make = make;this.type = type;this.disk_type = disk_type;this.disk_size = disk_size;this.status = status;this.availability = availability;super.setCondition(this.status);super.setAssigned(this.availability);super.setCategory(this.type);super.setManufacturer(this.make);
    }

    //getter methods
    public int getId() { return id;
    }
    public UUID getSerialNo() { return serialNo;
    }
    public String getMake() { return make;
    }
    public String getType() { return type;
    }
    public String getDisk_type() { return disk_type;
    }
    public String getDisk_size() { return disk_size;
    }
    public String getStatus() { return status;
    }
    public boolean isAvailability() { return availability;
    }

    //setter methods
    public void setId(int id) { this.id = id;
    }
    public void setSerialNo(UUID serialNo) { this.serialNo = serialNo;
    }
    public void setMake(String make) { this.make = make;
    }
    public void setType(String type) { this.type = type;
    }
    public void setDisk_type(String disk_type) { this.disk_type = disk_type;
    }
    public void setDisk_size(String disk_size) { this.disk_size = disk_size;
    }
    public void setStatus(String status) { this.status = status;
    }
    public void setAvailability(boolean availability) { this.availability = availability;
    }
}
