package com.example.festa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.festa.model.entity.Convidado;

@Repository
public interface PersonRepository extends JpaRepository<Convidado, Long> {

}
