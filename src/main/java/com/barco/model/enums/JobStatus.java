package com.barco.model.enums;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum JobStatus {

    Queue("In Queue"), Running("Running"), Success("Success"),
    Failed("Failed"), Completed("Completed"),
    Stop("Stop"), Skip("Skip");

    public String status;

    JobStatus(String status) { this.status = status; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
