#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package br.com.its.core.generic.interfaces.dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface GenericDAO<T> {
	void saveOrUpdate(T entity);
	void delete(T entity);
	T getById(Long id);
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	List<T> list();
	long getCount(T entity);
}