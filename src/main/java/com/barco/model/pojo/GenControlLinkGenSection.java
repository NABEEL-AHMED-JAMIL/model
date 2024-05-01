package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "gc_link_gs")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenControlLinkGenSection extends BaseEntity {

    @Column(name = "control_order")
    private Long controlOrder;

    @Column(name = "disabled_pattern")
    private String disabledPattern;

    @Column(name = "visible_pattern")
    private String visiblePattern;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "control_id", nullable = false)
    private GenControl genControl;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "section_id", nullable = false)
    private GenSection genSection;

    public GenControlLinkGenSection() {
    }

    public Long getControlOrder() {
        return controlOrder;
    }

    public void setControlOrder(Long controlOrder) {
        this.controlOrder = controlOrder;
    }

    public String getDisabledPattern() {
        return disabledPattern;
    }

    public void setDisabledPattern(String disabledPattern) {
        this.disabledPattern = disabledPattern;
    }

    public String getVisiblePattern() {
        return visiblePattern;
    }

    public void setVisiblePattern(String visiblePattern) {
        this.visiblePattern = visiblePattern;
    }

    public GenControl getGenControl() {
        return genControl;
    }

    public void setGenControl(GenControl genControl) {
        this.genControl = genControl;
    }

    public GenSection getGenSection() {
        return genSection;
    }

    public void setGenSection(GenSection genSection) {
        this.genSection = genSection;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
