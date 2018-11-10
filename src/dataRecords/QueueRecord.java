package dataRecords;

/**
 * Represents the HD_QUEUE table
 * @author Owner
 *
 */
public class QueueRecord {
	
	private long id;
	private String name;
	private String emailUser;
	private String popUsername;
	private String popPassword;
	private int popSSL;
	private long defaultPriorityId;
	private long defaultStatusId;
	private long defaultImpactId;
	private long defaultCategoryId;
	private boolean createUsersOnEmail;
	private String altEmailAddr;
	private int allowAllUsers;
	private int allowDelete;
	private int allowParentClose;
	private int allowOwnersViaAdminUi;
	private String archiveInterval;
	private String purgeInterval;
	private String popServer;
	private String smtpServer;
	private String smtpUsername;
	private String smtpPasswordEnc;
	private int smtpPort;
	private int ownersOnlyComments;
	private int conflictWarningEnabled;
	private int showNewTicketComments;
	private int showNewTicketAttachments;
	

	public QueueRecord() {
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the emailUser
	 */
	public String getEmailUser() {
		return emailUser;
	}


	/**
	 * @param emailUser the emailUser to set
	 */
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}


	/**
	 * @return the popUsername
	 */
	public String getPopUsername() {
		return popUsername;
	}


	/**
	 * @param popUsername the popUsername to set
	 */
	public void setPopUsername(String popUsername) {
		this.popUsername = popUsername;
	}


	/**
	 * @return the popPassword
	 */
	public String getPopPassword() {
		return popPassword;
	}


	/**
	 * @param popPassword the popPassword to set
	 */
	public void setPopPassword(String popPassword) {
		this.popPassword = popPassword;
	}


	/**
	 * @return the popSSL
	 */
	public int getPopSSL() {
		return popSSL;
	}


	/**
	 * @param popSSL the popSSL to set
	 */
	public void setPopSSL(int popSSL) {
		this.popSSL = popSSL;
	}


	/**
	 * @return the defaultPriorityId
	 */
	public long getDefaultPriorityId() {
		return defaultPriorityId;
	}


	/**
	 * @param defaultPriorityId the defaultPriorityId to set
	 */
	public void setDefaultPriorityId(long defaultPriorityId) {
		this.defaultPriorityId = defaultPriorityId;
	}


	/**
	 * @return the defaultStatusId
	 */
	public long getDefaultStatusId() {
		return defaultStatusId;
	}


	/**
	 * @param defaultStatusId the defaultStatusId to set
	 */
	public void setDefaultStatusId(long defaultStatusId) {
		this.defaultStatusId = defaultStatusId;
	}


	/**
	 * @return the defaultImpactId
	 */
	public long getDefaultImpactId() {
		return defaultImpactId;
	}


	/**
	 * @param defaultImpactId the defaultImpactId to set
	 */
	public void setDefaultImpactId(long defaultImpactId) {
		this.defaultImpactId = defaultImpactId;
	}


	/**
	 * @return the defaultCategoryId
	 */
	public long getDefaultCategoryId() {
		return defaultCategoryId;
	}


	/**
	 * @param defaultCategoryId the defaultCategoryId to set
	 */
	public void setDefaultCategoryId(long defaultCategoryId) {
		this.defaultCategoryId = defaultCategoryId;
	}


	/**
	 * @return the createUsersOnEmail
	 */
	public boolean isCreateUsersOnEmail() {
		return createUsersOnEmail;
	}


	/**
	 * @param createUsersOnEmail the createUsersOnEmail to set
	 */
	public void setCreateUsersOnEmail(boolean createUsersOnEmail) {
		this.createUsersOnEmail = createUsersOnEmail;
	}


	/**
	 * @return the altEmailAddr
	 */
	public String getAltEmailAddr() {
		return altEmailAddr;
	}


	/**
	 * @param altEmailAddr the altEmailAddr to set
	 */
	public void setAltEmailAddr(String altEmailAddr) {
		this.altEmailAddr = altEmailAddr;
	}


	/**
	 * @return the allowAllUsers
	 */
	public int getAllowAllUsers() {
		return allowAllUsers;
	}


	/**
	 * @param allowAllUsers the allowAllUsers to set
	 */
	public void setAllowAllUsers(int allowAllUsers) {
		this.allowAllUsers = allowAllUsers;
	}


	/**
	 * @return the allowDelete
	 */
	public int getAllowDelete() {
		return allowDelete;
	}


	/**
	 * @param allowDelete the allowDelete to set
	 */
	public void setAllowDelete(int allowDelete) {
		this.allowDelete = allowDelete;
	}


	/**
	 * @return the allowParentClose
	 */
	public int getAllowParentClose() {
		return allowParentClose;
	}


	/**
	 * @param allowParentClose the allowParentClose to set
	 */
	public void setAllowParentClose(int allowParentClose) {
		this.allowParentClose = allowParentClose;
	}


	/**
	 * @return the allowOwnersViaAdminUi
	 */
	public int getAllowOwnersViaAdminUi() {
		return allowOwnersViaAdminUi;
	}


	/**
	 * @param allowOwnersViaAdminUi the allowOwnersViaAdminUi to set
	 */
	public void setAllowOwnersViaAdminUi(int allowOwnersViaAdminUi) {
		this.allowOwnersViaAdminUi = allowOwnersViaAdminUi;
	}


	/**
	 * @return the archiveInterval
	 */
	public String getArchiveInterval() {
		return archiveInterval;
	}


	/**
	 * @param archiveInterval the archiveInterval to set
	 */
	public void setArchiveInterval(String archiveInterval) {
		this.archiveInterval = archiveInterval;
	}


	/**
	 * @return the purgeInterval
	 */
	public String getPurgeInterval() {
		return purgeInterval;
	}


	/**
	 * @param purgeInterval the purgeInterval to set
	 */
	public void setPurgeInterval(String purgeInterval) {
		this.purgeInterval = purgeInterval;
	}


	/**
	 * @return the popServer
	 */
	public String getPopServer() {
		return popServer;
	}


	/**
	 * @param popServer the popServer to set
	 */
	public void setPopServer(String popServer) {
		this.popServer = popServer;
	}


	/**
	 * @return the smtpServer
	 */
	public String getSmtpServer() {
		return smtpServer;
	}


	/**
	 * @param smtpServer the smtpServer to set
	 */
	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}


	/**
	 * @return the smtpUsername
	 */
	public String getSmtpUsername() {
		return smtpUsername;
	}


	/**
	 * @param smtpUsername the smtpUsername to set
	 */
	public void setSmtpUsername(String smtpUsername) {
		this.smtpUsername = smtpUsername;
	}


	/**
	 * @return the smtpPasswordEnc
	 */
	public String getSmtpPasswordEnc() {
		return smtpPasswordEnc;
	}


	/**
	 * @param smtpPasswordEnc the smtpPasswordEnc to set
	 */
	public void setSmtpPasswordEnc(String smtpPasswordEnc) {
		this.smtpPasswordEnc = smtpPasswordEnc;
	}


	/**
	 * @return the smtpPort
	 */
	public int getSmtpPort() {
		return smtpPort;
	}


	/**
	 * @param smtpPort the smtpPort to set
	 */
	public void setSmtpPort(int smtpPort) {
		this.smtpPort = smtpPort;
	}


	/**
	 * @return the ownersOnlyComments
	 */
	public int getOwnersOnlyComments() {
		return ownersOnlyComments;
	}


	/**
	 * @param ownersOnlyComments the ownersOnlyComments to set
	 */
	public void setOwnersOnlyComments(int ownersOnlyComments) {
		this.ownersOnlyComments = ownersOnlyComments;
	}


	/**
	 * @return the conflictWarningEnabled
	 */
	public int getConflictWarningEnabled() {
		return conflictWarningEnabled;
	}


	/**
	 * @param conflictWarningEnabled the conflictWarningEnabled to set
	 */
	public void setConflictWarningEnabled(int conflictWarningEnabled) {
		this.conflictWarningEnabled = conflictWarningEnabled;
	}


	/**
	 * @return the showNewTicketComments
	 */
	public int getShowNewTicketComments() {
		return showNewTicketComments;
	}


	/**
	 * @param showNewTicketComments the showNewTicketComments to set
	 */
	public void setShowNewTicketComments(int showNewTicketComments) {
		this.showNewTicketComments = showNewTicketComments;
	}


	/**
	 * @return the showNewTicketAttachments
	 */
	public int getShowNewTicketAttachments() {
		return showNewTicketAttachments;
	}


	/**
	 * @param showNewTicketAttachments the showNewTicketAttachments to set
	 */
	public void setShowNewTicketAttachments(int showNewTicketAttachments) {
		this.showNewTicketAttachments = showNewTicketAttachments;
	}

}
