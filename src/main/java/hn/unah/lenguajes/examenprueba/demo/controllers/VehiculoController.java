package hn.unah.lenguajes.examenprueba.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examenprueba.demo.entities.Vehiculo;
import hn.unah.lenguajes.examenprueba.demo.services.implementations.VehiculoServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/api")
public class VehiculoController {
    
@Autowired
private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/vehiculo/crear")
    public Vehiculo CrearVehiculo(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoServiceImpl.CrearVehiculo(vehiculo);
    }

    @GetMapping("/vehiculo/buscar")
    public Vehiculo BuscarVehiculo(@RequestParam int id) {
        return this.vehiculoServiceImpl.BuscarVehiculo(id);
    }

    @GetMapping("/vehiculo/obtener")
    public List<Vehiculo> ObtenerVehiculos() {
        return this.vehiculoServiceImpl.ObtenerVehiculos();
    }
    
    @DeleteMapping("/vehiculo/eliminar")
    public String EliminarVehiculo(@RequestParam int id){
        return this.vehiculoServiceImpl.EliminarVehiculo(id);
    }
    
}
