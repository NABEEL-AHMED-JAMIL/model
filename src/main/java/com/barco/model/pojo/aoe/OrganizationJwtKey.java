package com.barco.model.pojo.aoe;

import com.barco.model.pojo.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(
    name = "organization_jwt_key",
    uniqueConstraints = @UniqueConstraint(
        name = "uk_organization_jwt_key",
        columnNames = {
            "org_id",
            "key_id",
        }
    )
)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrganizationJwtKey extends BaseEntity {

    // kid in JWT header
    @Column(name = "key_id", nullable = false, length = 255)
    private String keyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id", nullable = false)
    private Organization organization;

    // AES-encrypted private key (store as TEXT/CLOB)
    @Lob
    @Column(name = "private_key",
        columnDefinition = "BYTEA", nullable = false)
    private byte[] privateKey;

    // PEM or Base64 encoded (store as TEXT/CLOB)
    @Lob
    @Column(name = "public_key",
        columnDefinition = "BYTEA", nullable = false)
    private byte[] publicKey;

    public OrganizationJwtKey() {}

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public byte[] getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(byte[] publicKey) {
        this.publicKey = publicKey;
    }
    
    public byte[] getPrivateKey() {
        return privateKey;
    }
    
    public void setPrivateKey(byte[] privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public String toString() {
        OrganizationJwtKey copy = new OrganizationJwtKey();
        copy.setId(this.getId());
        copy.setOrganization(this.getOrganization());
        copy.setKeyId(this.getKeyId());
        return new Gson().toJson(copy);
    }

}
