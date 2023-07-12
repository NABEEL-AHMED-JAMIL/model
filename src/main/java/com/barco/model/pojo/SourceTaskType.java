package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "stt")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceTaskType {

    @GenericGenerator(
        name = "sourceTaskTypeSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "source_task_type_source_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @Column(name="stt_id", unique=true, nullable=false)
    @GeneratedValue(generator = "sourceTaskTypeSequenceGenerator")
    private Long sttId;

    @Column(name = "service_name", nullable = false)
    private String serviceName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "task_type",
        nullable = false, updatable = false)
    private Long taskType;

    @Column(name = "home_page")
    private String homePage;

    @Column(name = "service_id", unique = true)
    private String serviceId;

    @ManyToOne
    @JoinColumn(name="credential_id")
    private Credential credential;

    @Column(name = "status", nullable = false)
    private Long status;

    /**default source task type for testing
     * if its default then no delete to delete*/
    @Column(name = "delete_able",
        columnDefinition = "boolean default false")
    private Boolean deleteAble;

    @ManyToOne
    @JoinColumn(name="app_user_id")
    private AppUser appUser;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="api_task_type")
    private ApiTaskType apiTaskType;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="kafka_type_type")
    private KafkaTaskType kafkaTaskType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sttf_id")
    private STTForm sttf;

    @Column(name = "date_created", nullable = false)
    private Timestamp dateCreated;

    public SourceTaskType() {}

    @PrePersist
    protected void onCreate() {
        this.dateCreated = new Timestamp(System.currentTimeMillis());
    }

    public Long getSttId() {
        return sttId;
    }

    public void setSttId(Long sttId) {
        this.sttId = sttId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTaskType() {
        return taskType;
    }

    public void setTaskType(Long taskType) {
        this.taskType = taskType;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Boolean getDeleteAble() {
        return deleteAble;
    }

    public void setDeleteAble(Boolean deleteAble) {
        this.deleteAble = deleteAble;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public ApiTaskType getApiTaskType() {
        return apiTaskType;
    }

    public void setApiTaskType(ApiTaskType apiTaskType) {
        this.apiTaskType = apiTaskType;
    }

    public KafkaTaskType getKafkaTaskType() {
        return kafkaTaskType;
    }

    public void setKafkaTaskType(KafkaTaskType kafkaTaskType) {
        this.kafkaTaskType = kafkaTaskType;
    }

    public STTForm getSttf() {
        return sttf;
    }

    public void setSttf(STTForm sttf) {
        this.sttf = sttf;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
