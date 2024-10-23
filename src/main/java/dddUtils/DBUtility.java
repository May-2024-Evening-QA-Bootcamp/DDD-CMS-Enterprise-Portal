package dddUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBUtility {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	ResultSetMetaData resultSetMetaData;
	
	static Logger logger = LoggerFactory.getLogger(DBUtility.class);
	
	/*
	 We didn't use Loggers because TestManager was Null during execution. 
	 We don't need Logger here, because TestManager is related to extent report
	  so we got logger from bdd framework, slf4j type
	 */
	
	public DBUtility() {
		getConnection();
	}
	
	private Connection getConnection() {
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employees_db", "postgres", "hr");
			logger.info("Database Connected ... ");
		} catch (SQLException e) {
			logger.info("Database Connection can't be established ... ");
		}
		return connection;
	}
	
	
	public void executeQuery(String query) {
		try {
			statement = connection.createStatement();
			statement.execute(query);
			logger.info("Query executed ... ");
		} catch (SQLException e) {
			logger.info("Statement Cannot be Created ... ");
		}
	
	}
	
	public ResultSet getResultSet() {
		try {
			resultSet = statement.getResultSet();
			logger.info("ResultSet Generated ... ");
		} catch (SQLException e) {
			logger.info("ResultSet can't be Generated ... ");
		}
		
		return resultSet;
	}
	
	// ResultsetMetaData returns the types of data we received
	// We didn't used it
	public ResultSetMetaData getMetaData(ResultSet resultSet) {
		ResultSetMetaData resultSetMetaData = null;
		try {
			resultSetMetaData = resultSet.getMetaData();
			 logger.info("ResultSetMetaData Generated ... ");
		}catch (SQLException e) {
			logger.info("ResultSetMetaData can't be Generated ... ");
		}
		return resultSetMetaData;
	}
	
	public void closeConnection() {
		try {
			connection.close();
			logger.info("Connection Terminated ... ");
		} catch (SQLException e) {
			logger.info("Connection can't be Terminated ... ");
		}
	}
		

}
