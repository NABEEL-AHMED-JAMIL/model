package com.barco.model.util;

import com.barco.model.ApplicationDecorator;
import com.barco.model.ResponseObject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.util.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import java.io.IOException;

/**
 * @author Nabeel.amd
 */
@Component
@Scope("prototype")
public class ModelUtil {

    public Logger logger = LogManager.getLogger(ModelUtil.class);

    @Autowired
    private ReturnConstants returnConstants;

    public Object populateDataBeanFromJSON(Class<?> clazz, ApplicationDecorator decorator, String json) {
        Object object = null;
        ObjectMapper mapper = new ObjectMapper().configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        try {
            object = clazz.newInstance();
            if(StringUtils.isNotBlank(json) && !json.equals("\"\"")) {
                object = mapper.readValue(json, clazz);
            }
        } catch(JsonParseException ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
            logger.error(ex.getLocalizedMessage() + " <==================> " + json);
            decorator.setResponseMessage("Invalid JSON");
            decorator.setReturnCode(this.returnConstants.ReturnCodeFailure);
            decorator.getErrors().add("Provided input is not in valid JSON form");
        } catch(JsonMappingException ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
            logger.error(ex.getLocalizedMessage() + " <==================> " + json);
            decorator.setResponseMessage("Invalid JSON");
            decorator.setReturnCode(this.returnConstants.ReturnCodeFailure);
            decorator.getErrors().add("Provided input is not mapping with JSON properties");
        } catch(IOException ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
            logger.error(ex.getLocalizedMessage() + " <==================> " + json);
            decorator.setResponseMessage("Invalid JSON");
            decorator.setReturnCode(this.returnConstants.ReturnCodeFailure);
            decorator.getErrors().add("JSON input/output error");
        } catch(Exception ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
            logger.error(ex.getLocalizedMessage() + " <==================> " + json);
            decorator.setResponseMessage("Invalid JSON");
            decorator.setReturnCode(this.returnConstants.ReturnCodeFailure);
            decorator.getErrors().add("Invalid JSON");
        }
        return object;
    }

    public <T> T populateDataBeanFromJSONArray(final TypeReference<T> typeReference, ApplicationDecorator decorator, String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (T) mapper.readValue(json, typeReference);
        } catch(JsonParseException ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
            decorator.setResponseMessage("Invalid JSON");
            decorator.setReturnCode(this.returnConstants.ReturnCodeFailure);
            decorator.getErrors().add("Provided input is not in valid JSON form");
        } catch(JsonMappingException ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
            decorator.setResponseMessage("Invalid JSON");
            decorator.setReturnCode(this.returnConstants.ReturnCodeFailure);
            decorator.getErrors().add("Provided input is not mapping with properties");
        } catch(IOException ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
            decorator.setResponseMessage("Invalid JSON");
            decorator.setReturnCode(this.returnConstants.ReturnCodeFailure);
            decorator.getErrors().add("JSON input/output error");
        } catch(Exception ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
            decorator.setResponseMessage("Invalid JSON");
            decorator.setReturnCode(this.returnConstants.ReturnCodeFailure);
            decorator.getErrors().add("Invalid JSON");
        }
        return null;
    }

    public String populateJSONFromDataBean(Object object) {
        String json = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(object);
        } catch(JsonGenerationException ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
        } catch(JsonMappingException ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
        } catch(IOException ex) {
            logger.error("*********** Exception ***********", ex.getMessage());
        }
        return json;
    }

    public ResponseObject responseToClient(ApplicationDecorator decorator) {
        ResponseObject responseObject = new ResponseObject();
        if((decorator.getReturnCode() != null && decorator.getReturnCode() == 1005) ||
                !CollectionUtils.isEmpty(decorator.getErrors())) {
            decorator.getResponseMap().put("errors", decorator.getErrors());
            responseObject.setReturnType(decorator.getFailure());
            responseObject.setReturnCode(decorator.getReturnCode());
            responseObject.setReturnMessage(decorator.getResponseMessage());
            responseObject.setReturnData(decorator.getResponseMap());
            responseObject.setQueryTimeInMilli(decorator.getQueryTime());
        } else {
            if(decorator.getInfo().size() > 0) {
                decorator.getResponseMap().put("info", decorator.getInfo());
            }
            decorator.getResponseMap().put("response", decorator.getDataBean());
            responseObject.setReturnType(decorator.getSuccess());
            responseObject.setReturnCode(decorator.getReturnCode());
            responseObject.setReturnMessage(decorator.getResponseMessage());
            responseObject.setReturnData(decorator.getResponseMap());
            responseObject.setQueryTimeInMilli(decorator.getQueryTime());
        }
        return responseObject;
    }
}
