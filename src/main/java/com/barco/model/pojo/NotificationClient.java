package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel.amd
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationClient extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String topicId; // uuid

    @Column(nullable = false, unique = true)
    private String clientPath;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private User memberId;

    private Boolean isConnection;

    public NotificationClient() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTopicId() { return topicId; }
    public void setTopicId(String topicId) { this.topicId = topicId; }

    public String getClientPath() { return clientPath; }
    public void setClientPath(String clientPath) { this.clientPath = clientPath; }

    public User getMemberId() { return memberId; }
    public void setMemberId(User memberId) { this.memberId = memberId; }

    public Boolean getConnection() { return isConnection; }
    public void setConnection(Boolean connection) { isConnection = connection; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
