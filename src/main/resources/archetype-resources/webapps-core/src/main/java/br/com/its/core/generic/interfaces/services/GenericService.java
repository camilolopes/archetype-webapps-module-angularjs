#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package br.com.its.core.generic.interfaces.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
public interface GenericService<T> {
	
	void saveOrUpdate(T entity) throws Exception;

	void delete(T entity) throws Exception;

	T getById(Long id) throws Exception;

	List<T> list() throws Exception;

}