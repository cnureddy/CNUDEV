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
public class Application {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="app_id")
	private int appId;
	@Column(name="app_name")
	private String appName;
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
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
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
		return "Application [appId=" + appId + ", appName=" + appName + ", CreatedBy=" + CreatedBy + ", CreationDate="
				+ CreationDate + ", LastUpdatedBy=" + LastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", status="
				+ status + ", delFlag=" + delFlag + "]";
	}
	
	
}
