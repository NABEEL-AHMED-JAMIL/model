package com.barco.model.enums;

/**
 * @author Nabeel Ahmed
 */
public enum KeyType {
    AWS, FTP, DB;

    public static KeyType getKeyType(Long key) {
        KeyType keyType = null;
        if (key == 0L) {
            keyType = AWS;
        } else if (key == 1L) {
            keyType = AWS;
        } else if (key == 2L) {
            keyType = AWS;
        }
        return keyType;
    }
}
