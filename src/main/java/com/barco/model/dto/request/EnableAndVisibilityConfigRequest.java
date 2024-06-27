package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableAndVisibilityConfigRequest {

    private Long id;
    private String name;
    private String description;
    private Long status;
    private Long conditionType;
    private List<ConditionalLogicRequest> visibleLogic;
    private SessionUser sessionUser;

    public EnableAndVisibilityConfigRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getConditionType() {
        return conditionType;
    }

    public void setConditionType(Long conditionType) {
        this.conditionType = conditionType;
    }

    public List<ConditionalLogicRequest> getVisibleLogic() {
        return visibleLogic;
    }

    public void setVisibleLogic(List<ConditionalLogicRequest> visibleLogic) {
        this.visibleLogic = visibleLogic;
    }

    public SessionUser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
