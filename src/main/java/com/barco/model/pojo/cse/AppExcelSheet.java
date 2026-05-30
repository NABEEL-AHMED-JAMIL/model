package com.barco.model.pojo.cse;

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

    @Column(name = "sheet_name", nullable = false)
    private String sheetName;

    @Lob
    @Column(name = "columns", nullable = false)
    private String columns;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "is_system", nullable = false)
    private Boolean isSystem = false;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "org_id", nullable = false)
    protected Organization organization;

    public AppExcelSheet() {}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
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
