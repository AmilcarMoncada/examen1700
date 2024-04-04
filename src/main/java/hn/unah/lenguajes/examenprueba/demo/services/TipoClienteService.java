package hn.unah.lenguajes.examenprueba.demo.services;

import hn.unah.lenguajes.examenprueba.demo.entities.TipoCliente;

public interface TipoClienteService {
    
    public TipoCliente CrearTipoCliente(TipoCliente tipoCliente);

    public String EliminarTipoCliente(int id);
}
