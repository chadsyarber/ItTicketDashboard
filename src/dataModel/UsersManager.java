package dataModel;

import java.sql.Connection;
import java.sql.SQLException;

import dataConnector.TicketDashConnector;

public class UsersManager extends TicketDashConnector {

	public UsersManager(Connection connect) throws SQLException, ClassNotFoundException {
		super(connect);
		// TODO Auto-generated constructor stub
	}

}
