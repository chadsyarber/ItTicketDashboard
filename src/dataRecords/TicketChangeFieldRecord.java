package dataRecords;

/**
 * Represents the HD_TICKET_CHANGE_FIELD table
 * @author Chad Yarber
 *
 */
public class TicketChangeFieldRecord {

	private long id;
	private long hdTicketChangeId;
	private boolean fieldChanged;
	private String beforeValue;
	private String afterValue;
	
	public TicketChangeFieldRecord() {
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
	 * @return the hdTicketChangeId
	 */
	public long getHdTicketChangeId() {
		return hdTicketChangeId;
	}

	/**
	 * @param hdTicketChangeId the hdTicketChangeId to set
	 */
	public void setHdTicketChangeId(long hdTicketChangeId) {
		this.hdTicketChangeId = hdTicketChangeId;
	}

	/**
	 * @return the fieldChanged
	 */
	public boolean isFieldChanged() {
		return fieldChanged;
	}

	/**
	 * @param fieldChanged the fieldChanged to set
	 */
	public void setFieldChanged(boolean fieldChanged) {
		this.fieldChanged = fieldChanged;
	}

	/**
	 * @return the beforeValue
	 */
	public String getBeforeValue() {
		return beforeValue;
	}

	/**
	 * @param beforeValue the beforeValue to set
	 */
	public void setBeforeValue(String beforeValue) {
		this.beforeValue = beforeValue;
	}

	/**
	 * @return the afterValue
	 */
	public String getAfterValue() {
		return afterValue;
	}

	/**
	 * @param afterValue the afterValue to set
	 */
	public void setAfterValue(String afterValue) {
		this.afterValue = afterValue;
	}

}
