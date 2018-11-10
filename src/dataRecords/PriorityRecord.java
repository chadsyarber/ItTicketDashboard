package dataRecords;

/**
 * Represents the HD_PRIORITY table
 * 
 * @author Chad Yarber
 *
 */
public class PriorityRecord {

	private long id;
	private long hdQueueId;
	private String name;
	private String ordinal;
	private String color;
	private int escalationMinutes;
	
	public PriorityRecord() {
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the escalationMinutes
	 */
	public int getEscalationMinutes() {
		return escalationMinutes;
	}

	/**
	 * @param escalationMinutes the escalationMinutes to set
	 */
	public void setEscalationMinutes(int escalationMinutes) {
		this.escalationMinutes = escalationMinutes;
	}

}
