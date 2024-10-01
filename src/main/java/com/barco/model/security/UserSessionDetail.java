package com.barco.model.security;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.Organization;
import com.barco.model.pojo.Profile;
import com.barco.model.util.lookup.ACCOUNT_TYPE;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserSessionDetail implements UserDetails {

    private Long id;
    private String uuid;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private Profile profile;
    private String profileImage;
    private String ipAddress;
    private Boolean orgAccount = false;
    private Organization organization;
    private ACCOUNT_TYPE accountType;
    private Collection<? extends GrantedAuthority> authorities;

    public UserSessionDetail(String username, String email, String password,
        Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    /**
     * build method provide the auth user detail
     * @param appUser => db user detail wrap into UserDetailsImpl
     * @return UserDetailsImpl
     * */
    public static UserSessionDetail build(AppUser appUser) {
        List<GrantedAuthority> authorities = appUser.getAppUserRoles().stream()
           .filter(role -> role.getStatus().equals(APPLICATION_STATUS.ACTIVE))
           .map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
        UserSessionDetail userSessionDetail = new UserSessionDetail(appUser.getUsername(), appUser.getEmail(), appUser.getPassword(), authorities);
        userSessionDetail.setId(appUser.getId());
        userSessionDetail.setUuid(appUser.getUuid());
        userSessionDetail.setFirstName(appUser.getFirstName());
        userSessionDetail.setLastName(appUser.getLastName());
        userSessionDetail.setIpAddress(appUser.getIpAddress());
        userSessionDetail.setOrgAccount(appUser.getOrgAccount());
        userSessionDetail.setProfileImage(appUser.getImg());
        userSessionDetail.setAccountType(appUser.getAccountType());
        userSessionDetail.setOrganization(appUser.getOrganization());
        // if profile not active so we allow the user to open the api session but not allow to view the ui
        if (appUser.getProfile().getStatus().equals(APPLICATION_STATUS.ACTIVE)) {
            userSessionDetail.setProfile(appUser.getProfile());
        }
        return userSessionDetail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Boolean getOrgAccount() {
        return orgAccount;
    }

    public void setOrgAccount(Boolean orgAccount) {
        this.orgAccount = orgAccount;
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

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

}
