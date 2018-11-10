package dataRecords;

/**
 * Represents the HD_TICKET_RELEATED table
 * @author Owner
 *
 */
public class TicketRelatedRecord {

	private long fromId;
	private long toId;
	
	public TicketRelatedRecord() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the fromId
	 */
	public long getFromId() {
		return fromId;
	}

	/**
	 * @param fromId the fromId to set
	 */
	public void setFromId(long fromId) {
		this.fromId = fromId;
	}

	/**
	 * @return the toId
	 */
	public long getToId() {
		return toId;
	}

	/**
	 * @param toId the toId to set
	 */
	public void setToId(long toId) {
		this.toId = toId;
	}

}
