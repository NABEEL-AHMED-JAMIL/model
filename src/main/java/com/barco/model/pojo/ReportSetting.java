package com.barco.model.pojo;

import com.barco.model.util.lookup.PAYLOAD_REF;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "report_setting")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportSetting extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "group_type", nullable = false)
    private String groupType;

    @Column(name = "description", nullable = false)
    private String description;

    // if its form ref then have to give the ref of form
    @Column(name = "payload_ref", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private PAYLOAD_REF payloadRef;

    @Column(name = "is_pdf", nullable = false)
    private Boolean isPdf;

    @Column(name = "pdf_url")
    private String pdfUrl;

    @Column(name = "is_xlsx", nullable = false)
    private Boolean isXlsx;

    @Column(name = "xlsx_url")
    private String xlsxUrl;

    @Column(name = "is_csv", nullable = false)
    private Boolean isCsv;

    @Column(name = "csv_url")
    private String csvUrl;

    @Column(name = "data_url")
    private String dataUrl;

    @Column(name = "fd_url")
    private String firstDimensionUrl;

    @Column(name = "fd_lkv")
    private String firstLKValue;

    @Column(name = "sd_url")
    private String secondDimensionUrl;

    @Column(name = "sd_lkv")
    private String secondLKValue;

    @Column(name = "td_url")
    private String thirdDimensionUrl;

    @Column(name = "td_lkv")
    private String thirdLKValue;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "form_id")
    private GenForm genForm;

    public ReportSetting() {
    }



    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
