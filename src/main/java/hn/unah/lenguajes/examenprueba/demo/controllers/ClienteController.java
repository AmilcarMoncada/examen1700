package hn.unah.lenguajes.examenprueba.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examenprueba.demo.entities.Cliente;
import hn.unah.lenguajes.examenprueba.demo.services.implementations.ClienteServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/cliente/crear")
    public Cliente CrearCliente(@RequestBody Cliente Cliente) {
       return this.clienteServiceImpl.CrearCliente(Cliente);
    }

    @GetMapping("/cliente/obtener/{id}")
    public Cliente BuscarCliente(@PathVariable int id) {
        return this.clienteServiceImpl.BuscarCliente(id);
    }

    @GetMapping("/cliente/obtenertodos")
    public List<Cliente> ObtenerClientes() {
        return this.clienteServiceImpl.ObtenerClientes();
    }
    
    @DeleteMapping("/cliente/eliminar")
    public String BorrarCliente(@RequestParam int id){
        return this.clienteServiceImpl.BorrarCliente(id);
    }
    

}
