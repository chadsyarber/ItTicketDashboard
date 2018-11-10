package dataModel;

import java.sql.Connection;
import java.sql.SQLException;

import dataConnector.TicketDashConnector;

public class CategoryManager extends TicketDashConnector {

	public CategoryManager(Connection connect) throws SQLException, ClassNotFoundException {
		super(connect);
		// TODO Auto-generated constructor stub
	}

}
