package com.barco.model.repository.projection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Lightweight projection for organization JWT key fields used during authentication.
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OrganizationKeyProjection {

    public String getKeyId();

    public byte[] getPrivateKey();

    public byte[] getPublicKey();

}

