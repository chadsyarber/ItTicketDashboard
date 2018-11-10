package dataModel;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dataConnector.TicketDashConnector;

/**
 * This class will be used for searching
 * @author Owner
 *
 */
public class CustomQueryManager extends TicketDashConnector {

	private ArrayList<String> colNames;
	private String sqlCmd;
	
	public CustomQueryManager(Connection connect) throws SQLException, ClassNotFoundException {
		super(connect);
		// TODO Auto-generated constructor stub
	}
	
	public CustomQueryManager(Connection connect, ArrayList<String> colNames, String sqlCmd) throws SQLException, ClassNotFoundException{
		super(connect);
		this.colNames = colNames;
		this.sqlCmd = sqlCmd;
	}

	/**
	 * @return the colNames
	 */
	public ArrayList<String> getColNames() {
		return colNames;
	}

	/**
	 * @param colNames the colNames to set
	 */
	public void setColNames(ArrayList<String> colNames) {
		this.colNames = colNames;
	}

	/**
	 * @return the sqlCmd
	 */
	public String getSqlCmd() {
		return sqlCmd;
	}

	/**
	 * @param sqlCmd the sqlCmd to set
	 */
	public void setSqlCmd(String sqlCmd) {
		this.sqlCmd = sqlCmd;
	}

}
