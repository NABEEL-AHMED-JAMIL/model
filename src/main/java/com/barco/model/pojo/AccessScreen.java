package com.barco.model.pojo;

import com.barco.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "access_screen")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessScreen {

    @GenericGenerator(
        name = "accessScreenSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "accessScreen_Seq"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1000"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "accessScreenSequenceGenerator")
    private Long id;

    private String screenName;

    @Column(nullable = false)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authority_id")
    private Authority authority;

    public AccessScreen() { }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getScreenName() {
        return screenName;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Authority getAuthority() {
        return authority;
    }
    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
