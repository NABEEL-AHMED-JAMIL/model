package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;


/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "gc_interaction")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenControlInteractions extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "gs_link_gf_id", nullable = false)
    private GenSectionLinkGenForm genSectionLinkGenForm;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "control_id", nullable = false)
    private GenControl genControl;

    @Column(name = "disabled_pattern")
    private String disabledPattern;

    @Column(name = "visible_pattern")
    private String visiblePattern;

    public GenControlInteractions() {
    }

    public GenSectionLinkGenForm getGenSectionLinkGenForm() {
        return genSectionLinkGenForm;
    }

    public void setGenSectionLinkGenForm(GenSectionLinkGenForm genSectionLinkGenForm) {
        this.genSectionLinkGenForm = genSectionLinkGenForm;
    }

    public GenControl getGenControl() {
        return genControl;
    }

    public void setGenControl(GenControl genControl) {
        this.genControl = genControl;
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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
