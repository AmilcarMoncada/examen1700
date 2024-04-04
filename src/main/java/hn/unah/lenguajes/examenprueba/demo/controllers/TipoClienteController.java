package hn.unah.lenguajes.examenprueba.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examenprueba.demo.entities.TipoCliente;
import hn.unah.lenguajes.examenprueba.demo.services.implementations.TipoClienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/tipocliente/crear")
    public TipoCliente CrearTipoCliente(@RequestBody TipoCliente tipoCliente ){
        return this.tipoClienteServiceImpl.CrearTipoCliente(tipoCliente);
    }

    @DeleteMapping("/tipocliente/eliminar")
    public String EliminarTipoCliente(@RequestParam int id){
        return this.tipoClienteServiceImpl.EliminarTipoCliente(id); 
    }
    
}
