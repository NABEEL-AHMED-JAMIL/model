package com.barco.model.util;

import com.barco.model.dto.request.ConfigurationMakerRequest;
import com.barco.model.dto.request.TagInfoRequest;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Nabeel Ahmed
 */
@Component
public class JsonOutTagInfoUtil {

    private final Logger logger = LoggerFactory.getLogger(JsonOutTagInfoUtil.class);

    private final Gson gson = new Gson();

    /**
     * Method to make JSON from the request
     * @param jsonMakerRequest
     * @return String
     */
    public String makeJson(ConfigurationMakerRequest jsonMakerRequest) {
        logger.info("Process for JSON Create Start");

        Map<String, Object> jsonMap = new HashMap<>();

        if (jsonMakerRequest.getXmlTagsInfo() != null) {
            for (TagInfoRequest tagInfoRequest : jsonMakerRequest.getXmlTagsInfo()) {
                String tagKey = tagInfoRequest.getTagKey();
                String tagParent = tagInfoRequest.getTagParent();
                String tagValue = tagInfoRequest.getTagValue();

                if (tagParent != null && !tagParent.isEmpty()) {
                    addJsonElement(jsonMap, tagParent, tagKey, tagValue);
                } else {
                    jsonMap.put(tagKey, tagValue != null ? tagValue : "");
                }
            }
        }

        String json = gson.toJson(jsonMap);
        logger.info("Process for JSON Create End");
        return json;
    }

    @SuppressWarnings("unchecked")
    private void addJsonElement(Map<String, Object> jsonMap, String parentKey, String key, String value) {
        if (!jsonMap.containsKey(parentKey)) {
            jsonMap.put(parentKey, new HashMap<String, Object>());
        }

        Map<String, Object> parentMap = (Map<String, Object>) jsonMap.get(parentKey);
        parentMap.put(key, value != null ? value : "");
    }

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
