package com.springweb.Entity;
import java.util.UUID;

public abstract class Assets {

    private boolean assigned;
    private String assignedTo;
    private String department;
    private String manufacturer;
    private String category;
    private String condition;

    {
        this.assigned=false;
        this.assignedTo="@umuziProperty.org is default";
    }

    public Assets(boolean assigned, String assignedTo,
                  String department, String manufacturer,
                  String category) {

        this.assigned = assigned;
        this.assignedTo = assignedTo;
        this.department = department;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public Assets(){}

    //setter methods

    public void setAssigned(boolean assigned) { this.assigned = assigned;
    }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo;
    }
    public void setDepartment(String department) { this.department = department;
    }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer;
    }
    public void setCategory(String category) { this.category = category;
    }
    public void setCondition(String status){ this.condition=status;
    };

    //getter methods
    public boolean isAssigned() { return assigned;
    }
    public String getAssignedTo() { return assignedTo;
    }
    public String getDepartment() { return department;
    }
    public String getManufacturer() { return manufacturer;
    }
    public String getCategory() { return category;
    }

}
