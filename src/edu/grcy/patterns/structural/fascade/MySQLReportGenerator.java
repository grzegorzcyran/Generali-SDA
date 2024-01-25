package edu.grcy.patterns.structural.fascade;

import java.sql.Connection;

public class MySQLReportGenerator {

	//1 czynność - połączenie z bazą
	public static Connection getMySqlDBConnection(){
		//get MySql DB connection using connection parameters
		return null;
	}

	//2 czynność - inicjowanie obiektu
	public MySQLReportGenerator() {
	}

	//3 czynność - generowanie raportu
	public void generateMySqlPDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}

	public void generateMySqlHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}

}
