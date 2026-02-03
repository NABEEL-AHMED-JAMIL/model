package com.barco.model.util;

import com.barco.model.dto.request.ConfigurationMakerRequest;
import com.barco.model.dto.request.TagInfoRequest;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.*;

/**
 * Utility class to create JSON from ConfigurationMakerRequest
 * Supports deep nested structures and arrays
 */
@Component
public class JsonOutTagInfoUtil {

    private final Logger logger = LoggerFactory.getLogger(JsonOutTagInfoUtil.class);

    private final Gson gson = new Gson();

    /**
     * Create JSON string from ConfigurationMakerRequest
     */
    public String makeJson(ConfigurationMakerRequest jsonMakerRequest) {
        logger.info("Process for JSON Create Start");
        Map<String, Object> jsonMap = new HashMap<>();
        if (jsonMakerRequest.getJsonTagsInfo() != null) {
            for (TagInfoRequest tagInfoRequest : jsonMakerRequest.getJsonTagsInfo()) {
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
        logger.info(json);
        logger.info("Process for JSON Create End");
        return json;
    }

    /**
     * Add element to JSON map at deep path
     * Supports arrays if multiple objects share same parent
     */
    @SuppressWarnings("unchecked")
    private void addJsonElement(Map<String, Object> jsonMap, String parentKeyPath, String key, String value) {
        String[] pathParts = parentKeyPath.split("\\.");
        Map<String, Object> currentMap = jsonMap;
        for (int i = 0; i < pathParts.length; i++) {
            String part = pathParts[i];
            if (i == pathParts.length - 1) {
                Object existing = currentMap.get(part);
                if (existing == null) {
                    Map<String, Object> newMap = new HashMap<>();
                    newMap.put(key, value != null ? value : "");
                    currentMap.put(part, newMap);
                } else if (existing instanceof Map) {
                    ((Map<String, Object>) existing).put(key, value != null ? value : "");
                } else if (existing instanceof List) {
                    Map<String, Object> newMap = new HashMap<>();
                    newMap.put(key, value != null ? value : "");
                    ((List<Object>) existing).add(newMap);
                }
            } else {
                currentMap.putIfAbsent(part, new HashMap<String, Object>());
                Object next = currentMap.get(part);
                if (!(next instanceof Map)) {
                    next = new HashMap<String, Object>();
                    currentMap.put(part, next);
                }
                currentMap = (Map<String, Object>) next;
            }
        }
    }

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
