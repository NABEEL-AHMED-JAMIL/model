package com.barco.model.pojo;

import java.sql.Timestamp;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel.amd
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserVerification extends BaseEntity {

    public static final int MAX_LENGTH_CODE = 100;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = MAX_LENGTH_CODE)
    private String token;

    @Column(length = 1)
    private String isConsumed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private User memberId;

    private Timestamp verifyDate;

    public UserVerification() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getIsConsumed() { return isConsumed; }
    public void setIsConsumed(String isConsumed) { this.isConsumed = isConsumed; }

    public User getMemberId() { return memberId; }
    public void setMemberId(User memberId) { this.memberId = memberId; }

    public Timestamp getVerifyDate() { return verifyDate; }
    public void setVerifyDate(Timestamp verifyDate) { this.verifyDate = verifyDate; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
