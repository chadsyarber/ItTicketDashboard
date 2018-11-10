package dataRecords;

import java.sql.Date;

/**
 * Represents the Users table
 * @author Chad Yarber
 *
 */
public class UserRecord {

	private long id;
	private String userName;
	private String password;
	private String email;
	private String budgetCode;
	private String domain;
	private String fullName;
	private String modified;
	private String created;
	private String ldapImported;
	private int permissions;
	private String ldapUid;
	private String homePhone;
	private String workPhone;
	private String mobilePhone;
	private String pagerPhone;
	private int roleId;
	private int amsId;
	private int localeBrowserId;
	private long hdDefaultQueueId;
	private String hdDefaultView;
	private int apiEnabled;
	private int securityNotifications;
	private int salesNotifications;
	private int linkedApplianceId;
	private int primaryDeviceId;
	private String path;
	private int level;
	private String managerId;
	private int locationId;
	private int deviceCount;
	private int isArchived;
	private Date archiveDate;
	private int archivedBy;
	
	public UserRecord() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the budgetCode
	 */
	public String getBudgetCode() {
		return budgetCode;
	}

	/**
	 * @param budgetCode the budgetCode to set
	 */
	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the modified
	 */
	public String getModified() {
		return modified;
	}

	/**
	 * @param modified the modified to set
	 */
	public void setModified(String modified) {
		this.modified = modified;
	}

	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * @return the ldapImported
	 */
	public String getLdapImported() {
		return ldapImported;
	}

	/**
	 * @param ldapImported the ldapImported to set
	 */
	public void setLdapImported(String ldapImported) {
		this.ldapImported = ldapImported;
	}

	/**
	 * @return the permissions
	 */
	public int getPermissions() {
		return permissions;
	}

	/**
	 * @param permissions the permissions to set
	 */
	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}

	/**
	 * @return the ldapUid
	 */
	public String getLdapUid() {
		return ldapUid;
	}

	/**
	 * @param ldapUid the ldapUid to set
	 */
	public void setLdapUid(String ldapUid) {
		this.ldapUid = ldapUid;
	}

	/**
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * @return the workPhone
	 */
	public String getWorkPhone() {
		return workPhone;
	}

	/**
	 * @param workPhone the workPhone to set
	 */
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	/**
	 * @return the mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	/**
	 * @return the pagerPhone
	 */
	public String getPagerPhone() {
		return pagerPhone;
	}

	/**
	 * @param pagerPhone the pagerPhone to set
	 */
	public void setPagerPhone(String pagerPhone) {
		this.pagerPhone = pagerPhone;
	}

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the amsId
	 */
	public int getAmsId() {
		return amsId;
	}

	/**
	 * @param amsId the amsId to set
	 */
	public void setAmsId(int amsId) {
		this.amsId = amsId;
	}

	/**
	 * @return the localeBrowserId
	 */
	public int getLocaleBrowserId() {
		return localeBrowserId;
	}

	/**
	 * @param localeBrowserId the localeBrowserId to set
	 */
	public void setLocaleBrowserId(int localeBrowserId) {
		this.localeBrowserId = localeBrowserId;
	}

	/**
	 * @return the hdDefaultQueueId
	 */
	public long getHdDefaultQueueId() {
		return hdDefaultQueueId;
	}

	/**
	 * @param hdDefaultQueueId the hdDefaultQueueId to set
	 */
	public void setHdDefaultQueueId(long hdDefaultQueueId) {
		this.hdDefaultQueueId = hdDefaultQueueId;
	}

	/**
	 * @return the hdDefaultView
	 */
	public String getHdDefaultView() {
		return hdDefaultView;
	}

	/**
	 * @param hdDefaultView the hdDefaultView to set
	 */
	public void setHdDefaultView(String hdDefaultView) {
		this.hdDefaultView = hdDefaultView;
	}

	/**
	 * @return the apiEnabled
	 */
	public int getApiEnabled() {
		return apiEnabled;
	}

	/**
	 * @param apiEnabled the apiEnabled to set
	 */
	public void setApiEnabled(int apiEnabled) {
		this.apiEnabled = apiEnabled;
	}

	/**
	 * @return the securityNotifications
	 */
	public int getSecurityNotifications() {
		return securityNotifications;
	}

	/**
	 * @param securityNotifications the securityNotifications to set
	 */
	public void setSecurityNotifications(int securityNotifications) {
		this.securityNotifications = securityNotifications;
	}

	/**
	 * @return the salesNotifications
	 */
	public int getSalesNotifications() {
		return salesNotifications;
	}

	/**
	 * @param salesNotifications the salesNotifications to set
	 */
	public void setSalesNotifications(int salesNotifications) {
		this.salesNotifications = salesNotifications;
	}

	/**
	 * @return the linkedApplianceId
	 */
	public int getLinkedApplianceId() {
		return linkedApplianceId;
	}

	/**
	 * @param linkedApplianceId the linkedApplianceId to set
	 */
	public void setLinkedApplianceId(int linkedApplianceId) {
		this.linkedApplianceId = linkedApplianceId;
	}

	/**
	 * @return the primaryDeviceId
	 */
	public int getPrimaryDeviceId() {
		return primaryDeviceId;
	}

	/**
	 * @param primaryDeviceId the primaryDeviceId to set
	 */
	public void setPrimaryDeviceId(int primaryDeviceId) {
		this.primaryDeviceId = primaryDeviceId;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the managerId
	 */
	public String getManagerId() {
		return managerId;
	}

	/**
	 * @param managerId the managerId to set
	 */
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	/**
	 * @return the locationId
	 */
	public int getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the deviceCount
	 */
	public int getDeviceCount() {
		return deviceCount;
	}

	/**
	 * @param deviceCount the deviceCount to set
	 */
	public void setDeviceCount(int deviceCount) {
		this.deviceCount = deviceCount;
	}

	/**
	 * @return the isArchived
	 */
	public int getIsArchived() {
		return isArchived;
	}

	/**
	 * @param isArchived the isArchived to set
	 */
	public void setIsArchived(int isArchived) {
		this.isArchived = isArchived;
	}

	/**
	 * @return the archiveDate
	 */
	public Date getArchiveDate() {
		return archiveDate;
	}

	/**
	 * @param archiveDate the archiveDate to set
	 */
	public void setArchiveDate(Date archiveDate) {
		this.archiveDate = archiveDate;
	}

	/**
	 * @return the archivedBy
	 */
	public int getArchivedBy() {
		return archivedBy;
	}

	/**
	 * @param archivedBy the archivedBy to set
	 */
	public void setArchivedBy(int archivedBy) {
		this.archivedBy = archivedBy;
	}

}
