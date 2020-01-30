package com.barco.model.enums;

/**
 * @author Nabeel.amd
 */
public enum JobStatus {

    Queue("In Queue"), Running("Running"), Success("Success"),
    Failed("Failed"), Completed("Completed");

    public String status;

    // Constructor 
    JobStatus(String status) { this.status = status; }

}
