package com.barco.model.pojo.cse;

import com.barco.model.pojo.NamedTokenDetail;
import com.barco.model.pojo.BaseEntity;
import com.barco.model.pojo.aoe.Organization;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_excel_sheet")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppExcelSheet extends BaseEntity {

    @Embedded
    private NamedTokenDetail tokenDetail;

    @Column(name = "sheet_name", nullable = false)
    private String sheetName;

    @Lob
    @Column(name = "columns", nullable = false)
    private String columns;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "org_id")
    protected Organization organization;

    public AppExcelSheet() {}

    public NamedTokenDetail getTokenDetail() {
        return tokenDetail;
    }

    public void setTokenDetail(NamedTokenDetail tokenDetail) {
        this.tokenDetail = tokenDetail;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
