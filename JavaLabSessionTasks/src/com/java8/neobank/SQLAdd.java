package com.java8.neobank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.java8.neobank.S20_BankApplicationConsole;

public class SQLAdd {

}

class Sample {
	public List<Bank> ls1 = S20_BankApplicationConsole.getList();

	public void SQLAdd1() {
		String nm = null;
		String add = null;
		String phno = null;
		String uname = null;
		String pass = null;
		double dep = 0;

		ResultSet rs = null;
		Connection conn = null;
		System.out.println("Start");
		Connection con = JDBCProperties.getConnection();
		try {
			String createTableQuerry = "CREATE TABLE IF NOT EXISTS mydb.bank(uid INT AUTO_INCREMENT PRIMARY KEY,"
					+ "name VARCHAR(50) NOT NULL, address VARCHAR(50) NOT NULL, "
					+ "phno BIGINT NOT NULL, uname VARCHAR(20) NOT NULL,"
					+ "pass VARCHAR(20) NOT NULL, deposit INT)";
			PreparedStatement pst = con.prepareStatement(createTableQuerry);
			System.out.println("Table Creation : " + pst.executeUpdate());
			pst.close();

			for (Bank bank : ls1) {
				nm = bank.getName();
				add = bank.getAdd();
				phno = bank.getCno();
				uname = bank.getUname();
				pass = bank.getPwd();
				dep = bank.getDep();
				
				String insertQuerry = "INSERT INTO mydb.bank(name,address,phno,uname,pass,deposit) VALUES(?,?,?,?,?,?)";
				pst = con.prepareStatement(insertQuerry);
				
				// pst = conn.prepareStatement("INSERT INTO
				// mydb.bank(name,address,uname,pass,deposit) VALUES(?,?,?,?,?)");
				pst.setString(1, nm);
				pst.setString(2, add);
				pst.setString(3, phno);
				pst.setString(4, uname);
				pst.setString(5, pass);
				pst.setDouble(6, dep);
				System.out.println("Execute Insert : "+ pst.executeUpdate());
				//System.out.println("Querry Execution Status : " + rs);
				// System.out.println("insertPrepareQuerry : "+pst.executeUpdate());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
}
