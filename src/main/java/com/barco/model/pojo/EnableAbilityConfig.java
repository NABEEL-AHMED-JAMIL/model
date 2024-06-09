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
@Table(name = "enable_config")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableAbilityConfig extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "enable_id")
    private List<ConditionalLogic> enableLogic;

    public EnableAbilityConfig() {
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

    public List<ConditionalLogic> getEnableLogic() {
        return enableLogic;
    }

    public void setEnableLogic(List<ConditionalLogic> enableLogic) {
        this.enableLogic = enableLogic;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
