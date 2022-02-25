package com.barco.model.pojo;

import com.barco.model.enums.VerificationType;
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
@Table(name = "verification")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Verification extends BaseEntity {

    @GenericGenerator(
        name = "verificationGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
            @Parameter(name = "sequence_name", value = "verification_seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "verificationGenerator")
    private Long verificationId;

    @Column(name = "token", nullable = false)
    private String token;

    @Column(name = "expiry_data")
    private Timestamp expiryDate;

    @Column(name = "is_consumed")
    private Boolean isConsumed;

    @Enumerated(EnumType.STRING)
    @Column(name = "verification_type", nullable = false)
    private VerificationType verificationType;

    @Lob
    @Column(name = "payload")
    private String payload;

    public Verification() {}

    public Long getVerificationId() {
        return verificationId;
    }
    public void setVerificationId(Long verificationId) {
        this.verificationId = verificationId;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getConsumed() {
        return isConsumed;
    }
    public void setConsumed(Boolean consumed) {
        isConsumed = consumed;
    }

    public VerificationType getVerificationType() {
        return verificationType;
    }
    public void setVerificationType(VerificationType verificationType) {
        this.verificationType = verificationType;
    }

    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}