package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;


@Entity
@Table(name = "batch_file_process")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchFileProcess extends BaseMasterEntity {

	@GenericGenerator(name = "batchFileProcessSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
	            @Parameter(name = "sequence_name", value = "batch_file_process_Seq"),
                @Parameter(name = "initial_value", value = "1000"),
                @Parameter(name = "increment_size", value = "1")
	})
	@Id
	@GeneratedValue(generator = "batchFileProcessSequenceGenerator")
    private Long id;

    private String type;

    private String fileName;

    private byte[] fileContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    public BatchFileProcess(){}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public byte[] getFileContent() { return fileContent; }
    public void setFileContent(byte[] fileContent) { this.fileContent = fileContent; }

    public AppUser getAppUser() { return appUser; }
    public void setAppUser(AppUser appUser) { this.appUser = appUser; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
