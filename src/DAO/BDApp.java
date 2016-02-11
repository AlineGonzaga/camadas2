package DAO;

import java.util.ArrayList;
import java.util.List;

public class BDApp<T> implements IDAO<T>{

	List<T> lista = new ArrayList<>();
	
	@Override
	public void add(T o) {
		lista.add(o);
		
	}

	@Override
	public void update(T o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> listar() {
		// TODO Auto-generated method stub
		return lista;
	}

}
