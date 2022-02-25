package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_user")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUser extends BaseEntity implements UserDetails, Serializable {

    @GenericGenerator(
        name = "appUserSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "appUser_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "appUserSequenceGenerator")
    private Long appUserId;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "firstName", nullable = false, length = 50)
    private String firstName;

    @Column(name = "lastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "profile_img_path")
    private String profileImgPath;

    @Column(name = "last_login_at")
    private Timestamp lastLoginAt;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "app_sub_user",
        joinColumns = @JoinColumn(name = "parent_user_id", referencedColumnName = "appUserId"),
        inverseJoinColumns = @JoinColumn(name = "sub_user_id", referencedColumnName = "appUserId"))
    private Set<AppUser> subUser;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_authority",
        joinColumns = @JoinColumn(name = "app_user_id", referencedColumnName = "appUserId"),
        inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "authorityId"))
    private List<Authority> authorities;

    @ManyToOne
    @JoinColumn(name="accessServices", nullable=false)
    private AccessService accessServices;

    @ManyToOne
    @JoinColumn(name="company", nullable=false)
    private Company company;

    @ManyToOne
    @JoinColumn(name="portalProfile", nullable=false)
    private PortalProfile portalProfile;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    public AppUser() {}

    public Long getAppUserId() {
        return appUserId;
    }
    public void setAppUserId(Long appUserId) {
        this.appUserId = appUserId;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getLastLoginAt() {
        return lastLoginAt;
    }
    public void setLastLoginAt(Timestamp lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public String getProfileImgPath() {
        return profileImgPath;
    }
    public void setProfileImgPath(String profileImgPath) {
        this.profileImgPath = profileImgPath;
    }

    public Set<AppUser> getSubUser() {
        return subUser;
    }
    public void setSubUser(Set<AppUser> subUser) {
        this.subUser = subUser;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    public AccessService getAccessServices() {
        return accessServices;
    }
    public void setAccessServices(AccessService accessServices) {
        this.accessServices = accessServices;
    }

    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    public PortalProfile getPortalProfile() {
        return portalProfile;
    }
    public void setPortalProfile(PortalProfile portalProfile) {
        this.portalProfile = portalProfile;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}