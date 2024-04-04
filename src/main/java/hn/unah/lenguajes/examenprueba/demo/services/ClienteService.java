package hn.unah.lenguajes.examenprueba.demo.services;

import java.util.List;

import hn.unah.lenguajes.examenprueba.demo.entities.Cliente;

public interface ClienteService {
    
    public Cliente CrearCliente (Cliente cliente);

    public Cliente BuscarCliente (int id);

    public List<Cliente> ObtenerClientes ();

    public String BorrarCliente (int id);

}
