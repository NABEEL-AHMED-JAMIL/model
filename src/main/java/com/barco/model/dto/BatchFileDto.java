package com.barco.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchFileDto {

    private Long id;
    private String type;
    private String fileName;
    private String filePath;
    private Date schedulerDate;
    private String timeZone;
    // file input filed
    @JsonProperty("file")
    private MultipartFile file;
    @JsonProperty("files")
    private List<MultipartFile> files;
    // file download data
    @JsonProperty("download_content")
    private List<MultipartContentResponse> downloadContent;

    public BatchFileDto() { }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getSchedulerDate() {
        return schedulerDate;
    }
    public void setSchedulerDate(Date schedulerDate) {
        this.schedulerDate = schedulerDate;
    }

    public String getTimeZone() {
        return timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class MultipartContentResponse {

        private String type;
        private byte[] content;
        private String fileName;

        public MultipartContentResponse() { }

        public String getType() {
            return type;
        }
        public MultipartContentResponse setType(String type) {
            this.type = type;
            return this;
        }

        public byte[] getContent() {
            return content;
        }
        public MultipartContentResponse setContent(byte[] content) {
            this.content = content;
            return this;
        }

        public String getFileName() {
            return fileName;
        }
        public MultipartContentResponse setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
