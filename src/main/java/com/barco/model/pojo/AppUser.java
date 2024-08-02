package com.barco.model.pojo;

import com.barco.model.util.lookup.ACCOUNT_TYPE;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_user")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUser extends BaseEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email",
        nullable = false, unique = true)
    private String email;

    @Column(name = "username",
        nullable = false, unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "img")
    private String img;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

    @Column(name = "ip_address")
    private String ipAddress;

    @ManyToMany(cascade = {
       CascadeType.PERSIST, CascadeType.MERGE
    }, fetch = FetchType.LAZY)
    @JoinTable(	name = "app_user_roles",
        joinColumns = @JoinColumn(name = "app_user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> appUserRoles = new HashSet<>();

    // AppUserProfileAccess & AppUserRoleAccess for ui access
    // for admin and super admin for create the user from application
    @OneToMany(mappedBy = "appUser", fetch = FetchType.LAZY)
    private List<AppUserProfileAccess> profilePermissionsAccesses;

    @OneToMany(mappedBy = "appUser", fetch = FetchType.LAZY)
    private List<AppUserRoleAccess> appUserRoleAccesses;

    @OneToMany(mappedBy = "appUser", fetch = FetchType.LAZY)
    private List<AppUserEnv> appUserEnvs;

    @OneToMany(mappedBy = "appUser", fetch = FetchType.LAZY)
    private List<AppUserEventBridge> appUserEventBridges;

    @OneToMany(mappedBy = "appUserParent", fetch = FetchType.LAZY)
    private List<SubAppUser> subAppUsers;

    @ManyToOne
    @JoinColumn(name = "org_id")
    protected Organization organization;

    @Column(name = "account_type")
    @Enumerated(EnumType.ORDINAL)
    private ACCOUNT_TYPE accountType;

    public AppUser() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Set<Role> getAppUserRoles() {
        return appUserRoles;
    }

    public void setAppUserRoles(Set<Role> appUserRoles) {
        this.appUserRoles = appUserRoles;
    }

    public List<AppUserProfileAccess> getProfilePermissionsAccesses() {
        return profilePermissionsAccesses;
    }

    public void setProfilePermissionsAccesses(List<AppUserProfileAccess> profilePermissionsAccesses) {
        this.profilePermissionsAccesses = profilePermissionsAccesses;
    }

    public List<AppUserRoleAccess> getAppUserRoleAccesses() {
        return appUserRoleAccesses;
    }

    public void setAppUserRoleAccesses(List<AppUserRoleAccess> appUserRoleAccesses) {
        this.appUserRoleAccesses = appUserRoleAccesses;
    }

    public List<AppUserEnv> getAppUserEnvs() {
        return appUserEnvs;
    }

    public void setAppUserEnvs(List<AppUserEnv> appUserEnvs) {
        this.appUserEnvs = appUserEnvs;
    }

    public List<AppUserEventBridge> getAppUserEventBridges() {
        return appUserEventBridges;
    }

    public void setAppUserEventBridges(List<AppUserEventBridge> appUserEventBridges) {
        this.appUserEventBridges = appUserEventBridges;
    }

    public List<SubAppUser> getSubAppUsers() {
        return subAppUsers;
    }

    public void setSubAppUsers(List<SubAppUser> subAppUsers) {
        this.subAppUsers = subAppUsers;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public ACCOUNT_TYPE getAccountType() {
        return accountType;
    }

    public void setAccountType(ACCOUNT_TYPE accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
