package com.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application.config.db")
public class ApplicationConfigurationProperties {

	private String username;

	private String password;

	private String url;

	private int port;

	private String schema;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	@Override
	public String toString() {
		return "ApplicationConfigurationProperties [username=" + username + ", password=" + password + ", url=" + url
				+ ", port=" + port + ", schema=" + schema + ", getUsername()=" + getUsername() + ", getPassword()="
				+ getPassword() + ", getUrl()=" + getUrl() + ", getPort()=" + getPort() + ", getSchema()=" + getSchema()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
