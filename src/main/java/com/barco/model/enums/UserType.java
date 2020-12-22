package com.barco.model.enums;

/**
 * @author Nabeel Ahmed
 */
public enum UserType {
    LOCAL, REMOTE;

    public static UserType getUserType(Long key) {
        UserType userType = null;
        if (key == 0L) {
            userType = LOCAL;
        } else if (key == 1L) {
            userType = REMOTE;
        }
        return userType;
    }
}