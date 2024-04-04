package hn.unah.lenguajes.examenprueba.demo.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examenprueba.demo.entities.Cliente;
import hn.unah.lenguajes.examenprueba.demo.repositories.ClienteRepository;
import hn.unah.lenguajes.examenprueba.demo.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente CrearCliente(Cliente cliente) {
    return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente BuscarCliente(int id) {
    return this.clienteRepository.findById(id).get();
    }

    @Override
    public List<Cliente> ObtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public String BorrarCliente(int id) {
        this.clienteRepository.deleteById(id);
        return "Cliente Eliminado Correctamente";
    }
    
}
