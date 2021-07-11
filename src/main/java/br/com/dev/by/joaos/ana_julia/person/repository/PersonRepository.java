package br.com.dev.by.joaos.ana_julia.person.repository;

import br.com.dev.by.joaos.ana_julia.person.model.Person;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long>, JpaSpecificationExecutor<Person> {

    List<Person> findAll();

}
