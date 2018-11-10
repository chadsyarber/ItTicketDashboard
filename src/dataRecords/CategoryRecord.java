package dataRecords;

/**
 * Represents the HD_CATEGORY table
 * @author Chad Yarber
 *
 */
public class CategoryRecord {

	private long id;
	private long hdQueueId;
	private String name;
	private String ordinal;
	private long defaultOwnerId;
	private String ccList;
	private String userSettable;
	
	public CategoryRecord() {
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
	 * @return the hdQueueId
	 */
	public long getHdQueueId() {
		return hdQueueId;
	}

	/**
	 * @param hdQueueId the hdQueueId to set
	 */
	public void setHdQueueId(long hdQueueId) {
		this.hdQueueId = hdQueueId;
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
	 * @return the ordinal
	 */
	public String getOrdinal() {
		return ordinal;
	}

	/**
	 * @param ordinal the ordinal to set
	 */
	public void setOrdinal(String ordinal) {
		this.ordinal = ordinal;
	}

	/**
	 * @return the defaultOwnerId
	 */
	public long getDefaultOwnerId() {
		return defaultOwnerId;
	}

	/**
	 * @param defaultOwnerId the defaultOwnerId to set
	 */
	public void setDefaultOwnerId(long defaultOwnerId) {
		this.defaultOwnerId = defaultOwnerId;
	}

	/**
	 * @return the ccList
	 */
	public String getCcList() {
		return ccList;
	}

	/**
	 * @param ccList the ccList to set
	 */
	public void setCcList(String ccList) {
		this.ccList = ccList;
	}

	/**
	 * @return the userSettable
	 */
	public String getUserSettable() {
		return userSettable;
	}

	/**
	 * @param userSettable the userSettable to set
	 */
	public void setUserSettable(String userSettable) {
		this.userSettable = userSettable;
	}

}
