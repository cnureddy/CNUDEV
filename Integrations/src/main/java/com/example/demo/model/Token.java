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
public class Token {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="token_id")
	private int tokenId;
	@Column(name="application_id")
	private int applicationId;
	@Column(name="token")
	private int token;
	@Column(name="email")
	private String email;
	@Column(name="expires_on")
	private String expiresOn;

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
	public int getTokenId() {
		return tokenId;
	}
	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public int getToken() {
		return token;
	}
	public void setToken(int token) {
		this.token = token;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExpiresOn() {
		return expiresOn;
	}
	public void setExpiresOn(String expiresOn) {
		this.expiresOn = expiresOn;
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
		return "Token [tokenId=" + tokenId + ", applicationId=" + applicationId + ", token=" + token + ", email="
				+ email + ", expiresOn=" + expiresOn + ", CreatedBy=" + CreatedBy + ", CreationDate=" + CreationDate
				+ ", LastUpdatedBy=" + LastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", status=" + status
				+ ", delFlag=" + delFlag + "]";
	}
	
	
	
}
