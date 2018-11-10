package dataRecords;

/**
 * Represents the HD_QUEUE_SUBMITTER_LABEL_JT table
 * @author Owner
 *
 */
public class QueueSubmitterLabelJTRecord {
	
	private long hdQueueId;
	private long labelId;

	public QueueSubmitterLabelJTRecord() {
		// TODO Auto-generated constructor stub
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
	 * @return the labelId
	 */
	public long getLabelId() {
		return labelId;
	}

	/**
	 * @param labelId the labelId to set
	 */
	public void setLabelId(long labelId) {
		this.labelId = labelId;
	}

}
