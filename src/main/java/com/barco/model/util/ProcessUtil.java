package com.barco.model.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author Nabeel Ahmed
 */
public class ProcessUtil {

    public static Logger logger = LoggerFactory.getLogger(ProcessUtil.class);

    public static String SIMPLE_DATE_PATTERN = "yyyy-MM-dd";
    public static String CONTENT_DISPOSITION ="Content-Disposition";
    public static String FILE_NAME_HEADER = "attachment; filename=";
    public static String ERROR = "ERROR";
    public static String SUCCESS = "SUCCESS";
    public static String JOB_ADD = "Job-Add";

    // Lookup
    public static String CREDENTIAL_TYPE = "CREDENTIAL_TYPE";
    public static String TEMPLATE_REF = "TEMPLATE_REF";
    public static String UPLOAD_LIMIT = "UPLOAD_LIMIT";
    public static String DOWNLOAD_LIMIT = "DOWNLOAD_LIMIT";
    public static String QUEUE_FETCH_LIMIT = "QUEUE_FETCH_LIMIT";
    public static String SCHEDULER_LAST_RUN_TIME = "SCHEDULER_LAST_RUN_TIME";
    public static String EMAIL_RECEIVER = "EMAIL_RECEIVER";
    public static String EMAIL_SENDER = "EMAIL_SENDER";
    public static String RESET_PASSWORD_LINK = "RESET_PASSWORD_LINK";
    public static String SCHEDULER_TIMEZONE = "SCHEDULER_TIMEZONE";
    public static String ASIA_QATAR = "ASIA_QATAR";
    public static String ASIA_KARACHI = "ASIA_KARACHI";
    public static String AMERICA_NEW_YORK = "AMERICA_NEW_YORK";
    public static String SUPER_ADMIN = "SUPER_ADMIN";
    public static String URL_VALIDATOR = "URL_VALIDATOR";
    public static String HOME_PAGE = "HOME_PAGE";

    public static boolean isNull(Object payload) {
        return payload == null || payload == "" ? true : false;
    }

    public static boolean isNotBlank(String s) {
        return !isBlank(s);
    }

    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static boolean isNull(Long log) {
        if (log == null) {
            return true;
        }
        return false;
    }

    public static boolean isNull(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNull(Boolean bool) {
        if (bool == null) {
            return true;
        }
        return false;
    }

    public static boolean isNull(Double dou) {
        if (dou == null) {
            return true;
        }
        return false;
    }

    public static boolean isNull(Date dt) {
        if (dt == null) {
            return true;
        } else if (String.valueOf(dt) == null) {
            return true;
        } else if (String.valueOf(dt).trim().length() <= 0) {
            return true;
        }
        return false;
    }

}