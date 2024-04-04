package hn.unah.lenguajes.examenprueba.demo.services;

import java.util.List;

import hn.unah.lenguajes.examenprueba.demo.entities.Vehiculo;

public interface VehiculoService {
    
    public Vehiculo CrearVehiculo (Vehiculo vehiculo);

    public String EliminarVehiculo (int id);

    public Vehiculo BuscarVehiculo (int id);

    public List<Vehiculo> ObtenerVehiculos ();
}
