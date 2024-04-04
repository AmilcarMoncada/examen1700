package hn.unah.lenguajes.examenprueba.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.examenprueba.demo.entities.TipoVehiculo;
import hn.unah.lenguajes.examenprueba.demo.entities.Vehiculo;
import java.util.List;


@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo,Integer> {
    
    public void deleteByTipoVehiculo(TipoVehiculo tipoVehiculo);

    public List<Vehiculo> findByTipoVehiculo(TipoVehiculo tipoVehiculo);
}
