package com.estagiarios.smtt.consultmototaxi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.estagiarios.smtt.consultmototaxi.model.Name;

public interface NameRepository extends CrudRepository<Name, Long>{
    List<Name> findByNome(String nome);
}
