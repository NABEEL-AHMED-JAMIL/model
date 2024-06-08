package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */

@Entity
@Table(name = "visible_config")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VisibilityConfig extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "visible_id")
    private List<ConditionalLogic> visibleLogic;

    public VisibilityConfig() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ConditionalLogic> getVisibleLogic() {
        return visibleLogic;
    }

    public void setVisibleLogic(List<ConditionalLogic> visibleLogic) {
        this.visibleLogic = visibleLogic;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
