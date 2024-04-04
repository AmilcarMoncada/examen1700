package hn.unah.lenguajes.examenprueba.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.examenprueba.demo.entities.Reserva;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva,Integer>{
    
    public void deleteByIdVehiculo(int idVehiculo);
}
