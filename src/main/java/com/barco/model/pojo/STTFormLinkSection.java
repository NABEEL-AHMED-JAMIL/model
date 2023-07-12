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
import java.util.UUID;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "lkf_form_section")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class STTFormLinkSection {

    @GenericGenerator(
        name = "sttFormLinkSectionSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "lkf_form_section_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @Column(name = "lkf_section_id")
    @GeneratedValue(generator = "sttFormLinkSectionSequenceGenerator")
    private Long lkfSectionId;

    @Column(name = "lkf_section_uuid", nullable = false)
    private UUID lkfSectionUUid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sttf_id", nullable = false)
    private STTForm sttf;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stts_id", nullable = false)
    private STTSection stts;

    @Column(name = "stts_order", nullable = false)
    private Long sttsOrder;

    @OneToMany(mappedBy="sttFormLinkSection")
    private List<STTFormLinkControl> sttFormLinkControls = new ArrayList<>();

    @Column(name = "status",nullable = false)
    private Long status;

    @Column(name = "date_created", nullable = false)
    private Timestamp dateCreated;

    public STTFormLinkSection() {}

    @PrePersist
    protected void onCreate() {
        this.lkfSectionUUid = UUID.randomUUID();
        this.dateCreated = new Timestamp(System.currentTimeMillis());
    }

    public Long getLkfSectionId() {
        return lkfSectionId;
    }

    public void setLkfSectionId(Long lkfSectionId) {
        this.lkfSectionId = lkfSectionId;
    }

    public UUID getLkfSectionUUid() {
        return lkfSectionUUid;
    }

    public void setLkfSectionUUid(UUID lkfSectionUUid) {
        this.lkfSectionUUid = lkfSectionUUid;
    }

    public STTForm getSttf() {
        return sttf;
    }

    public void setSttf(STTForm sttf) {
        this.sttf = sttf;
    }

    public STTSection getStts() {
        return stts;
    }

    public void setStts(STTSection stts) {
        this.stts = stts;
    }

    public Long getSttsOrder() {
        return sttsOrder;
    }

    public void setSttsOrder(Long sttsOrder) {
        this.sttsOrder = sttsOrder;
    }

    public List<STTFormLinkControl> getSttFormLinkControls() {
        return sttFormLinkControls;
    }

    public void setSttFormLinkControls(List<STTFormLinkControl> sttFormLinkControls) {
        this.sttFormLinkControls = sttFormLinkControls;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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
