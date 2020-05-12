package it.polito.tdp.corsi.model;

import java.util.List;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {

	public List<Corso> getCorsiByPeriodo(int pd){
		//creo istanza del dao
		CorsoDAO dao = new CorsoDAO();
		//ritornare il metodo del dao a cui passo il periodo
		return dao.getCorsiByPeriodo(pd);
	}
}
