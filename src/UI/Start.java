package UI;

import DAO.BDApp;
import DTO.Administrador;

public class Start {
	public static void main(String[] args) {
	
		BDApp<Administrador> objeto = new BDApp<>();
		Menu menu = new Menu(objeto);
		
		menu.cadastrar();
		menu.cadastrar();
		menu.cadastrar();
		
		menu.listarADMs();
	}
}
