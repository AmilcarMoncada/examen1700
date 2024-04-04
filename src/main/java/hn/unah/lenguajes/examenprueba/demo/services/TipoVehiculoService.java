package hn.unah.lenguajes.examenprueba.demo.services;

import hn.unah.lenguajes.examenprueba.demo.entities.TipoVehiculo;

public interface TipoVehiculoService {

    public TipoVehiculo CrearTipoVehiculo (TipoVehiculo tipoVehiculo);

    public String EliminarTipoVehiculo (int id);
}
