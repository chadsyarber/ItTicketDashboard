package dataRecords;

/**
 * Represents the HD_ATTACHMENT table
 * @author Chad Yarber
 *
 */
public class AttachmentRecord {

	private long id;
	private long hdTicketChangeId;
	private String fileName;
	private long fileSize;
	private String checkSum;
	
	public AttachmentRecord() {
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
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the fileSize
	 */
	public long getFileSize() {
		return fileSize;
	}

	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * @return the checkSum
	 */
	public String getCheckSum() {
		return checkSum;
	}

	/**
	 * @param checkSum the checkSum to set
	 */
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}

}
