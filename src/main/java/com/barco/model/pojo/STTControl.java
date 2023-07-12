package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "stt_control")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class STTControl {

    @GenericGenerator(
        name = "sttControlSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "sttControl_source_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @Column(name="sttc_id", unique=true, nullable=false)
    @GeneratedValue(generator = "sttControlSequenceGenerator")
    private Long sttcId;

    @Column(name = "sttc_name", nullable=false)
    private String sttcName;

    @Column(name = "description", nullable = false)
    private String description;

    // select,multiple select, need the lookup value
    @Column(name = "filed_type")
    private String filedType;

    // label name
    @Column(name = "filed_title", nullable = false)
    private String filedTitle;

    // filed name not be space
    @Column(name = "filed_name", nullable = false)
    private String filedName;

    @Column(name = "place_holder")
    private String placeHolder;

    @Column(name = "filed_width")
    private Long filedWidth;

    @Column(name = "min_length")
    private Long minLength;

    @Column(name = "max_length")
    private Long maxLength;

    // for drop down
    @Column(name = "filed_lk_value")
    private String filedLkValue;

    @Column(name = "disabled",
        columnDefinition = "boolean default false")
    private Boolean disabled;

    @Column(name = "delete_able",
        columnDefinition = "boolean default false")
    private Boolean deleteAble;

    @Column(name = "pattern")
    private String pattern;

    @ManyToOne
    @JoinColumn(name = "parent_sttc_id")
    protected STTControl parentSttControl;

    @OneToMany(mappedBy = "parentSttControl",
        fetch = FetchType.LAZY)
    protected Set<STTControl> sttControlChildren;

    @Column(name = "array_control")
    private Boolean arrayControl;

    @Column(name = "status", nullable = false)
    private Long status;

    @ManyToOne
    @JoinColumn(name="app_user_id")
    private AppUser appUser;

    @Column(name = "date_created", nullable = false)
    private Timestamp dateCreated;

    public STTControl() {
    }

    @PrePersist
    protected void onCreate() {
        this.dateCreated = new Timestamp(System.currentTimeMillis());
    }

    public Long getSttcId() {
        return sttcId;
    }

    public void setSttcId(Long sttcId) {
        this.sttcId = sttcId;
    }

    public String getSttcName() {
        return sttcName;
    }

    public void setSttcName(String sttcName) {
        this.sttcName = sttcName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFiledType() {
        return filedType;
    }

    public void setFiledType(String filedType) {
        this.filedType = filedType;
    }

    public String getFiledTitle() {
        return filedTitle;
    }

    public void setFiledTitle(String filedTitle) {
        this.filedTitle = filedTitle;
    }

    public String getFiledName() {
        return filedName;
    }

    public void setFiledName(String filedName) {
        this.filedName = filedName;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public Long getFiledWidth() {
        return filedWidth;
    }

    public void setFiledWidth(Long filedWidth) {
        this.filedWidth = filedWidth;
    }

    public Long getMinLength() {
        return minLength;
    }

    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    public Long getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    public String getFiledLkValue() {
        return filedLkValue;
    }

    public void setFiledLkValue(String filedLkValue) {
        this.filedLkValue = filedLkValue;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean getDeleteAble() {
        return deleteAble;
    }

    public void setDeleteAble(Boolean deleteAble) {
        this.deleteAble = deleteAble;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public STTControl getParentSttControl() {
        return parentSttControl;
    }

    public void setParentSttControl(STTControl parentSttControl) {
        this.parentSttControl = parentSttControl;
    }

    public Set<STTControl> getSttControlChildren() {
        return sttControlChildren;
    }

    public void setSttControlChildren(Set<STTControl> sttControlChildren) {
        this.sttControlChildren = sttControlChildren;
    }

    public Boolean getArrayControl() {
        return arrayControl;
    }

    public void setArrayControl(Boolean arrayControl) {
        this.arrayControl = arrayControl;
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
