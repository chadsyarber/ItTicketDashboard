package dataModel;

import java.sql.Connection;
import java.sql.SQLException;

import dataConnector.TicketDashConnector;

public class TicketRelatedManager extends TicketDashConnector {

	public TicketRelatedManager(Connection connect) throws SQLException, ClassNotFoundException {
		super(connect);
		// TODO Auto-generated constructor stub
	}

}
