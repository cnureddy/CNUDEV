package com.example.demo.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Integration {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="application_id")
	private int applicationId;
	@Column(name="application_name")
	private String applicationName;
	@Column(name="app_id")
	private int appId;
	@Column(name="client_id")
	private String clientId;
	@Column(name="client_secret")
	private String clientSecret;
	@Column(name="red_url")
	private String redUrl;

	@Column(name="Created_by")
	private int CreatedBy;
	@Column(name="Creation_date")
	private Date CreationDate;
	@Column(name="Last_updated_by")
	private int LastUpdatedBy;
	@Column(name="last_update_date")
	private Date lastUpdateDate;
	@Column(name="status")
	private int status;
	@Column(name="del_flag")
	private int delFlag;
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	public String getRedUrl() {
		return redUrl;
	}
	public void setRedUrl(String redUrl) {
		this.redUrl = redUrl;
	}
	public int getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(int createdBy) {
		CreatedBy = createdBy;
	}
	public Date getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}
	public int getLastUpdatedBy() {
		return LastUpdatedBy;
	}
	public void setLastUpdatedBy(int lastUpdatedBy) {
		LastUpdatedBy = lastUpdatedBy;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
	}
	@Override
	public String toString() {
		return "Integration [applicationId=" + applicationId + ", applicationName=" + applicationName + ", appId="
				+ appId + ", clientId=" + clientId + ", clientSecret=" + clientSecret + ", redUrl=" + redUrl
				+ ", CreatedBy=" + CreatedBy + ", CreationDate=" + CreationDate + ", LastUpdatedBy=" + LastUpdatedBy
				+ ", lastUpdateDate=" + lastUpdateDate + ", status=" + status + ", delFlag=" + delFlag + "]";
	}

	
}
