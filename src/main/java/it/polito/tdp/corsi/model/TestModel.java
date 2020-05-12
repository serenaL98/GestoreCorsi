package it.polito.tdp.corsi.model;

public class TestModel {

	public static void main(String[] args) {
		//mi creo un'istanza del modello per vedere se funziona
		Model model = new Model();
		System.out.println(model.getCorsiByPeriodo(1));

	}

}
