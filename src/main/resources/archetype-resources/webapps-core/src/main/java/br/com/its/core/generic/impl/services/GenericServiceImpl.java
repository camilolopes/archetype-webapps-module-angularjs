#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package br.com.its.core.generic.impl.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.its.core.generic.interfaces.dao.GenericDAO;
import br.com.its.core.generic.interfaces.services.GenericService;
@Service
public class GenericServiceImpl<T, DAO extends GenericDAO<T>> implements GenericService<T> {
	
	private DAO dao;
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	public DAO getDao() {
		return dao;
	}

	public void saveOrUpdate(T entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void delete(T entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public T getById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
