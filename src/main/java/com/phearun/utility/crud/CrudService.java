package com.phearun.utility.crud;

import java.util.Collection;

import com.phearun.utility.pagable.Pagable;

public interface CrudService<PK, T> {

	boolean save(T t);

	boolean saveAll(Collection<T> t);

	boolean update(T t);

	boolean updateAll(Collection<T> t);

	boolean remove(PK key);

	boolean removeAll(Collection<PK> keys);

	Collection<T> findAll();

	Collection<T> findAll(Pagable pagable);

	T findOne(PK key);

}
