package de.uniba.wiai.seda.fha.awsgen;

import javax.persistence.*;

/**
 * Basisklasse für Entitaets-Services auf der Basis von Session Beans. 
 * Stellt CRUD-Methoden zur Verfuegung.
 * 
 * @generated
 */
public abstract class EntitaetsService {
	
	@PersistenceContext
	protected EntityManager _entityManager;
	
	/**
	 * 
	 * @param _entity
	 * @return
	 * 
	 * @generated
	 */
	public <T> T create(T _entity) {
		_entityManager.persist(_entity);
		_entityManager.flush();
		return _entity;
	}
	
	/**
	 * @param cls
	 * @param id
	 * @return
	 * 
	 * @generated
	 */
	public <T> T read(Class<T> cls, Integer id) {
		T _entity;
		_entity = (T) _entityManager.find(cls, id);
		_entityManager.detach(_entity);
		return _entity;
	}
	
	/**
	 * @param entity
	 * 
	 * @generated
	 */
	public <T> void update(T entity) {
		T _entity = entity;
		_entityManager.merge(_entity);
		_entityManager.flush();
	}
	
	/**
	 * @param entity
	 * @generated
	 */
	public <T> void delete(T entity) {
		T _entity = entity;
		_entityManager.remove(_entity);
		_entityManager.flush();
	}
	
} 
