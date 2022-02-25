package com.barco.model.pojo;

import com.barco.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.security.core.GrantedAuthority;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 * this class help to handle the auth process on api side
 */
@Entity
@Table(name = "authority")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Authority extends BaseEntity implements GrantedAuthority {

    @GenericGenerator(
        name = "authoritySequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "authority_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "authoritySequenceGenerator")
    private Long authorityId;

    @Column(name = "role", nullable = false,
            unique = true, length = 50)
    private String role;

    public Authority() {}

    public Authority(Long createdBy, Status status, String role) {
        super(createdBy, status);
        this.role = role;
    }

    public Long getAuthorityId() {
        return authorityId;
    }
    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return getRole();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}