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
public class ConfigurationMakerRequest {

    private List<TagInfoRequest> xmlTagsInfo;
    private List<TagInfoRequest> jsonTagsInfo;

    public ConfigurationMakerRequest() {}

    public List<TagInfoRequest> getXmlTagsInfo() {
        return xmlTagsInfo;
    }

    public void setXmlTagsInfo(List<TagInfoRequest> xmlTagsInfo) {
        this.xmlTagsInfo = xmlTagsInfo;
    }

    public List<TagInfoRequest> getJsonTagsInfo() {
        return jsonTagsInfo;
    }

    public void setJsonTagsInfo(List<TagInfoRequest> jsonTagsInfo) {
        this.jsonTagsInfo = jsonTagsInfo;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
