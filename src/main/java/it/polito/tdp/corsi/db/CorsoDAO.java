package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.model.Corso;

public class CorsoDAO {
	
	//metodo per recuperare tutti i corsi del periodo didattico
	public List<Corso> getCorsiByPeriodo(int pd){
		String sql = "select * from corse where pd = ?";	//NON SI CONCATENANO STRINGHE
		List<Corso> result = new ArrayList<Corso>();
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, pd);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Corso c = new Corso(rs.getString("codins"), rs.getInt("crediti"), rs.getString("nome"), rs.getInt("pd"));
				result.add(c);
			}
			conn.close();
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return result;
		
	}

}
