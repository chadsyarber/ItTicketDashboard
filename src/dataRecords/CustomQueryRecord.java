package dataRecords;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomQueryRecord {

	private ArrayList<ResultSet> managerResults;
	private ArrayList<String> columnNames;

	public CustomQueryRecord(ArrayList<ResultSet> managerResults, ArrayList<String> columnNames) {
		this.managerResults = managerResults;
		this.columnNames = columnNames;
	}

	/**
	 * @return the managerResults
	 */
	public ArrayList<ResultSet> getManagerResults() {
		return managerResults;
	}

	/**
	 * @param managerResults
	 *            the managerResults to set
	 */
	public void setManagerResults(ArrayList<ResultSet> managerResults) {
		this.managerResults = managerResults;
	}

	/**
	 * @return the columnNames
	 */
	public ArrayList<String> getColumnNames() {
		return columnNames;
	}

	/**
	 * @param columnNames
	 *            the columnNames to set
	 */
	public void setColumnNames(ArrayList<String> columnNames) {
		this.columnNames = columnNames;
	}

}
