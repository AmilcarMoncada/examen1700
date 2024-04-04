package hn.unah.lenguajes.examenprueba.demo.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examenprueba.demo.entities.Reserva;
import hn.unah.lenguajes.examenprueba.demo.entities.Vehiculo;
import hn.unah.lenguajes.examenprueba.demo.repositories.ReservaRepository;
import hn.unah.lenguajes.examenprueba.demo.repositories.VehiculoRepository;
import hn.unah.lenguajes.examenprueba.demo.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{

@Autowired
private ReservaRepository reservaRepository;

@Autowired
private VehiculoRepository vehiculoRepository;


    @Override
    public String CrearReserva(Reserva reserva) {
        int idVehiculoReservado = reserva.getIdVehiculo();
        Vehiculo VehiculoReservado = this.vehiculoRepository.findById(idVehiculoReservado).get();
        if(VehiculoReservado.getDisponible()==false){
            return "El Vehiculo ya se encuentra Rentado";
        }
        VehiculoReservado.setDisponible(false);
        Double precio= VehiculoReservado.getTipoVehiculo().getPrecioXhora();
        reserva.setTotal(reserva.getDias()*(precio*24));
        this.reservaRepository.save(reserva);
        return "Reserva realizada correctamente";
    }
    

}
