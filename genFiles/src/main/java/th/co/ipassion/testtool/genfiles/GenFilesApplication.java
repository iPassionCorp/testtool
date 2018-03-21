package th.co.ipassion.testtool.genfiles;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import th.co.ipassion.testtool.genfiles.models.Tables;

public class GenFilesApplication {

	public static String jdbcUrl_db1;
	public static String jdbcUrl_db1_rep;
	public static String jdbcUrl_db2;
	public static String jdbcUrl_db2_rep;
	public static String jdbcUrl_db3;
	public static String jdbcUrl_db3_rep;
	public static String jdbcUrl_db4;
	public static String jdbcUrl_db4_rep;
	public static String jdbcUrl_db5;
	public static String jdbcUrl_db5_rep;
	public static String jdbcUrl_db6;
	public static String jdbcUrl_db6_rep;
	public static String jdbcUrl_db7;
	public static String jdbcUrl_db7_rep;
	public static String jdbcUrl_db8;
	public static String jdbcUrl_db8_rep;
	public static String jdbcUrl_db9;
	public static String jdbcUrl_db9_rep;
	public static String jdbcUrl_db10;
	public static String jdbcUrl_db10_rep;
	public static String driverClass;
	public static String dbuser;
	public static String dbpassword;
	public static String sqlOutputDirectory;

	public static String SQL_LIST_ALL_DB = "SELECT table_schema, table_name FROM information_schema.tables \n"
			+ "where table_type = 'BASE TABLE' \n"
			+ "and table_schema not in ('pg_catalog', 'information_schema', 'public') \n"
			+ "order by table_schema, table_name";

	public static String SQL_TEMPLATE_01 = "select * from %s.%s \n" + 
										  "except all \n" + 
										  "select * from %s_qa.%s;";

	public static String SQL_TEMPLATE_SELECT = "select * from %s.%s;";
	
	public static void main(String[] args) {

		loadProperties();

		Connection conn1 = connectDB(args[0]);
		Connection conn2 = connectDB(args[0] + "rep");
		
		List<Tables> tableList1;
		List<Tables> tableList2;
		
		try {
			tableList1 = listAllDB(conn1);
			tableList2 = listAllDB(conn2);
			
			System.out.println("tableList.size() ==> " + tableList1.size());
			System.out.println("tableList.size() ==> " + tableList2.size());
			
			Iterator<Tables> itr1 = tableList1.iterator();
			Iterator<Tables> itr2 = tableList2.iterator();
			
			compareTableList (tableList1, tableList2);
			
			StringBuffer text = new StringBuffer();
			while (itr1.hasNext()) {
				Tables tmp = itr1.next();
				String schema = tmp.getTable_schema();
				String table = tmp.getTable_name();
				String x = String.format(SQL_TEMPLATE_01, schema, table, schema, table);
				text.append(x);
				text.append("\n");
			}
			
			writeFile(sqlOutputDirectory, "test-script.sql", text.toString());
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn1 = null;
		}

	}

	public static void loadProperties() {
		
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = GenFilesApplication.class.getClassLoader().getResourceAsStream("genFiles.properties");

			// load a properties file
			prop.load(input);

			jdbcUrl_db1 = prop.getProperty("jdbcUrl.db1");
			jdbcUrl_db1_rep = prop.getProperty("jdbcUrl.db1.rep");
			jdbcUrl_db2 = prop.getProperty("jdbcUrl.db2");
			jdbcUrl_db2_rep = prop.getProperty("jdbcUrl.db2.rep");
			jdbcUrl_db3 = prop.getProperty("jdbcUrl.db3");
			jdbcUrl_db3_rep = prop.getProperty("jdbcUrl.db3.rep");
			jdbcUrl_db4 = prop.getProperty("jdbcUrl.db4");
			jdbcUrl_db4_rep = prop.getProperty("jdbcUrl.db4.rep");
			jdbcUrl_db5 = prop.getProperty("jdbcUrl.db5");
			jdbcUrl_db5_rep = prop.getProperty("jdbcUrl.db5.rep");
			jdbcUrl_db6 = prop.getProperty("jdbcUrl.db6");
			jdbcUrl_db6_rep = prop.getProperty("jdbcUrl.db6.rep");
			jdbcUrl_db7 = prop.getProperty("jdbcUrl.db7");
			jdbcUrl_db7_rep = prop.getProperty("jdbcUrl.db7.rep");
			jdbcUrl_db8 = prop.getProperty("jdbcUrl.db8");
			jdbcUrl_db8_rep = prop.getProperty("jdbcUrl.db8.rep");
			jdbcUrl_db9 = prop.getProperty("jdbcUrl.db9");
			jdbcUrl_db9_rep = prop.getProperty("jdbcUrl.db9.rep");
			jdbcUrl_db10 = prop.getProperty("jdbcUrl.db10");
			jdbcUrl_db10_rep = prop.getProperty("jdbcUrl.db10.rep");

			driverClass = prop.getProperty("driverClass");
			dbuser = prop.getProperty("dbuser");
			dbpassword = prop.getProperty("dbpassword");
			
			sqlOutputDirectory = prop.getProperty("sql.output.dir");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static Connection connectDB(String dbconnection) {

		Connection c = null;

		try {
			Class.forName(driverClass);
			
			if (StringUtils.equalsIgnoreCase(dbconnection, "db1")) {
				c = DriverManager.getConnection(jdbcUrl_db1, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db1rep")) {
				c = DriverManager.getConnection(jdbcUrl_db1_rep, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db2")) {
				c = DriverManager.getConnection(jdbcUrl_db2, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db2rep")) {
				c = DriverManager.getConnection(jdbcUrl_db2_rep, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db3")) {
				c = DriverManager.getConnection(jdbcUrl_db3, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db3rep")) {
				c = DriverManager.getConnection(jdbcUrl_db3_rep, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db4")) {
				c = DriverManager.getConnection(jdbcUrl_db4, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db4rep")) {
				c = DriverManager.getConnection(jdbcUrl_db4_rep, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db5")) {
				c = DriverManager.getConnection(jdbcUrl_db5, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db5rep")) {
				c = DriverManager.getConnection(jdbcUrl_db5_rep, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db6")) {
				c = DriverManager.getConnection(jdbcUrl_db6, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db6rep")) {
				c = DriverManager.getConnection(jdbcUrl_db6_rep, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db7")) {
				c = DriverManager.getConnection(jdbcUrl_db7, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db7rep")) {
				c = DriverManager.getConnection(jdbcUrl_db7_rep, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db8")) {
				c = DriverManager.getConnection(jdbcUrl_db8, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db8rep")) {
				c = DriverManager.getConnection(jdbcUrl_db8_rep, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db9")) {
				c = DriverManager.getConnection(jdbcUrl_db9, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db9rep")) {
				c = DriverManager.getConnection(jdbcUrl_db9_rep, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db10")) {
				c = DriverManager.getConnection(jdbcUrl_db10, dbuser, dbpassword);
			} else if (StringUtils.equalsIgnoreCase(dbconnection, "db10rep")) {
				c = DriverManager.getConnection(jdbcUrl_db10_rep, dbuser, dbpassword);
			} else {
				c = DriverManager.getConnection(jdbcUrl_db1, dbuser, dbpassword);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return c;
	}

	public static List<Tables> listAllDB(Connection conn) throws SQLException {

		Statement stmt = null;
		ResultSet rs = null;
		List<Tables> result = new ArrayList<Tables>();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL_LIST_ALL_DB);
			while (rs.next()) {
				Tables table = new Tables();
				table.setTable_schema(rs.getString("table_schema"));
				table.setTable_name(rs.getString("table_name"));
				result.add(table);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (stmt != null) stmt.close();
			if (rs != null) rs.close();
		}
		return result;
	}

	public static void writeFile(String filePath, String fileName, String data) {
		String file = filePath.concat(fileName);
		Writer out = null;
		try {
			out = new BufferedWriter(
			             new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
			out.write(data);
			System.out.println("Generate File " + file + " Successfully.");
			/*
			 * BufferedReader br = new BufferedReader(new InputStreamReader(
             * new FileInputStream("c:\\filenonUTF.txt"),"Cp1252"));
			 */
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) { 
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void compareTableList (List<Tables> list1, List<Tables> list2) {

        List<Tables> aList = new ArrayList<Tables>(list1);
        List<Tables> bList = new ArrayList<Tables>(list2);
        
        aList.removeAll(list2);
        bList.removeAll(list1);

        System.out.println("AFTER COMPARE");
        System.out.println("aList.size() ==> " + aList.size());
		System.out.println("bList.size() ==> " + bList.size());
        
        String text1 = printTableList (aList);
		writeFile(sqlOutputDirectory, "a-not-in-b.txt", text1.toString());
		
		String text2 = printTableList (bList);
		writeFile(sqlOutputDirectory, "b-not-in-a.txt", text2);
		
	}

	public static String printTableList (Collection<Tables> list) {
		Iterator<Tables> itr = list.iterator();
		StringBuffer text = new StringBuffer();
		while (itr.hasNext()) {
			Tables tmp = itr.next();
			String schema = tmp.getTable_schema();
			String table = tmp.getTable_name();
			text.append(schema + "." + table);
			text.append("\n");
		}
		return text.toString();
	}
}