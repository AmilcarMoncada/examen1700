package hn.unah.lenguajes.examenprueba.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examenprueba.demo.entities.TipoVehiculo;
import hn.unah.lenguajes.examenprueba.demo.services.implementations.TipoVehiculoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class TipoVehiculoController {
    

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/tipovehiculo/crear")
    public TipoVehiculo CrearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoServiceImpl.CrearTipoVehiculo(tipoVehiculo);
    }

    @DeleteMapping("/tipovehiculo/eliminar/{id}")
    public String EliminarTipoVehiculo(@PathVariable int id){
    return this.tipoVehiculoServiceImpl.EliminarTipoVehiculo(id);
}
}
