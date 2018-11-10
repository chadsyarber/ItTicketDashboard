package dataModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dataConnector.SelectManager;
import dataConnector.TicketDashConnector;

public class BrokerDatabase {

	private TicketDashConnector rtnManger;
	private SelectManager whichManager;
	private final String JDBC_CON_STRING = "jdbc:mysql://localhost/javabook";
	private final String USER_NAME = "root";
	private final String PWORD = "C#isbetter";

	public BrokerDatabase(SelectManager whichManager) throws ClassNotFoundException, SQLException {
		this.whichManager = whichManager;
		setReturnManager();
	}

	private void setReturnManager() throws SQLException, ClassNotFoundException {
		Connection connect = DriverManager.getConnection(JDBC_CON_STRING, USER_NAME, PWORD);
		switch (whichManager) {
		case ATTACHMENT_MANAGER:
			rtnManger = new AttachmentManger(connect);
			break;
		case CATEGORY_MANAGER:
			rtnManger = new CategoryManager(connect);
			break;
		case CUSTOM_MANAGER:
			rtnManger = new CustomQueryManager(connect);
			break;
		case IMPACT_MANAGER:
			rtnManger = new ImpactManager(connect);
			break;
		case PRIORITY_MANAGER:
			rtnManger = new PriorityManager(connect);
			break;
		case QUEUE_APPROVER_LABEL_JT_MANAGER:
			rtnManger = new QueueApproverLabelJTManager(connect);
			break;
		case QUEUE_MANAGER:
			rtnManger = new QueueManager(connect);
			break;
		case QUEUE_OWNER_LABEL_MANAGER:
			rtnManger = new QueueOwnerLabelManager(connect);
			break;
		case QUEUE_SUBMITTER_LABEL_JT_MANAGER:
			rtnManger = new QueueSubmitterLabelJTManager(connect);
			break;
		case STATUS_MANAGER:
			rtnManger = new StatusManager(connect);
			break;
		case TICKET_CHANGE_FIELD_MANAGER:
			rtnManger = new TicketChangeFieldManger(connect);
			break;
		case TICKET_CHANGE_MANAGER:
			rtnManger = new TicketChangeManager(connect);
			break;
		case TICKET_MANAGER:
			rtnManger = new TicketManager(connect);
			break;
		case TICKET_RELATED_MANAGER:
			rtnManger = new TicketRelatedManager(connect);
			break;
		case USERS_MANAGER:
			rtnManger = new UsersManager(connect);
			break;
		case WORK_MANAGER:
			rtnManger = new WorkManager(connect);
			break;
		default:
			throw new SQLException("Manager instance not valid!");
		}
	}

	/**
	 * @return the rtnManger
	 */
	public TicketDashConnector getRtnManger() {
		return rtnManger;
	}

	/**
	 * @param rtnManger
	 *            the rtnManger to set
	 */
	public void setRtnManger(TicketDashConnector rtnManger) {
		this.rtnManger = rtnManger;
	}

	/**
	 * @return the whichManager
	 */
	public SelectManager getWhichManager() {
		return whichManager;
	}

	/**
	 * @param whichManager
	 *            the whichManager to set
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void setWhichManager(SelectManager whichManager) throws ClassNotFoundException, SQLException {
		this.whichManager = whichManager;
		setReturnManager();
	}

}
