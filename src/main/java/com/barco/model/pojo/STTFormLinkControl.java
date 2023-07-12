package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "lkf_form_control")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class STTFormLinkControl {

    @GenericGenerator(
        name = "sttFormLinkControlSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "lkf_form_control_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @Column(name = "lkf_control_id")
    @GeneratedValue(generator = "sttFormLinkControlSequenceGenerator")
    private Long lkfControlId;

    @Column(name = "lkf_control_uuid", nullable = false)
    private UUID lkfControlUUid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lkf_section_id", nullable = false)
    private STTFormLinkSection sttFormLinkSection;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sttc_id", nullable = false)
    private STTControl sttc;

    @Column(name = "sttc_order", nullable = false)
    private Long sttcOrder;

    @Column(name = "status",nullable = false)
    private Long status;

    @Column(name = "date_created", nullable = false)
    private Timestamp dateCreated;

    public STTFormLinkControl() {}

    @PrePersist
    protected void onCreate() {
        this.lkfControlUUid = UUID.randomUUID();
        this.dateCreated = new Timestamp(System.currentTimeMillis());
    }

    public Long getLkfControlId() {
        return lkfControlId;
    }

    public void setLkfControlId(Long lkfControlId) {
        this.lkfControlId = lkfControlId;
    }

    public UUID getLkfControlUUid() {
        return lkfControlUUid;
    }

    public void setLkfControlUUid(UUID lkfControlUUid) {
        this.lkfControlUUid = lkfControlUUid;
    }

    public STTFormLinkSection getSttFormLinkSection() {
        return sttFormLinkSection;
    }

    public void setSttFormLinkSection(STTFormLinkSection sttFormLinkSection) {
        this.sttFormLinkSection = sttFormLinkSection;
    }

    public STTControl getSttc() {
        return sttc;
    }

    public void setSttc(STTControl sttc) {
        this.sttc = sttc;
    }

    public Long getSttcOrder() {
        return sttcOrder;
    }

    public void setSttcOrder(Long sttcOrder) {
        this.sttcOrder = sttcOrder;
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
