package com.barco.model.util.lookuputil;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum SCRAPING_FILE_TYPE {

    CSV(0l), PDF(1l), TXT(2l),
    XLS(3l), XLSX(4l), XML(5l);

    private Long lookupCode;

    SCRAPING_FILE_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return SCRAPING_FILE_TYPE.class.getSimpleName();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
