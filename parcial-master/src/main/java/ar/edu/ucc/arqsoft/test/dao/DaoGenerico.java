package ar.edu.ucc.arqsoft.test.dao;

import java.io.Serializable;
import java.util.List;

import ar.edu.ucc.arqsoft.test.model.Usuario;

public interface DaoGenerico<E, ID extends Serializable> {
	
	public void insert(E entity);
	
	public void merge(E entity);

	public void saveOrUpdate(E entity);

	public void update(E entity);

	public void remove(E entity);

	public E load(ID key);
	
	public E load(Usuario key);

	public List<E> getAll();
}