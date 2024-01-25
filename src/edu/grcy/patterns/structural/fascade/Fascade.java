package edu.grcy.patterns.structural.fascade;

import java.sql.Connection;

public class Fascade {

	public static void generateReport(DBType dbType, ReportType reportType, String tableName){
		Connection con = null;
		switch (dbType){
			case MYSQL:
				con = MySQLReportGenerator.getMySqlDBConnection();
				MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
				switch(reportType){
					case HTML:
						mySQLReportGenerator.generateMySqlHTMLReport(tableName, con);
						break;
					case PDF:
						mySQLReportGenerator.generateMySqlPDFReport(tableName, con);
						break;
				}
				break;
			case ORACLE:
				con = OracleReportGenerator.getOracleDBConnection();
				OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
				switch(reportType){
					case HTML:
						oracleReportGenerator.generateOracleHTMLReport(tableName, con);
						break;
					case PDF:
						oracleReportGenerator.generateOraclePDFReport(tableName, con);
						break;
				}
				break;
		}

	}

	public enum DBType{
		MYSQL,ORACLE;
	}

	public enum ReportType{
		HTML,PDF;
	}

}
