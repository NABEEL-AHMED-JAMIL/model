package com.barco.model.util;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Nabeel Ahmed
 */
public class ModelUtil {

    public static Logger logger = LogManager.getLogger(ModelUtil.class);

    private static final String[] IP_HEADERS = { "X-Forwarded-For", "Proxy-Client-IP", "WL-Proxy-Client-IP",
        "HTTP_X_FORWARDED_FOR", "HTTP_X_FORWARDED", "HTTP_X_CLUSTER_CLIENT_IP",
        "HTTP_CLIENT_IP", "HTTP_FORWARDED_FOR", "HTTP_FORWARDED", "HTTP_VIA", "REMOTE_ADDR"
    };

    /**
     * Method use to verify the email valid or not
     * @param email
     * @return boolean
     * */
    public static boolean isValidEmail(String email) {
        return Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE).matcher(email).find();
    }

    /**
     * Method use to check object null or not
     * @param payload
     * @return boolean isNotBlank
     * */
    public static boolean isNull(Object payload) {
        return payload == null || payload == "" ? true : false;
    }

    /**
     * Method use to check string null or not
     * @param str
     * @return boolean isNotBlank
     * */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    /**
     * Method use to check string null or not
     * @param str
     * @return boolean isBlank
     * */
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * Method use to check log is null or not
     * @param log
     * @return boolean isNull
     * */
    public static boolean isNull(Long log) {
        if (log == null) {
            return true;
        }
        return false;
    }

    /**
     * Method use to check str is null or not
     * @param str
     * @return boolean isNull
     * */
    public static boolean isNull(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * Method use to check bool is null or not
     * @param bool
     * @return boolean isNull
     * */
    public static boolean isNull(Boolean bool) {
        if (bool == null) {
            return true;
        }
        return false;
    }

    /**
     * Method use to check double is null or not
     * @param dou
     * @return boolean isNull
     * */
    public static boolean isNull(Double dou) {
        if (dou == null) {
            return true;
        }
        return false;
    }

    /**
     * Method use to check date is null or not
     * @param dt
     * @return boolean isNull
     * */
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

    /**
     * Method use to get request-Ip
     * @param request
     * @return String getRequestIP
     * */
    public static String getRequestIP(HttpServletRequest request) {
        for (String header: IP_HEADERS) {
            String value = request.getHeader(header);
            logger.info(String.format("Header Name %s & Header Value %s.", header, value));
            if (value == null || value.isEmpty()) {
                continue;
            }
            String[] parts = value.split("\\s*,\\s*");
            return parts[0];
        }
        logger.info(String.format("Header Name Remote-Address & Header Value %s.", request.getRemoteAddr()));
        return request.getRemoteAddr();
    }

    /**
     * Method use to add days into timestamp
     * */
    public static Timestamp addDays(Timestamp date, Long days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days.intValue());
        return new Timestamp(cal.getTime().getTime());
    }
}