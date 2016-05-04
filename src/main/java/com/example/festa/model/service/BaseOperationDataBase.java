package com.example.festa.model.service;

import java.util.Collection;

public interface BaseOperationDataBase<T> {

	public T save(T object);

	public T remove(T object);

	public T findById(T object);

	public Collection<T> findAll();

}
