package com.example.festa.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.festa.model.entity.Convidado;
import com.example.festa.model.repository.PersonRepository;

@Service
public class ConvidadoService implements BaseOperationDataBase<Convidado> {

	@Autowired
	private PersonRepository repository;

	@Override
	public Convidado save(Convidado object) {
		object = repository.saveAndFlush(object);
		System.out.println(object);
		return object;
	}

	@Override
	public Convidado remove(Convidado object) {
		repository.delete(object);
		return findById(object);

	}

	@Override
	public Convidado findById(Convidado object) {
		return repository.findOne(object.getId());
	}

	@Override
	public Collection<Convidado> findAll() {
		return repository.findAll();
	}

}
