package hn.unah.lenguajes.examenprueba.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.examenprueba.demo.entities.TipoCliente;

@Repository
public interface TipoClienteRepository extends CrudRepository<TipoCliente, Integer> {
    
}
