package hn.unah.lenguajes.examenprueba.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.examenprueba.demo.entities.TipoVehiculo;

@Repository
public interface TipoVehiculoRepository extends CrudRepository<TipoVehiculo, Integer>{
    
}
