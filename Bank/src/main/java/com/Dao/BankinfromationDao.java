package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cofig.MyCofigurationBank;
import com.model.Bankinfromation;

public class BankinfromationDao {
	public int insertBankinfromation(Bankinfromation bi) {
		int check = 0;
		Connection con = MyCofigurationBank.getConnection();
		PreparedStatement pst = null;
		String query = "insert into Bankinfromation values (?,?,?,?,?)";
		try {
			pst = MyCofigurationBank.preparedStatementSet(con, bi, query);
			check = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MyCofigurationBank.closeconnection(pst, con);
		}
		return check;
	}

}
