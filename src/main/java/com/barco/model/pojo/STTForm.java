package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "stt_form")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class STTForm {

    @GenericGenerator(
        name = "sttFormSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "sttForm_source_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @Column(name="sttf_id", unique=true, nullable=false)
    @GeneratedValue(generator = "sttFormSequenceGenerator")
    private Long sttfId;

    @Column(name = "sttf_name", nullable = false)
    private String sttfName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "delete_able",
        columnDefinition = "boolean default false")
    private Boolean deleteAble;

    // service form | other form
    @Column(name = "form_type", nullable = false)
    private Long formType;

    @OneToMany(mappedBy="sttf")
    private List<STTFormLinkSection> sttfLinkSections = new ArrayList<>();

    // status of job (active or disable or delete)
    @Column(name = "status", nullable = false)
    private Long status;

    @ManyToOne
    @JoinColumn(name="app_user_id")
    private AppUser appUser;

    @Column(name = "date_created", nullable = false)
    private Timestamp dateCreated;

    public STTForm() {}

    @PrePersist
    protected void onCreate() {
        this.dateCreated = new Timestamp(System.currentTimeMillis());
    }

    public Long getSttfId() {
        return sttfId;
    }

    public void setSttfId(Long sttfId) {
        this.sttfId = sttfId;
    }

    public String getSttfName() {
        return sttfName;
    }

    public void setSttfName(String sttfName) {
        this.sttfName = sttfName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDeleteAble() {
        return deleteAble;
    }

    public void setDeleteAble(Boolean deleteAble) {
        this.deleteAble = deleteAble;
    }

    public Long getFormType() {
        return formType;
    }

    public void setFormType(Long formType) {
        this.formType = formType;
    }

    public List<STTFormLinkSection> getSttfLinkSections() {
        return sttfLinkSections;
    }

    public void setSttfLinkSections(List<STTFormLinkSection> sttfLinkSections) {
        this.sttfLinkSections = sttfLinkSections;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
