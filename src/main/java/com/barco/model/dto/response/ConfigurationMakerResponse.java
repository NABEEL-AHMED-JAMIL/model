package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigurationMakerResponse {

    private List<TagInfoResponse> xmlTagsInfo;
    private List<TagInfoResponse> jsonTagsInfo;

    public ConfigurationMakerResponse() {}

    public List<TagInfoResponse> getXmlTagsInfo() {
        return xmlTagsInfo;
    }

    public void setXmlTagsInfo(List<TagInfoResponse> xmlTagsInfo) {
        this.xmlTagsInfo = xmlTagsInfo;
    }

    public List<TagInfoResponse> getJsonTagsInfo() {
        return jsonTagsInfo;
    }

    public void setJsonTagsInfo(List<TagInfoResponse> jsonTagsInfo) {
        this.jsonTagsInfo = jsonTagsInfo;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
