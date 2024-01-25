package edu.grcy.patterns.structural.fascade;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		String tableName="Employee";

		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection conMySQL = MySQLReportGenerator.getMySqlDBConnection(); //1 - połączenie z bazą
		MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator(); //2 - inicjowanie obiektu
		mySQLReportGenerator.generateMySqlHTMLReport(tableName, conMySQL); //3 - właściwa metoda do wygenerowania raportu

		Connection conOracle = OracleReportGenerator.getOracleDBConnection();
		OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
		oracleReportGenerator.generateOraclePDFReport(tableName, conOracle);

		//generating MySql HTML report and Oracle PDF report using Facade
		Fascade.generateReport(Fascade.DBType.MYSQL, Fascade.ReportType.HTML, tableName);
		Fascade.generateReport(Fascade.DBType.ORACLE, Fascade.ReportType.PDF, tableName);

	}

}
