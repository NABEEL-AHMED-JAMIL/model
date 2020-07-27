package com.barco.model.enums;

public enum JobStatus {
    Queue("In Queue"),
    Running("Running"),
    Success("Success"),
    Failed("Failed"),
    Completed("Completed"),
    Stop("Stop"),
    Skip("Skip");

    public String status;

    JobStatus(String status) { this.status = status; }

}
