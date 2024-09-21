package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionUser {

	private Long id;
	private String uuid;
	private String email;
	private String username;

	public SessionUser() {
	}

	public SessionUser(String username) {
		this.username = username;
	}

	public SessionUser(Long id, String email, String username) {
		this.id = id;
		this.email = email;
		this.username = username;
	}

	public SessionUser(String uuid, String email, String username) {
		this.uuid = uuid;
		this.email = email;
		this.username = username;
	}

	public SessionUser(Long id, String uuid, String email, String username) {
		this.id = id;
		this.uuid = uuid;
		this.email = email;
		this.username = username;
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

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}
