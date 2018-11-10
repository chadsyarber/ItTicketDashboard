package dataRecords;

/**
 * Represents the HD_STATUS table
 * @author Chad Yarber
 *
 */
public class StatusRecord {

	private long id;
	private long hdQueueId;
	private String name;
	private String ordinal;
	private String state;
	
	public StatusRecord() {
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

}
