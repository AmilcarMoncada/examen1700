package hn.unah.lenguajes.examenprueba.demo.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examenprueba.demo.entities.Vehiculo;
import hn.unah.lenguajes.examenprueba.demo.repositories.VehiculoRepository;
import hn.unah.lenguajes.examenprueba.demo.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{


    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo CrearVehiculo(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public String EliminarVehiculo(int id) {
        this.vehiculoRepository.deleteById(id);
        return "Vehiculo Eliminado Correctamente";
    }

    @Override
    public Vehiculo BuscarVehiculo(int id) {
        return this.vehiculoRepository.findById(id).get();
    }

    @Override
    public List<Vehiculo> ObtenerVehiculos() {
        return (List<Vehiculo>) this.vehiculoRepository.findAll();
    }
    
}
