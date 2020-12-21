package com.barco.model.enums;

/**
 * @author Nabeel Ahmed
 */
public enum Status {
    Inactive(0), Active(1),
    Pending(2), Delete(3),
    Process(4), Fail(5),
    Not_Found(6);

    public Integer value; // int value of each status

    // Constructor
    Status(Integer value) {
        this.value = value;
    }

    public static Status getStatus(Long v) {
        if (v == 0) {
            return Status.Inactive;
        } else if (v == 1) {
            return Status.Active;
        } else if (v == 2) {
            return Status.Pending;
        } else if (v == 3) {
            return Status.Delete;
        } else if (v == 4) {
            return Status.Process;
        } else if (v == 5) {
            return Status.Fail;
        } else if (v == 6) {
            return Status.Not_Found;
        }
        return null;
    }

    public static Integer getStatus(String v) {
        switch (v) {
            case "inactive": return 0;
            case "active": return 1;
            case "pending": return 2;
            case "delete": return 3;
            case "process": return 4;
            case "fail": return 5;
            case "not_found": return 6;
        }
        return -1;
    }
}
