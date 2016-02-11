package UI;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.BDApp;
import DTO.Administrador;

public class Menu {

	private BDApp<Administrador> adm;
	
	Menu(BDApp<Administrador> adm){
		this.adm = adm;
	}
	
	void cadastrar(){
		Scanner sc = new Scanner(System.in);
		
		Administrador administrador = new Administrador();
		
		System.out.println(" Digite nome: ");
		administrador.setNome(sc.next());
		
		System.out.println(" Digite CPF: ");
		administrador.setCpf(sc.next());
		
		adm.add(administrador);
	}
	
	void listarADMs(){
		ArrayList<Administrador> liista = (ArrayList<Administrador>) adm.listar();
		for(Administrador administrador : liista){
			System.out.println("ADM " + administrador.getNome());
			System.out.println("CPF " + administrador.getCpf());
		}
	}
}