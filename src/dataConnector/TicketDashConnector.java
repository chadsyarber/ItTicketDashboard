package dataConnector;

import java.sql.*;

/**
 * Abstract parent class for ALL Managers
 * 
 * @author Chad Yarber
 *
 */
public abstract class TicketDashConnector {

	private Connection connect;

	public TicketDashConnector(Connection connect) throws SQLException, ClassNotFoundException {
		this.connect = connect;
		Class.forName("com.mysql.jdbc.Driver");
	}

	public Connection getConnect() {
		return connect;
	}

	public void setConnect(Connection connect) {
		this.connect = connect;
	}

}
