package DAO;

import java.util.ArrayList;
import java.util.List;

public interface IDAO<T> {

	void add(T o);
	void update(T o);
	List<T> listar();
	
}
