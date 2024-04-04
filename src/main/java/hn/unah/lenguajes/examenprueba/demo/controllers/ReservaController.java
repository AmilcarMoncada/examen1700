package hn.unah.lenguajes.examenprueba.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examenprueba.demo.entities.Reserva;
import hn.unah.lenguajes.examenprueba.demo.services.implementations.ReservaServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class ReservaController {
    
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("/reserva/crear")
    public String CrearReserva(@RequestBody Reserva reserva){
        return this.reservaServiceImpl.CrearReserva(reserva);
    }
    

}
