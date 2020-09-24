package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;


@Entity
@Table(name = "notification_client")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationClient extends BaseEntity {

    @GenericGenerator(
        name = "notificationClientSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "notification_client_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "notificationClientSequenceGenerator")
    private Long id;

    private String sessionId;

    @Column(nullable = false, unique = true)
    private String topicId;

    @Column(nullable = false, unique = true)
    private String clientPath;

    public NotificationClient() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getTopicId() { return topicId; }
    public void setTopicId(String topicId) { this.topicId = topicId; }

    public String getClientPath() { return clientPath; }
    public void setClientPath(String clientPath) { this.clientPath = clientPath; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
