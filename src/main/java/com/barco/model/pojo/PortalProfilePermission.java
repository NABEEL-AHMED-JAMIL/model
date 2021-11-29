package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "portal_profile_permission")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortalProfilePermission extends BaseEntity {

    @GenericGenerator(
        name = "portalProfilePermissionSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "portal_profile_permission_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "portalProfilePermissionSequenceGenerator")
    private Long id;

    @ManyToOne
    @JoinColumn(name="portalProfile", nullable=false)
    private PortalProfile portalProfile;

    @ManyToOne
    @JoinColumn(name="portalProfilePermission", nullable=false)
    private PortalProfilePermission portalProfilePermission;

    public PortalProfilePermission() { }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public PortalProfile getPortalProfile() {
        return portalProfile;
    }
    public void setPortalProfile(PortalProfile portalProfile) {
        this.portalProfile = portalProfile;
    }

    public PortalProfilePermission getPortalProfilePermission() {
        return portalProfilePermission;
    }
    public void setPortalProfilePermission(PortalProfilePermission portalProfilePermission) {
        this.portalProfilePermission = portalProfilePermission;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
